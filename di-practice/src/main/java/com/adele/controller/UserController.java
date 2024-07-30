package com.adele.controller;

import com.adele.annotation.Controller;
import com.adele.annotation.Inject;
import com.adele.service.UserService;

@Controller
public class UserController {
    private final UserService userService;


    @Inject
    public UserController(UserService userService) {
        this.userService = userService;
    }

    public UserService getUserService() {
        return userService;
    }
}
