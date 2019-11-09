package com.example.walkinclinicv01;




import android.widget.Button;
import android.widget.TextView;

import androidx.test.annotation.UiThreadTest;
import androidx.test.rule.ActivityTestRule;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> myActivityTestRule= new ActivityTestRule(MainActivity.class);

    private MainActivity myActivity=null;
    private TextView text;
    private TextView text2;
    private Button login;


    @Before
    public void setUp() {
        myActivity=myActivityTestRule.getActivity();
    }

    @Test
    @UiThreadTest

    public void adminlogin() throws Exception{

        text=myActivity.findViewById(R.id.username);
        text.setText("qwe@gmail.com");

        text2=myActivity.findViewById(R.id.password);
        text2.setText("123456");

        login=myActivity.findViewById(R.id.signIn);

        login.performClick();



    }







}
