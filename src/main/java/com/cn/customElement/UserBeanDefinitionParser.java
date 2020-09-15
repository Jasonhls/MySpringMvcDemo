package com.cn.customElement;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;

/**
 * @description:
 * @author: helisen
 * @create: 2020-09-15 17:49
 **/
public class UserBeanDefinitionParser extends AbstractSingleBeanDefinitionParser {
    /**
     * Element对应的类
     * @param element
     * @return
     */
    @Override
    protected Class<?> getBeanClass(Element element) {
        return User.class;
    }

    /**
     * 从element中解析并提取对应的元素
     */
    @Override
    protected void doParse(Element element, BeanDefinitionBuilder builder) {
        String username = element.getAttribute("username");
        String email = element.getAttribute("email");
        //将提取的数据放入到BeanDefinitionBuilder中，待到完成所有bean的解析后统一注册到beanFactory中
        if(StringUtils.hasText(username)) {
            builder.addPropertyValue("username", username);
        }
        if(StringUtils.hasText(email)) {
            builder.addPropertyValue("email", email);
        }
    }
}
