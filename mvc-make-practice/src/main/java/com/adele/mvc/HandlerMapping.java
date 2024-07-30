package com.adele.mvc;

import com.adele.mvc.controller.Controller;

public interface HandlerMapping {
    Object findHandler(HandlerKey handlerKey);
}
