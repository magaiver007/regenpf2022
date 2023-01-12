package com.movies.acmeflix.controller;

import com.movies.acmeflix.service.SeasonService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("seasons")
public class SeasonController {
    private final SeasonService seasonService;
}
