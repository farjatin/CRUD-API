package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class test {

    @RequestMapping(value = "/greetings")
    public String func() {
        return "Hello World!";
    }


//    private class details {
//        public String Name;
//        public Integer Price;
//
//        details(String s, Integer i) {
//            Name = s;
//            Price = i;
//        }
//    }
//
//
//    details det = new details("abc", 10000);

//
//    @RequestMapping(value = "/details")
//    public details func2() {
//        return det;
//    }


    @RequestMapping(value = "/greetings2")
    String func3(@RequestParam String name) {
        return ("hello, " + name);
    }

}