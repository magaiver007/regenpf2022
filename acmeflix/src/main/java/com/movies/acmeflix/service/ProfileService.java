package com.movies.acmeflix.service;

import com.movies.acmeflix.model.Account;
import com.movies.acmeflix.model.Profile;

import java.util.List;

public interface ProfileService extends BaseService<Profile,Long> {
    Profile findByUsername(String username);

    List<Profile> findAllByAccount(Account account);
}
