package com.example.practiceapplication;

public class fir {
    String complaintname, date, crimetype, location, subarea, address, suspectname, description;

    public fir(String complaintname, String date, String crimetype,
               String location, String subarea, String address,
               String suspectname, String description) {
        this.complaintname = complaintname;
        this.date = date;
        this.crimetype = crimetype;
        this.location = location;
        this.subarea = subarea;
        this.address = address;
        this.suspectname = suspectname;
        this.description = description;
    }

    public String getComplaintname() {
        return complaintname;
    }

    public void setComplaintname(String complaintname) {
        this.complaintname = complaintname;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCrimetype() {
        return crimetype;
    }

    public void setCrimetype(String crimetype) {
        this.crimetype = crimetype;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getSubarea() {
        return subarea;
    }

    public void setSubarea(String subarea) {
        this.subarea = subarea;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSuspectname() {
        return suspectname;
    }

    public void setSuspectname(String suspectname) {
        this.suspectname = suspectname;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
