package com.movies.acmeflix.service;

import com.movies.acmeflix.model.Account;

public interface AccountService extends BaseService<Account,Long> {

    Account findByEmail(String email);

}
