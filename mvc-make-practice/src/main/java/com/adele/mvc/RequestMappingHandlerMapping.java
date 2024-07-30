package com.adele.mvc;

import com.adele.mvc.controller.Controller;
import com.adele.mvc.controller.HomeController;

import java.util.HashMap;
import java.util.Map;

public class RequestMappingHandlerMapping {
    // [key]: /users [value]: UserController
    private Map<String, Controller> mappings = new HashMap<String, Controller>();

    void init() {
        mappings.put("/", new HomeController());
    }

    public Controller findHandler(String uriPath) {
        return mappings.get(uriPath);
    }


}
