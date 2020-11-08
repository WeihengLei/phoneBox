package com.phonebox.api.service.impl;

import com.phonebox.api.service.ApiService;
import com.phonebox.core.entity.Account;
import com.phonebox.core.repository.AccountRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service
public class ApiServiceImpl implements ApiService {

    @Resource
    private AccountRepository accountRepository;

    @Override
    public String test(String name) {
        Account account = new Account();
        account.setName(name);
        accountRepository.save(account);
        return account.toString();
    }
}
