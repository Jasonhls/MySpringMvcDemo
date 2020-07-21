package com.cn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @description:
 * @author: helisen
 * @create: 2020-07-20 10:21
 **/
@Controller
public class IndexController {
    @RequestMapping(value = "/abc")
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception{
        ModelAndView model=new ModelAndView("abc");
        model.addObject("message","这是第一个SpringMVC网页");
        return model;
    }

    @RequestMapping(value = "/efg")
    public String getEfg() {
        return "efg";
    }
}
