/**
 * @file LoginDataModel.java
 * @brief This plays a role of Model for login functionality.
 * It extends User and provides additional functionality for validations.
 * @author Kavita
 * @date 22/06/2018
 */

package com.example.kavita.mvvmdemo.login;

import com.example.kavita.mvvmdemo.data.User;
import com.example.kavita.mvvmdemo.utilities.StringUtility;

public class LoginDataModel extends User {

    /**
     * Constructor
     */
    public LoginDataModel(String userName, String password)
    {
        super(userName, password);
    }

    /**
     * Check for non null and non empty user name
     */
    public boolean isValidUsername()
    {
       return !StringUtility.isNullOrEmpty(userName);
    }

    /**
     * Check for non null and non empty password
     */
    public boolean isValidPassword()
    {
        return !StringUtility.isNullOrEmpty(password);
    }

    /**
     * Checks whether user credentials are authenticated or not
     */
    public boolean isUserAuthenticated()
    {
        boolean bReturn = false;

        // Check whether valid credentials provided.
        if(userName.equals("admin") && password.equals("password"))
        {
            bReturn = true;
        }

        return bReturn;
    }
}
