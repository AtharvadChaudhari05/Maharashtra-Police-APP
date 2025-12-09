package com.example.practiceapplication;

public class Criminal
{
    String name, crimeType, date, details;

    public Criminal(String name, String crimeType, String date, String details) {
        this.name = name;
        this.crimeType = crimeType;
        this.date = date;
        this.details = details;
    }

    public String getCrimeType() {
        return crimeType;
    }

    public void setCrimeType(String crimeType) {
        this.crimeType = crimeType;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
