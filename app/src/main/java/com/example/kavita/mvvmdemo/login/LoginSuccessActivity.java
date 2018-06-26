/**
 * @file LoginSuccessActivity.java
 * @brief This activity is displayed if user is validated successfully.
 * @author Kavita
 * @date 22/06/2018
 */

package com.example.kavita.mvvmdemo.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.kavita.mvvmdemo.R;

public class LoginSuccessActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_success);
    }
}
