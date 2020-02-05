package com.kyunghyun.user;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

public class PasswordTest {

    public static void main(String[] args){
        SimpleDateFormat sdf = new SimpleDateFormat("HHmmssSS");
        String passwordSalt = sdf.format(new Date());
        System.out.println("passwordSalt="+passwordSalt);

        String str = "test1345677!@#!@#";
        if(Pattern.matches("(?=.*\\d{1,50})(?=.*[~`!@#$%\\^&*()-+=]{1,50})(?=.*[a-zA-Z]{2,50}).{10,50}$", str)){
            System.out.println(str +" good password!!!");
        }else{
            System.out.println(str +" bad password!!!");
        }
    }
}
