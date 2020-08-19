package com.cn.context;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @description:
 * @author: helisen
 * @create: 2020-08-10 12:32
 **/
public class MyDataContextListener implements ServletContextListener {
    private ServletContext servletContext;
    //该方法在ServletContext启动后被调用，并准备好处理客户端请求
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        this.servletContext = sce.getServletContext();
        //实现自己的逻辑并将结果记录在属性中
        servletContext.setAttribute("myData", "this is myData");
    }

    //这个方法在ServletContext将要关闭的时候调用
    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        this.servletContext = null;
    }
}
