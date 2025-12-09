package com.example.practiceapplication;

import android.content.Context;
import android.content.SharedPreferences;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class AppData {
    public static ArrayList<User> users = new ArrayList<>();

    public static ArrayList<Criminal> criminalArrayList = new ArrayList<>();
    public static ArrayList<fir> firArrayList=new ArrayList<>();



    public static User currentUser = null;

    public static void saveUsers(Context context)
    {
        SharedPreferences preferences = context.getSharedPreferences("MyPref",context.MODE_PRIVATE);
        SharedPreferences.Editor e = preferences.edit();
        Gson g = new Gson();
        String s = g.toJson(users);
        String s1 = g.toJson(currentUser);
        String c = g.toJson(criminalArrayList);
        String f = g.toJson(firArrayList);


        e.putString("users",s);
        e.putString("criminalArrayList",c);
        e.putString("firArrayList",f);

        e.putString("currentUser",s1);
        e.apply();

    }

    public static void loadUsers(Context context)
    {
        SharedPreferences preferences = context.getSharedPreferences("MyPref",context.MODE_PRIVATE);

        Gson g = new Gson();
        String s = preferences.getString("users",null);
        String c = preferences.getString("criminalArrayList",null);
        String f = preferences.getString("firArrayList",null);

        if(s!=null)
        {
            Type t = new TypeToken<ArrayList<User>>(){}.getType();
            users = g.fromJson(s,t);

            Type t1 = new TypeToken<ArrayList<Criminal>>(){}.getType();
            criminalArrayList = g.fromJson(c,t1);

            Type t2 = new TypeToken<ArrayList<fir>>(){}.getType();
            firArrayList = g.fromJson(f,t2);
        }
        else
        {
            users = new ArrayList<>();
            criminalArrayList = new ArrayList<>();
            firArrayList = new ArrayList<>();
        }
    }
}
