package com.movies.acmeflix.services;

import com.movies.acmeflix.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountService extends BaseService<Account,Long> {
    JpaRepository<Account,Long> getRepository();

    Account findByEmail(String email);
}
