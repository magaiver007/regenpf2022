package com.movies.acmeflix.repository;

import com.movies.acmeflix.model.Account;
import com.movies.acmeflix.model.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProfileRepository extends JpaRepository<Profile, Long> {

    Profile findByUsername(String username);

    List<Profile> findAllByAccount(Account account);
}
