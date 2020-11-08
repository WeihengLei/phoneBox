package com.phonebox.cms.service.impl;

import com.phonebox.cms.service.CmsService;
import com.phonebox.core.entity.Account;
import com.phonebox.core.repository.AccountRepository;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

@Service
public class CmsServiceImpl implements CmsService {

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
