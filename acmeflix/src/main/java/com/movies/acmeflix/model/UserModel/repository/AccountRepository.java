package com.movies.acmeflix.model.UserModel.repository;

import com.movies.acmeflix.model.UserModel.Account;
import com.movies.acmeflix.model.UserModel.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {

    Account findByEmail(String email);
}
