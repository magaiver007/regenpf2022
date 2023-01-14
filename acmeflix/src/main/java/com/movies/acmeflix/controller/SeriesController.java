package com.movies.acmeflix.controller;

import com.movies.acmeflix.mapper.SeriesMapper;
import com.movies.acmeflix.mapper.BaseMapper;
import com.movies.acmeflix.model.Series;
import com.movies.acmeflix.service.SeriesService;
import com.movies.acmeflix.service.BaseService;
import com.movies.acmeflix.transfer.resources.SeriesResource;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("series")
public class SeriesController extends BaseController<Series, SeriesResource>{
    private final SeriesService SeriesService;
    private final SeriesMapper SeriesMapper;

    @Override
    protected BaseService<Series, Long> getBaseService() {
        return SeriesService;
    }

    @Override
    protected BaseMapper<Series, SeriesResource> getBaseMapper() {
        return SeriesMapper;
    }
}
