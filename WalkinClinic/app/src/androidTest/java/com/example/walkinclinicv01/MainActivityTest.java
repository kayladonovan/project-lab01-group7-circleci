package com.example.walkinclinicv01;

import androidx.test.annotation.UiThreadTest;
import androidx.test.rule.ActivityTestRule;

import android.widget.TextView;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> myActivityTestRule= new ActivityTestRule(MainActivity.class);

    private MainActivity myActivity=null;
    private TextView text;
    private TextView text2;


    @Before
    public void setUp() throws Exception{
        myActivity=myActivityTestRule.getActivity();
    }

    @Test
    @UiThreadTest

    public void adminlogin() throws Exception{

        text=myActivity.findViewById(R.id.username);
        text.setText("qwe@gmail.com");

        text2=myActivity.findViewById(R.id.password);
        text2.setText("123456");



    }







}
