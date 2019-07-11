package com.example.helloworld;



import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;

import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

import android.support.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;


public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityActivityTestRuleactivityRule = new ActivityTestRule(MainActivity.class);
    private String nName="Welcome Sylvester to our Espresso Ui Test";

    @Before
    public void setUp() throws Exception {
    }
    @Test
    public void testUserInterfaceScenario(){
        //input some text
        Espresso.onView(withId(R.id.editText)).perform(typeText(nName));
        //close keyboard
        Espresso.closeSoftKeyboard();
        //perfom click event
        Espresso.onView(withId(R.id.button)).perform(click());
        //see text in textview
        Espresso.onView(withId(R.id.textView)).check(matches(withText(nName)));
    }
    @After
    public void tearDown() throws Exception {
    }
}