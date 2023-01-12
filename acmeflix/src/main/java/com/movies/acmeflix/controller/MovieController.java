package com.movies.acmeflix.controller;

import com.movies.acmeflix.service.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("movies")
public class MovieController {
    private final MovieService movieService;
}
