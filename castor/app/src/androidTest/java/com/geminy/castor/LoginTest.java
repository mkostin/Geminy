package com.geminy.castor;

import android.support.test.runner.AndroidJUnit4;
import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.SmallTest;

import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;

/**
 * Sample test
 *
 * Annotated with Android test annotations
 *
 * Created by Max Kostin on 26.04.2015.
 */
@RunWith(AndroidJUnit4.class)
@SmallTest
public class LoginTest extends ActivityInstrumentationTestCase2<LoginActivity> {

    public LoginTest() {
        super(LoginActivity.class);
    }

    public LoginTest(Class<LoginActivity> activityClass) {
        super(activityClass);
    }

    @Override
    public void setUp() throws Exception {
        super.setUp();
        getActivity();
    }

    public void testWidWing() {
        onView(ViewMatchers.withId(R.id.email_sign_in_button))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }

    @Override
    public void tearDown() throws Exception {
        super.tearDown();
    }
}
