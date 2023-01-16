package com.movies.acmeflix.service;

import com.movies.acmeflix.model.Episode;
import com.movies.acmeflix.model.Movie;

import java.util.List;

public interface EpisodeService extends BaseService<Episode,Long> {
    Episode findAllByTitle(String title);

    List<Episode> findTop10ByTotalViews();

    List<Episode>findTop10ByAvgRate();

    List<Episode>findTop5Popular();
}
