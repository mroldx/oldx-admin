package com.oldx.web.test;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class pwd {

    public static void main(String[] args) {
        String pass = "admin";
        BCryptPasswordEncoder bcryptPasswordEncoder = new BCryptPasswordEncoder();
        String hashPass = bcryptPasswordEncoder.encode(pass);
        System.out.println(hashPass);

        boolean f = bcryptPasswordEncoder.matches("admin",hashPass);
        System.out.println(f);

    }

}
