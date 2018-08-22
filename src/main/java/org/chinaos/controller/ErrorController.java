package org.chinaos.controller;

import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class ErrorController {

    @RequestMapping("/404")
    public void unmappedRequest(HttpServletRequest request, HttpServletResponse response) {
        String uri = request.getRequestURI();
        response.setStatus(HttpServletResponse.SC_OK);
//        throw new UnknownResourceException("你确定接口地址写对了？我还没写这个接口呢");
    }

    @RequestMapping("/500")
    public void handlerFilterError(HttpServletRequest request){
        Throwable t = (Throwable) request.getAttribute("javax.servlet.error.exception");
        throw new BadCredentialsException(t.getMessage());
    }

}