package com.example.walkinclinicv01;

public class Clinic {
    Info info;
    String USERID;
    public Clinic(Info info, String USERID){
        this.info = info;
        this.USERID = USERID;
    }
    public Clinic(){}

    public Info getInfo(){ return info;}

    public String getUSERID(){return USERID;}

}
