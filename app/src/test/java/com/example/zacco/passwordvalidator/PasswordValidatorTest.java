package com.example.zacco.passwordvalidator;

import android.content.Intent;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class PasswordValidatorTest {

    ActivityTestRule<PasswordValidator> activityTestRule =
            new ActivityTestRule<>(PasswordValidator.class)

    private String mStringToBetyped;

    @Before
    public void initValidString() {
        // Specify a valid string.
        mStringToBetyped = "Espresso";
    }

    @Test
    public void changeText_sameActivity() {
        activityTestRule.launchActivity(new Intent());
        // Type text and then press the button.
        onView(withId(R.id.editText))
                .perform(typeText(mStringToBetyped), closeSoftKeyboard());
        onView(withId(R.id.button)).perform(click());
    }
}
