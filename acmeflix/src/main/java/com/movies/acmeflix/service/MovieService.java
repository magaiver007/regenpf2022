package com.movies.acmeflix.service;

import com.movies.acmeflix.model.Movie;
import reportsss.Top10ContentByViews;

import java.util.List;

public interface MovieService extends BaseService<Movie,Long> {
    Movie findAllByTitle(String title);
}
