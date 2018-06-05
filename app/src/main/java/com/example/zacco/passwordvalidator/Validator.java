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
        if (password.equalsIgnoreCase("password")) //check if the string is "password"
        {
            pass--;
            System.out.println("Invalid password. Cannot be \"password\"");
        }
        if (password.length() < 8) //check if the length of the string is less than 8 characters long
        {
            pass--;
            System.out.println("Invalid password. Must contain at least 8 characters.");
        }
        if (password.equals(password.toLowerCase()) && password.equals(password.toUpperCase())) //check string for upper-case and lower-case character
        {
            pass--;
            System.out.println("Invalid password. Must contain at least one upper-case and one lower-case character.");
        }
        if (!password.matches(".*\\d.*")) //check string for at least 1 digit (before or after)
        {
            pass--;
            System.out.println("Invalid password. Must contain at least 1 digit.");
        }
        if (!password.matches(".*[!@#$%^&*].*")) //check string for a special character (!, @, #, $, %, ^, &, *)
        {
            pass--;
            System.out.println("Invalid password. Must contain a special character.");
        }
        return pass;
    }
}
