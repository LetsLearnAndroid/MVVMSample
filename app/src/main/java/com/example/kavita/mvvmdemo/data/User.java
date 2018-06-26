/**
 * @file User.java
 * @brief This is Java Bean (POJO) class.
 * @author Kavita
 * @date 22/06/2018
 */

package com.example.kavita.mvvmdemo.data;

public class User {

    // Members
    protected String userName;
    protected String password;

    /**
     * Constructor
     */
    public User(String userName, String password)
    {
        this.userName = userName;
        this.password = password;
    }

    /**
     * Getters and Setters for members.
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return userName;
    }
}
