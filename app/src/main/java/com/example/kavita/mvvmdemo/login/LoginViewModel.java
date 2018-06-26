/**
 * @file LoginViewModel.java
 * @brief This call plays role of ViewModel for Login functionality. It provides all necessary data binding and actions for View.
 * @author Kavita
 * @date 22/06/2018
 */

package com.example.kavita.mvvmdemo.login;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.view.View;

import com.example.kavita.mvvmdemo.BR;

public class LoginViewModel extends BaseObservable {

    // Member Variables.
    private LoginDataModel oUser;
    private LoginNavigator mLoginNavigator;

    /**
     *  Constructor
     */
    public LoginViewModel()
    {
        oUser = new LoginDataModel("sample", "dummy");
    }

    /**
     * Set username.
     */
    public void setUserName(String unm)
    {
        oUser.setUserName(unm);
        notifyPropertyChanged(BR.userName);
    }

    /**
     * Get username.
     */
    @Bindable
    public String getUserName()
    {
        return oUser.getUserName();
    }

    /**
     * Set password
     */
    public void setPassword(String pwd)
    {
        oUser.setPassword(pwd);
        notifyPropertyChanged(BR.password);
    }

    /**
     * Get password
     */
    @Bindable
    public String getPassword()
    {
        return oUser.getPassword();
    }

    /**
     * Sets login task navigation call back.
     * Should be called when associated activity is created and viewModel is bound to activity.
     */
    void onActivityCreated(LoginNavigator navigator) {
        mLoginNavigator = navigator;
    }

    /**
     * Resets login task navigation call back. Should be called when associated activity is destroyed.
     */
    void onActivityDestroyed() {
        // Clear references to avoid potential memory leaks.
        mLoginNavigator = null;
    }

    /**
     * Returns OnClick listener for Login Button.
     */
    public View.OnClickListener onLoginClicked()
    {
        return  new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(oUser.isValidUsername() && oUser.isValidPassword())
                {
                    if(oUser.isUserAuthenticated())
                    {
                        // Login successful callback.
                        mLoginNavigator.onLoginSuccessful();
                    }
                    else {
                        // Login error.
                        String errorMessage = "Incorrect username or password";
                        mLoginNavigator.onError(errorMessage);
                    }
                }
                else {
                    // Login error.
                    String errorMessage = "Both username and password are required";
                    mLoginNavigator.onError(errorMessage);
                }
            }
        };
    }

    /**
     * Returns OnClick listener for Cancel Button.
     */
    public View.OnClickListener onCancelClicked()
    {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Login cancelled callback.
                mLoginNavigator.onLoginCancelled();
            }
        };
    }
}
