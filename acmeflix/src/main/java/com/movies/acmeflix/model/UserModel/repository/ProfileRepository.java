package com.movies.acmeflix.model.UserModel.repository;

import com.movies.acmeflix.model.UserModel.Account;
import com.movies.acmeflix.model.UserModel.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProfileRepository extends JpaRepository<Profile, Long> {

    Profile findByUsername(String username);

    List<Profile> findAllByAccount(Account account);
}
