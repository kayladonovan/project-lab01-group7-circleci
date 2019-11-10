package com.example.walkinclinicv01;

import android.app.Activity;
import android.app.Instrumentation;

import androidx.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.platform.app.InstrumentationRegistry.getInstrumentation;
import static org.junit.Assert.*;

public class ALtMainActivityTestz {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule= new ActivityTestRule<MainActivity>(MainActivity.class);

    private MainActivity mActivity=null;

    Instrumentation.ActivityMonitor monitor =getInstrumentation().addMonitor(AdminScreen.class.getName(),null,false);


    @Before
    public void setUp() throws Exception{
        mActivity=mActivityTestRule.getActivity();

    }

    @Test
    public void checkad() {

        onView(withId(R.id.username)).perform(typeText("qwe@gmail.com"),closeSoftKeyboard());
        onView(withId(R.id.password)).perform(typeText("123456"),closeSoftKeyboard());
        onView(withId(R.id.signIn)).perform(click());
        mActivity.findViewById(R.id.signIn);

        Activity adminactivty = getInstrumentation().waitForMonitorWithTimeout(monitor,5000);

        assertNotNull(adminactivty);

        adminactivty.finish();


    }


    @After
    public  void tearDown() throws Exception{

        mActivity=null;

    }
}