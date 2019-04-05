package com.chen.dao;

import com.chen.domian.Account;

/**
 * @author chenyong uthor: chen
 * @date : 2019/4/4
 */
public interface IAccountDao {

    Account findAccountById(Integer accountId);
    Account findAccountByName(String accountName);

    /**
     * 更新账户
     * @param account
     */
    void updateAccount(Account account);
}
