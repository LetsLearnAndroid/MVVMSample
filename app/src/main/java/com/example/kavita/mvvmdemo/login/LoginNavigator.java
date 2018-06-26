/**
 * @file LoginNavigator.java
 * @brief This interface provides callback methods after Login navigation.
 * @author Kavita
 * @date 22/06/2018
 */

package com.example.kavita.mvvmdemo.login;

public interface LoginNavigator {
    void onLoginSuccessful();
    void onError(String errorMessage);
    void onLoginCancelled();
}
