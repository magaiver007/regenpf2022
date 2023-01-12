package com.movies.acmeflix.controller;

import com.movies.acmeflix.service.SeriesService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("series")
public class SeriesController {
    private final SeriesService seriesService;
}
