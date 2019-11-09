package com.example.walkinclinicv01;

import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;




public class EspressoTest {


    @Rule
    public ActivityTestRule<MainActivity> mainActivityActivityTestRule=new ActivityTestRule<>(MainActivity.class);


    @Test
    public void adminlogin(){
        onView(withId(R.id.username)).perform(typeText("qwe@gmail.com"),closeSoftKeyboard());
        onView(withId(R.id.password)).perform(typeText("123456"),closeSoftKeyboard());

        onView(withId(R.id.signIn)).perform(click());
    }

    @Rule
    public ActivityTestRule<AdminScreen> mainActivityActivityTestRule2=new ActivityTestRule<>(AdminScreen.class);

    @Test
    public void selectAdminFunction(){

        onView(withId(R.id.addBtn)).perform(click());

    }


}
