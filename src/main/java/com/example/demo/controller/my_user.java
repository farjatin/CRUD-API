package com.example.demo.controller;


import com.example.demo.domain.User;
import com.example.demo.service.UserService;
import com.sun.xml.internal.bind.v2.TODO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class my_user {


    private List<User> userList = new ArrayList<User>();

    @Autowired
    UserService userservice;

    @RequestMapping(value = "/adduser", method = RequestMethod.POST)
    public void add_user(@RequestBody User new_user)
    {

        //userList.add(new_user);
        //return userList;
        userservice.create(new_user);

    }

    @RequestMapping(value = "/addusers", method = RequestMethod.POST)
    public void add_users(@RequestBody List<User> temp_list)
    {
        //userList.addAll(temp_list);
        //return userList;
        for(User user:temp_list)
        {
            userservice.create(user);
        }

    }


    @RequestMapping(value = "/listusers", method = RequestMethod.GET)
    public List<User> list_user()
    {
        //return userList;
        return userservice.getAll();

    }

    @RequestMapping(value = "/removeuser", method = RequestMethod.GET)
    public void remove_user(@RequestParam Long id)
    {
        //return userList;
        userservice.delete(id);
    }


}