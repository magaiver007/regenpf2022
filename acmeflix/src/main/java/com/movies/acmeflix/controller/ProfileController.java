package com.movies.acmeflix.controller;

import com.movies.acmeflix.mapper.BaseMapper;
import com.movies.acmeflix.mapper.ProfileMapper;
import com.movies.acmeflix.model.Profile;
import com.movies.acmeflix.transfer.resources.ProfileResource;
import com.movies.acmeflix.service.BaseService;
import com.movies.acmeflix.service.ProfileService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("profiles")
public class ProfileController extends BaseController<Profile, ProfileResource> {
    private final ProfileService profileService;
    private final ProfileMapper profileMapper;

    @Override
    protected   BaseService<Profile, Long> getBaseService() {
        return profileService;
    }

    @Override
    protected   BaseMapper<Profile, ProfileResource> getBaseMapper() {
        return profileMapper;
    }

}
