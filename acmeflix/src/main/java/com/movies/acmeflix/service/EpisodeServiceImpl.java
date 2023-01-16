package com.movies.acmeflix.service;

import com.movies.acmeflix.model.Episode;
import com.movies.acmeflix.model.Movie;
import com.movies.acmeflix.repository.EpisodeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EpisodeServiceImpl extends BaseServiceImpl<Episode> implements EpisodeService{
    private final EpisodeRepository episodeRepository;
    @Override
    JpaRepository<Episode, Long> getRepository() {
        return episodeRepository;
    }

    @Override
    public Episode findAllByTitle(String title) {
        return Optional.ofNullable(episodeRepository.findAllByTitle(title)).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public List<Episode> findTop10ByTotalViews() {
        return Optional.ofNullable(episodeRepository.findTop10ByTotalViews()).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public List<Episode> findTop10ByAvgRate() {
        return Optional.ofNullable(episodeRepository.findTop10ByAvgRate()).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public List<Episode> findTop5Popular() {
        return Optional.ofNullable(episodeRepository.findTop5Popular()).orElseThrow(NoSuchElementException::new);
    }
}
