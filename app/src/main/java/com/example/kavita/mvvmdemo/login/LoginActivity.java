/**
 * @file LoginActivity.java
 * @brief This activity plays role of View for Login functionality. It is bound to the ViewModel.
 * Implements the required user action callbacks and view related navigations.
 * @author Kavita
 * @date 22/06/2018
 */

package com.example.kavita.mvvmdemo.login;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.databinding.Observable;
import android.support.constraint.ConstraintLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.kavita.mvvmdemo.R;
import com.example.kavita.mvvmdemo.databinding.ActivityLoginBinding;
import com.example.kavita.mvvmdemo.utilities.StringUtility;

public class LoginActivity extends AppCompatActivity implements LoginNavigator {

    private static final String TAG = LoginActivity.class.getSimpleName();

    // Members.
    LoginViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Get binding for Login activity from layout resource.
        ActivityLoginBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_login);

        // Get view model and bind it using Data Binding.
        viewModel = new LoginViewModel();
        binding.setLoginViewModel(viewModel);

        // Register navigator for setting user action call backs.
        viewModel.onActivityCreated(this);
    }

    @Override
    protected void onDestroy() {
        // Remove navigator before view gets destroyed.
        viewModel.onActivityDestroyed();
        super.onDestroy();
    }

    /*****************************************************************************
     *
     * LOGIN NAVIGATOR INTERFACE IMPLEMENTATION
     *
     ****************************************************************************/

    @Override
    public void onLoginSuccessful() {
        Intent oIntent = new Intent(this, LoginSuccessActivity.class);
        this.startActivity(oIntent);

        this.finish();
    }

    @Override
    public void onError(String errorMessage) {
        ConstraintLayout oLayout = (ConstraintLayout) findViewById(R.id.constraintLayout);
        Snackbar.make(oLayout, errorMessage, Snackbar.LENGTH_LONG).show();

        Log.i(TAG, errorMessage);
    }

    @Override
    public void onLoginCancelled() {
        finish();
    }
}
