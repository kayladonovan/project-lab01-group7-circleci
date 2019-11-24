package com.example.walkinclinicv01;

public class Clinic {
    Info info;
    String USERID;
    Feedback feedback;
    public Clinic(Info info, String USERID){
        this.info = info;
        this.USERID = USERID;
        feedback = new Feedback(5,0);
    }
    public Clinic(){}

    public Info getInfo(){ return info;}

    public String getUSERID(){return USERID;}

}
