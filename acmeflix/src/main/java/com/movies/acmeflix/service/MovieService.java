package com.movies.acmeflix.service;

import com.movies.acmeflix.model.Movie;

import java.util.List;

public interface MovieService extends BaseService<Movie,Long> {
    Movie findAllByTitle(String title);

    List<Movie> findTop10ByTotalViews();

    List<Movie>findTop10ByAvgRate();

    List<Movie>findTop5Popular();

}
