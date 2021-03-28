package com.cn.transactionManager;

import com.cn.transactionManager.service.AccountService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AccountServiceImplTest {
    @Test
    public void addAccount() {
        /**
         * xml的方式
         */
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("transactionManager/spring-tx.xml");
        /**
         * java configuration的方式
         */
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DataSourceConfiguration.class);
        AccountService service = context.getBean(AccountService.class);
        service.addAccount("hls", 20000);
    }
}
