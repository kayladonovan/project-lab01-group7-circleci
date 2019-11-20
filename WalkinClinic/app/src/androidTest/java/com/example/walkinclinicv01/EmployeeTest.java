package com.example.walkinclinicv01;


import androidx.test.annotation.UiThreadTest;
import androidx.test.rule.ActivityTestRule;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;


public class EmployeeTest {

    @Rule
    public ActivityTestRule<EmployeeScreen> myActivityTestRule = new ActivityTestRule<EmployeeScreen>(EmployeeScreen.class);
    private EmployeeScreen myActivity=null;

    @Before
    public void setUp(){
        myActivity = myActivityTestRule.getActivity();
    }


    @Test
    @UiThreadTest

    public void EmployeeSignout() throws Exception{


        myActivity.runOnUiThread(new Runnable() {

            @Override
            public void run() {

                // Stuff that updates the UI
                myActivity.findViewById(R.id.signOut2).performClick();

            }
        });


    }


}
