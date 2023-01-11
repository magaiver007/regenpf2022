package com.movies.acmeflix.services;

import com.movies.acmeflix.model.Season;
import com.movies.acmeflix.repository.SeasonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SeasonServiceImpl extends BaseServiceImpl<Season> implements SeasonService{
    private final SeasonRepository seasonRepository;

    @Override
    JpaRepository<Season, Long> getRepository() {
        return seasonRepository;
    }
}
