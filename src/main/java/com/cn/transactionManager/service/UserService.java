package com.cn.transactionManager.service;

/**
 * @description:
 * @author: helisen
 * @create: 2021-04-02 13:42
 **/
public interface UserService {
    /*-------------------------------required---------------------------------*/

    void no_transaction_exception_required_required();
    void no_transaction_required_required_exception();

    void transaction_exception_required_required();
    void transaction_required_required_exception();
    void transaction_required_required_exception_try();

    /*-------------------------------requires_new---------------------------------*/

    void no_transaction_exception_requiresNew_requiresNew();
    void no_transaction_requiresNew_requiresNew_exception();

    void transaction_exception_required_requiresNew_requiresNew();
    void transaction_required_requiresNew_requiresNew_exception();
    void transaction_required_requiresNew_requiresNew_exception_try();

    /*-------------------------------nested---------------------------------*/

    void no_transaction_exception_nested_nested();
    void no_transaction_nested_nested_exception();

    void transaction_exception_nested_nested();
    void transaction_nested_nested_exception();
    void transaction_nested_nested_exception_try();
}
