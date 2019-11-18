package com.example.walkinclinicv01;

public class Info {

    String name;
    String address;
    String phoneNumber;

    public Info(String name,String address, String phoneNumber){
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public Info(){}

    public String getAddress(){ return address; }
    public String getName(){ return name; }
    public String getPhoneNumber(){ return phoneNumber;}

}
