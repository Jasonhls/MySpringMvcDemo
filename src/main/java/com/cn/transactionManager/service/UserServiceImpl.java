package com.cn.transactionManager.service;

import com.cn.pojo.User1;
import com.cn.pojo.User2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @description:
 * @author: helisen
 * @create: 2021-04-02 13:42
 **/
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private User1Service user1Service;
    @Autowired
    private User2Service user2Service;

    /*-------------------------------------------------------------required------------------------------------------------------------------------*/

    /**
     * “张三”、“李四”均插入。
     * 外围方法未开启事务，插入“张三”、“李四”方法在自己的事务中独立运行，外围方法异常不影响内部插入“张三”、“李四”方法独立的事务。
     */
    @Override
    public void no_transaction_exception_required_required() {
        User1 user1 = new User1();
        user1.setName("张三");
        user1Service.addRequired(user1);

        User2 user2 = new User2();
        user2.setName("李四");
        user2Service.addRequired(user2);

        throw new RuntimeException();
    }

    /**
     * “张三”插入，“李四”未插入。
     * 外围方法没有事务，插入“张三”、“李四”方法都在自己的事务中独立运行，
     * 所以插入“李四”方法抛出异常只会回滚插入“李四”方法，插入“张三”方法不受影响。
     */
    @Override
    public void no_transaction_required_required_exception() {
        User1 user1 = new User1();
        user1.setName("张三2");
        user1Service.addRequired(user1);

        User2 user2 = new User2();
        user2.setName("李四2");
        user2Service.addRequiredException(user2);
    }


    /**
     * “张三”、“李四”均未插入。
     * 外围方法开启事务，内部方法加入外围方法事务，外围方法回滚，内部方法也要回滚。
     */
    @Override
    @Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRED)
    public void transaction_exception_required_required() {
        User1 user1 = new User1();
        user1.setName("张三3");
        user1Service.addRequired(user1);

        User2 user2 = new User2();
        user2.setName("李四3");
        user2Service.addRequired(user2);

        throw new RuntimeException();
    }

    /**
     * “张三”、“李四”均未插入。
     * 外围方法开启事务，内部方法加入外围方法事务，内部方法抛出异常回滚，外围方法感知异常致使整体事务回滚。
     */
    @Override
    @Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRED)
    public void transaction_required_required_exception() {
        User1 user1 = new User1();
        user1.setName("张三4");
        user1Service.addRequired(user1);

        User2 user2 = new User2();
        user2.setName("李四4");
        user2Service.addRequiredException(user2);
    }

    /**
     * “张三”、“李四”均未插入。
     *外围方法开启事务，内部方法加入外围方法事务，内部方法抛出异常回滚，即使方法被catch不被外围方法感知，整个事务依然回滚。
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public void transaction_required_required_exception_try() {
        User1 user1 = new User1();
        user1.setName("张三5");
        user1Service.addRequired(user1);

        User2 user2 = new User2();
        user2.setName("李四5");
        try {
            user2Service.addRequiredException(user2);
        } catch (Exception e) {
            System.out.println("方法回滚");
            e.printStackTrace();
        }
    }


    /*-------------------------------------------------------------requires_new------------------------------------------------------------------------*/

    /**
     * “张三”插入，“李四”插入。
     * 外围方法没有事务，插入“张三”、“李四”方法都在自己的事务中独立运行,外围方法抛出异常回滚不会影响内部方法。
     */
    @Override
    public void no_transaction_exception_requiresNew_requiresNew() {
        User1 user1=new User1();
        user1.setName("张三6");
        user1Service.addRequiresNew(user1);

        User2 user2=new User2();
        user2.setName("李四6");
        user2Service.addRequiresNew(user2);
        throw new RuntimeException();
    }

    /**
     * 	“张三”插入，“李四”未插入
     * 	外围方法没有开启事务，插入“张三”方法和插入“李四”方法分别开启自己的事务，插入“李四”方法抛出异常回滚，其他事务不受影响。
     */
    @Override
    public void no_transaction_requiresNew_requiresNew_exception() {
        User1 user1=new User1();
        user1.setName("张三7");
        user1Service.addRequiresNew(user1);

        User2 user2=new User2();
        user2.setName("李四7");
        user2Service.addRequiresNewException(user2);
    }

    /**
     * 	“张三”未插入，“李四”插入，“王五”插入。
     * 	外围方法开启事务，插入“张三”方法和外围方法一个事务，插入“李四”方法、插入“王五”方法分别在独立的新建事务中，
     * 	外围方法抛出异常只回滚和外围方法同一事务的方法，故插入“张三”的方法回滚。
     */
    @Override
    @Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRED)
    public void transaction_exception_required_requiresNew_requiresNew() {
        User1 user1=new User1();
        user1.setName("张三8");
        user1Service.addRequired(user1);

        User2 user2=new User2();
        user2.setName("李四8");
        user2Service.addRequiresNew(user2);

        User2 user3=new User2();
        user3.setName("王五8");
        user2Service.addRequiresNew(user3);
        throw new RuntimeException();
    }

    /**
     * 	“张三”未插入，“李四”插入，“王五”未插入。
     * 	外围方法开启事务，插入“张三”方法和外围方法一个事务，插入“李四”方法、插入“王五”方法分别在独立的新建事务中。
     * 	插入“王五”方法抛出异常，首先插入 “王五”方法的事务被回滚，异常继续抛出被外围方法感知，外围方法事务亦被回滚，故插入“张三”方法也被回滚。
     */
    @Override
    @Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRED)
    public void transaction_required_requiresNew_requiresNew_exception() {
        User1 user1=new User1();
        user1.setName("张三9");
        user1Service.addRequired(user1);

        User2 user2=new User2();
        user2.setName("李四9");
        user2Service.addRequiresNew(user2);

        User2 user3=new User2();
        user3.setName("王五9");
        user2Service.addRequiresNewException(user3);
    }

    /**
     * 	“张三”插入，“李四”插入，“王五”未插入
     * 	外围方法开启事务，插入“张三”方法和外围方法一个事务，插入“李四”方法、插入“王五”方法分别在独立的新建事务中。
     * 	插入“王五”方法抛出异常，首先插入“王五”方法的事务被回滚，异常被catch不会被外围方法感知，外围方法事务不回滚，故插入“张三”方法插入成功。
     */
    @Override
    @Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRED)
    public void transaction_required_requiresNew_requiresNew_exception_try() {
        User1 user1=new User1();
        user1.setName("张三10");
        user1Service.addRequired(user1);

        User2 user2=new User2();
        user2.setName("李四10");
        user2Service.addRequiresNew(user2);
        User2 user3=new User2();
        user3.setName("王五10");
        try {
            user2Service.addRequiresNewException(user3);
        } catch (Exception e) {
            System.out.println("回滚");
        }
    }

    /*-------------------------------------------------------------nested------------------------------------------------------------------------*/

    /**
     * “张三”、“李四”均插入。
     * 外围方法未开启事务，插入“张三”、“李四”方法在自己的事务中独立运行，外围方法异常不影响内部插入“张三”、“李四”方法独立的事务。
     */
    @Override
    public void no_transaction_exception_nested_nested() {
        User1 user1=new User1();
        user1.setName("张三11");
        user1Service.addNested(user1);

        User2 user2=new User2();
        user2.setName("李四11");
        user2Service.addNested(user2);
        throw new RuntimeException();
    }

    /**
     * “张三”插入，“李四”未插入。
     * 外围方法没有事务，插入“张三”、“李四”方法都在自己的事务中独立运行,所以插入“李四”方法抛出异常只会回滚插入“李四”方法，插入“张三”方法不受影响。
     */
    @Override
    public void no_transaction_nested_nested_exception() {
        User1 user1=new User1();
        user1.setName("张三12");
        user1Service.addNested(user1);

        User2 user2=new User2();
        user2.setName("李四12");
        user2Service.addNestedException(user2);
    }


    /**
     * 	“张三”、“李四”均未插入。
     * 	外围方法开启事务，内部事务为外围事务的子事务，外围方法回滚，内部方法也要回滚。
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public void transaction_exception_nested_nested() {
        User1 user1=new User1();
        user1.setName("张三13");
        user1Service.addNested(user1);

        User2 user2=new User2();
        user2.setName("李四13");
        user2Service.addNested(user2);
        throw new RuntimeException();
    }

    /**
     * “张三”、“李四”均未插入。
     * 外围方法开启事务，内部事务为外围事务的子事务，内部方法抛出异常回滚，且外围方法感知异常致使整体事务回滚。
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public void transaction_nested_nested_exception() {
        User1 user1=new User1();
        user1.setName("张三14");
        user1Service.addNested(user1);

        User2 user2=new User2();
        user2.setName("李四14");
        user2Service.addNestedException(user2);
    }

    /**
     * “张三”插入、“李四”未插入。
     * 外围方法开启事务，内部事务为外围事务的子事务，插入“张三”内部方法抛出异常，可以单独对子事务回滚。
     *
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public void transaction_nested_nested_exception_try() {
        User1 user1=new User1();
        user1.setName("张三");
        user1Service.addNested(user1);

        User2 user2=new User2();
        user2.setName("李四");
        try {
            user2Service.addNestedException(user2);
        } catch (Exception e) {
            System.out.println("方法回滚");
        }
    }
}
