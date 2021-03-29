package com.cn.transactionManager;

import com.cn.transactionManager.config.DataSourceConfiguration;
import com.cn.transactionManager.service.AccountService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AccountServiceImplTest {

    /**
     * xml的方式
     */
    @Test
    public void addAccountByXml() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("transactionManager/spring-tx.xml");
        AccountService service = context.getBean(AccountService.class);
        service.addAccount("tom", 22222);
    }

    /**
     * java configuration的方式
     */
    @Test
    public void addAccountByJavaConfig() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DataSourceConfiguration.class);
        AccountService service = context.getBean(AccountService.class);
        service.addAccount("James", 55555);
    }
}
