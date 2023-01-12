package com.movies.acmeflix.controller;

import com.movies.acmeflix.model.CrewMember;
import com.movies.acmeflix.model.Episode;
import com.movies.acmeflix.service.EpisodeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("episodes")
public class EpisodeController {
    private final EpisodeService episodeService;

}
