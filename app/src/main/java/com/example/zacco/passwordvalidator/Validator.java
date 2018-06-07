package com.example.zacco.passwordvalidator;

public class Validator {
    private String password;
    private int pass = 5; //5 cases to pass

    public void setPassword(String s)
    {
        password = s;
    }

    public String getPassword()
    {
        return password;
    }

    public int validate() {

        //check if the string is "password"
        if (password.equalsIgnoreCase("password"))
            pass--;
        //check if the length of the string is less than 8 characters long
        if (password.length() < 8)
            pass--;
        //check if the length of the string is greater than 15 characters long
        if (password.length() > 15)
            pass++;
        //check string for upper-case and lower-case character
        if (password.equals(password.toLowerCase()) || password.equals(password.toUpperCase()))
            pass--;
        //check string for at least 1 digit (before or after)
        if (!password.matches(".*\\d.*"))
            pass--;
        //check string for a special character (!, @, #, $, %, ^, &, *)
        if (!password.matches(".*[!@#$%^&*].*"))
            pass--;

        return pass;
    }
}
