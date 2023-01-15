package com.movies.acmeflix.controller;
import com.movies.acmeflix.mapper.AccountMapper;
import com.movies.acmeflix.mapper.BaseMapper;
import com.movies.acmeflix.model.Account;
import com.movies.acmeflix.transfer.resources.AccountResource;
import com.movies.acmeflix.service.AccountService;
import com.movies.acmeflix.service.BaseService;
import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("accounts")
public class AccountController extends BaseController<Account, AccountResource> {
    private final AccountService accountService;
    private final AccountMapper accountMapper;

    @Override
    protected BaseService<Account, Long> getBaseService() {
        return accountService;
    }

    @Override
    protected BaseMapper<Account, AccountResource> getBaseMapper() {
        return accountMapper;
    }
}
