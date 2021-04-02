package com.cn.transactionManager;

import com.cn.transactionManager.config.DataSourceConfiguration;
import com.cn.transactionManager.service.UserService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @description:
 * @author: helisen
 * @create: 2021-04-02 11:15
 **/
public class TestRequired {

    /*------------------------------
    结论：
    通过这两个方法我们证明了在外围方法未开启事务的情况下Propagation.REQUIRED修饰的内部方法会新开启自己的事务，且开启的事务相互独立，互不干扰。
    ---------------------------------*/

    /**
     * “张三”、“李四”均插入。
     * 外围方法未开启事务，插入“张三”、“李四”方法在自己的事务中独立运行，外围方法异常不影响内部插入“张三”、“李四”方法独立的事务。
     */
    @Test
    public void no_transaction_exception_required_required() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DataSourceConfiguration.class);
        UserService userService = context.getBean(UserService.class);
        userService.no_transaction_exception_required_required();
    }

    /**
     * “张三”插入，“李四”未插入。
     * 外围方法没有事务，插入“张三”、“李四”方法都在自己的事务中独立运行，
     * 所以插入“李四”方法抛出异常只会回滚插入“李四”方法，插入“张三”方法不受影响。
     */
    @Test
    public void no_transaction_required_required_exception() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DataSourceConfiguration.class);
        UserService userService = context.getBean(UserService.class);
        userService.no_transaction_required_required_exception();
    }

    /*------------------------------
    结论：
    以上试验结果我们证明在外围方法开启事务的情况下Propagation.REQUIRED修饰的内部方法会加入到外围方法的事务中，
    所有Propagation.REQUIRED修饰的内部方法和外围方法均属于同一事务，只要一个方法回滚，整个事务均回滚。
    ---------------------------------*/


    /**
     * “张三”、“李四”均未插入。
     * 外围方法开启事务，内部方法加入外围方法事务，外围方法回滚，内部方法也要回滚。
     */
    @Test
    public void transaction_exception_required_required() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DataSourceConfiguration.class);
        UserService userService = context.getBean(UserService.class);
        userService.transaction_exception_required_required();
    }

    /**
     * “张三”、“李四”均未插入。
     * 外围方法开启事务，内部方法加入外围方法事务，内部方法抛出异常回滚，外围方法感知异常致使整体事务回滚。
     */
    @Test
    public void transaction_required_required_exception() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DataSourceConfiguration.class);
        UserService userService = context.getBean(UserService.class);
        userService.transaction_required_required_exception();
    }

    /**
     * “张三”、“李四”均未插入。
     *外围方法开启事务，内部方法加入外围方法事务，内部方法抛出异常回滚，即使方法被catch不被外围方法感知，整个事务依然回滚。
     */
    @Test
    public void transaction_required_required_exception_try() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DataSourceConfiguration.class);
        UserService userService = context.getBean(UserService.class);
        userService.transaction_required_required_exception_try();
    }


}
