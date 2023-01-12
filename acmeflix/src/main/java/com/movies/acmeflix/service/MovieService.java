package com.movies.acmeflix.service;

import com.movies.acmeflix.model.Movie;

public interface MovieService extends BaseService<Movie,Long> {
    Movie findAllByTitle(String title);

}
