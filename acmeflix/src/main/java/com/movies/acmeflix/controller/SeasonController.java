package com.movies.acmeflix.controller;

import com.movies.acmeflix.mapper.SeasonMapper;
import com.movies.acmeflix.mapper.BaseMapper;
import com.movies.acmeflix.model.Season;
import com.movies.acmeflix.service.SeasonService;
import com.movies.acmeflix.service.BaseService;
import com.movies.acmeflix.transfer.resources.SeasonResource;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("seasons")
public class SeasonController extends BaseController<Season, SeasonResource> {
    private final SeasonService SeasonService;
    private final SeasonMapper SeasonMapper;

    @Override
    protected BaseService<Season, Long> getBaseService() {
        return SeasonService;
    }

    @Override
    protected BaseMapper<Season, SeasonResource> getBaseMapper() {
        return SeasonMapper;
    }
}
