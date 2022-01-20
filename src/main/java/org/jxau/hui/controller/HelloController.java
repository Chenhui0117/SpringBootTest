package org.jxau.hui.controller;

import org.jxau.hui.entity.User;
import org.jxau.hui.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {

    @Autowired
    private UserService service;

    @RequestMapping(path = {"/login"},method = {RequestMethod.GET})
    public String fun(){
        return "hello world!";
    }

    @RequestMapping(path = {"/selectAll"},method = {RequestMethod.POST})
    public List<User> selectAll(){
        return service.selectAll();
    }
}
