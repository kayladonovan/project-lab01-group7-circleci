package com.example.walkinclinicv01;

import androidx.test.annotation.UiThreadTest;
import androidx.test.rule.ActivityTestRule;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;



public class ViewHoursTest {
    @Rule
    public ActivityTestRule<ListOfHours> HourActivityTest = new ActivityTestRule<ListOfHours>(ListOfHours.class);
    private  ListOfHours HourActivity=null;

    @Before
    public void setUp(){

        HourActivity = HourActivityTest.getActivity();
    }

    @Test
    @UiThreadTest
    public void cancel() throws Exception{

        HourActivity.runOnUiThread(new Runnable() {

            @Override
            public void run() {

                // Stuff that updates the UI
                HourActivity.findViewById(R.id.cancelBtn5).performClick();

            }
        });
    }



}
