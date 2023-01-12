package com.movies.acmeflix.service;

import com.movies.acmeflix.model.Account;
import com.movies.acmeflix.model.Profile;
import com.movies.acmeflix.repository.ProfileRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProfileServiceImpl extends BaseServiceImpl<Profile> implements ProfileService{
    private final ProfileRepository profileRepository;

    @Override
    JpaRepository<Profile, Long> getRepository() {
        return profileRepository;
    }

    @Override
    public Profile findByUsername(String username) {
        return Optional.ofNullable(profileRepository.findByUsername(username)).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public List<Profile> findAllByAccount(Account account) {
        return Optional.ofNullable(profileRepository.findAllByAccount(account)).orElseThrow(NoSuchElementException::new);
    }
}
