package com.movies.acmeflix.controller;
import com.movies.acmeflix.model.Account;
import com.movies.acmeflix.service.AccountService;
import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequiredArgsConstructor
@RequestMapping("accounts")
public class AccountController {

    private final AccountService accountService;

    @GetMapping
    public List<Account> findAll(@RequestParam (required = false) String email){
        if (email==null)
            return accountService.findAll();
        return List.of(accountService.findByEmail(email));
    }
    @GetMapping("/{id}")
    public Account find(@PathVariable Long id){
        return accountService.find(id);
    }

}
