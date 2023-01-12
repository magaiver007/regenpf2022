package com.movies.acmeflix.service;

import com.movies.acmeflix.model.Account;
import com.movies.acmeflix.repository.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
@RequiredArgsConstructor

public class AccountServiceImpl extends BaseServiceImpl<Account> implements AccountService {
    private final AccountRepository accountRepository;

    @Override
    JpaRepository<Account,Long> getRepository(){

        return accountRepository;
    }


    @Override
    public Account findByEmail(final String email){
        return Optional.ofNullable(accountRepository.findByEmail(email)).orElseThrow(NoSuchElementException::new);
    }
}
