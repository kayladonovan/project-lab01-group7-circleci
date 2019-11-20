package com.example.walkinclinicv01;

public class Hours {
    String open;
    String close;

    public Hours(String open, String close){
        this.close = close;
        this.open = open;
    }

    public String getOpen(){
        return open;
    }

    public String getClose(){
        return close;
    }

}
