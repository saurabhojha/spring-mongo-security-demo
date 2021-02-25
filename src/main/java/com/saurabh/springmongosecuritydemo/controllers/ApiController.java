package com.saurabh.springmongosecuritydemo.controllers;

import com.saurabh.springmongosecuritydemo.models.User;
import com.saurabh.springmongosecuritydemo.repositories.ApiUsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/")
public class ApiController {

    @GetMapping("/user")
    public String user() { return "USER LEVEL ACCESS"; }

    @GetMapping("/admin")
    public String admin() {
        return "ADMIN LEVEL ACCESS";
    }

    @GetMapping("/common")
    public String common() { return "COMMON LEVEL ACCESS"; }


}
