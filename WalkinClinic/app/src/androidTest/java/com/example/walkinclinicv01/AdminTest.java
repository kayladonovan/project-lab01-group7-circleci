package com.example.walkinclinicv01;

import androidx.test.rule.ActivityTestRule;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

public class AdminTest {
    @Rule
    public ActivityTestRule<AdminScreen> mAdminTestRule = new ActivityTestRule<AdminScreen>(AdminScreen.class, true,false);
    private AdminScreen mAdmin = null;

    @Before
    public void setUp(){

        mAdmin = mAdminTestRule.getActivity();
    }

    @Test
    public void adminTestAddService() throws Exception{
        mAdmin.findViewById(R.id.addBtn).performClick();
    }
    @Test
    public void adminTestDeleteService() throws  Exception{
        mAdmin.findViewById(R.id.deleteBtn).performClick();
    }
    @Test
    public void adminTestEditService() throws Exception{
        mAdmin.findViewById(R.id.editBtn).performClick();
    }
    @Test
    public void adminTestRemoveUser() throws Exception{
        mAdmin.findViewById(R.id.removeUser).performClick();
    }

    @Test
    public void adminTestLogOut() throws  Exception{
        mAdmin.findViewById(R.id.logout).performClick();
    }
}
