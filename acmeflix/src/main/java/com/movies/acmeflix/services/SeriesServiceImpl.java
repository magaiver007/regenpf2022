package com.movies.acmeflix.services;

import com.movies.acmeflix.model.Series;
import com.movies.acmeflix.repository.SeriesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SeriesServiceImpl extends BaseServiceImpl<Series> implements SeriesService{
    private final SeriesRepository seriesRepository;

    @Override
    JpaRepository<Series, Long> getRepository() {
        return seriesRepository;
    }
}
