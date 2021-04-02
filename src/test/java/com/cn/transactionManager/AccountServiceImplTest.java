package com.cn.transactionManager;

import com.cn.pojo.User1;
import com.cn.transactionManager.config.DataSourceConfiguration;
import com.cn.transactionManager.service.AccountService;
import com.cn.transactionManager.service.User1Service;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AccountServiceImplTest {

    /**
     * xml的方式，通过开启事务的注解支持，然后在方法上添加@Transactional注解，来开启事务支持
     */
    @Test
    public void addAccountByXml() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("transactionManager/spring-tx.xml");
        AccountService service = context.getBean(AccountService.class);
        service.addAccount("tom", 22222);
    }

    /**
     * xml的方式，通过配置事务切面和切点的方式，来开启事务支持
     */
    @Test
    public void addAccountByXml2() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("transactionManager/spring-tx2.xml");
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

    /**
     * 同一个类的内部方法调用，@Transactional注解不生效
     *
     */

    @Test
    public void testUneffectiveTransaction() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DataSourceConfiguration.class);
        User1Service user1Service = context.getBean(User1Service.class);

        User1 user1 = new User1();
        user1.setName("hls");
        user1Service.addTest(user1);
    }

    /**
     * 这样事务是生效的，利用spring上下文的getBean获取service的代理类
     */
    @Test
    public void testEffectiveTransaction() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DataSourceConfiguration.class);
        User1Service user1Service = context.getBean(User1Service.class);

        User1 user1 = new User1();
        user1.setName("hls");
        user1Service.addTest2(user1);
    }

    /**
     * 或者换个类调用这个类加了事务注解的方法
     */
    @Test
    public void testEffectiveTransaction2() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DataSourceConfiguration.class);
        AccountService accountService = context.getBean(AccountService.class);

        User1 user1 = new User1();
        user1.setName("hls");
        accountService.addTest(user1);
    }
}
