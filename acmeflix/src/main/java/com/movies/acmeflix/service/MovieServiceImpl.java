package com.movies.acmeflix.service;

import com.movies.acmeflix.model.Movie;
import com.movies.acmeflix.repository.MovieRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MovieServiceImpl extends BaseServiceImpl<Movie> implements MovieService{
    private final MovieRepository movieRepository;

    @Override
    JpaRepository<Movie, Long> getRepository() {
        return movieRepository;
    }

    @Override
    public Movie findAllByTitle(String title) {
        return Optional.ofNullable(movieRepository.findAllByTitle(title)).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public List<Movie> findTop10ByTotalViews() {
        return Optional.ofNullable(movieRepository.findTop10ByTotalViews()).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public List<Movie> findTop10ByAvgRate() {
        return Optional.ofNullable(movieRepository.findTop10ByAvgRate()).orElseThrow(NoSuchElementException::new);
    }
}
