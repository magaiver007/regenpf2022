package com.movies.acmeflix.service;

import com.movies.acmeflix.model.Season;
import com.movies.acmeflix.model.Series;
import com.movies.acmeflix.repository.SeasonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class SeasonServiceImpl extends BaseServiceImpl<Season> implements SeasonService{
    private final SeasonRepository seasonRepository;

    @Override
    JpaRepository<Season, Long> getRepository() {
        return seasonRepository;
    }

    @Override
    public List<Season> findAllBySeries(Series series) {
        return Optional.ofNullable(seasonRepository.findAllBySeries(series)).orElseThrow(NoSuchElementException::new);
    }
}
