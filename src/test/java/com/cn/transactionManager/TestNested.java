package com.cn.transactionManager;

import com.cn.transactionManager.config.DataSourceConfiguration;
import com.cn.transactionManager.service.UserService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @description:
 * @author: helisen
 * @create: 2021-04-02 14:14
 **/
public class TestNested {

    /*------------------------------
    结论：
    通过这两个方法我们证明了在外围方法未开启事务的情况下Propagation.NESTED和Propagation.REQUIRED作用相同，
    修饰的内部方法都会新开启自己的事务，且开启的事务相互独立，互不干扰。
    ---------------------------------*/

    /**
     * “张三”、“李四”均插入。
     * 外围方法未开启事务，插入“张三”、“李四”方法在自己的事务中独立运行，外围方法异常不影响内部插入“张三”、“李四”方法独立的事务。
     */
    @Test
    public void no_transaction_exception_nested_nested() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DataSourceConfiguration.class);
        UserService userService = context.getBean(UserService.class);
        userService.no_transaction_exception_nested_nested();
    }

    /**
     * “张三”插入，“李四”未插入。
     * 外围方法没有事务，插入“张三”、“李四”方法都在自己的事务中独立运行,所以插入“李四”方法抛出异常只会回滚插入“李四”方法，插入“张三”方法不受影响。
     */
    @Test
    public void no_transaction_nested_nested_exception() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DataSourceConfiguration.class);
        UserService userService = context.getBean(UserService.class);
        userService.no_transaction_nested_nested_exception();
    }

    /*------------------------------
    结论：
    通过这两个方法我们证明了在外围方法未开启事务的情况下Propagation.NESTED和Propagation.REQUIRED作用相同，
    修饰的内部方法都会新开启自己的事务，且开启的事务相互独立，互不干扰。
    ---------------------------------*/

    /**
     * 	“张三”、“李四”均未插入。
     * 	外围方法开启事务，内部事务为外围事务的子事务，外围方法回滚，内部方法也要回滚。
     */
    @Test
    public void transaction_exception_nested_nested() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DataSourceConfiguration.class);
        UserService userService = context.getBean(UserService.class);
        userService.transaction_exception_nested_nested();
    }

    /**
     * “张三”、“李四”均未插入。
     * 外围方法开启事务，内部事务为外围事务的子事务，内部方法抛出异常回滚，且外围方法感知异常致使整体事务回滚。
     */
    @Test
    public void transaction_nested_nested_exception() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DataSourceConfiguration.class);
        UserService userService = context.getBean(UserService.class);
        userService.transaction_nested_nested_exception();
    }

    /**
     * “张三”插入、“李四”未插入。
     * 外围方法开启事务，内部事务为外围事务的子事务，插入“张三”内部方法抛出异常，可以单独对子事务回滚。
     *
     */
    @Test
    public void transaction_nested_nested_exception_try() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DataSourceConfiguration.class);
        UserService userService = context.getBean(UserService.class);
        userService.transaction_nested_nested_exception_try();
    }




}
