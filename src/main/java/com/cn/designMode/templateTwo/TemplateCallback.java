package com.cn.designMode.templateTwo;

/**
 * @description:
 * @author: helisen
 * @create: 2020-09-01 09:47
 **/
public interface TemplateCallback<T> {
    T doCallback(Executor executor);
}
