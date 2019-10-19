package com.example.walkinclinicv01;

public class Patient {


    private String firstName;
    private String lastName;
    private String userName;
    private String password;

    public Patient( String firstName, String lastName, String userName, String password){
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.password = password;
    }
    public Patient(){}

    public String getFirstName(){ return firstName;}

    public String getLastName(){ return lastName;}

    public String getUserName(){ return userName;}

    public String getPassword(){ return password;}

}
