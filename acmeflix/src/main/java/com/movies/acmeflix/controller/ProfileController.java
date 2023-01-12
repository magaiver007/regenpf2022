package com.movies.acmeflix.controller;


import com.movies.acmeflix.model.Profile;
import com.movies.acmeflix.service.ProfileService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("profiles")
public class ProfileController {
    private final ProfileService profileService;

}
