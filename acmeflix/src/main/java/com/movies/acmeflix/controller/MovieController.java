package com.movies.acmeflix.controller;

import com.movies.acmeflix.mapper.MovieMapper;
import com.movies.acmeflix.mapper.BaseMapper;
import com.movies.acmeflix.model.Movie;
import com.movies.acmeflix.service.MovieService;
import com.movies.acmeflix.service.BaseService;
import com.movies.acmeflix.transfer.resources.MovieResource;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("movies")
public class MovieController extends BaseController<Movie, MovieResource>{
    private final MovieService MovieService;
    private final MovieMapper MovieMapper;

    @Override
    protected BaseService<Movie, Long> getBaseService() {
        return MovieService;
    }

    @Override
    protected BaseMapper<Movie, MovieResource> getBaseMapper() {
        return MovieMapper;
    }
}
