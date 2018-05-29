package com.example.zacco.passwordvalidator;

public class Validator {
    public int validator(String s)
    {
        int pass = 2;
        if (s.equals("password"))
            pass--;
        if (s.length() < 8)
            pass--;
        return pass;
    }
}
