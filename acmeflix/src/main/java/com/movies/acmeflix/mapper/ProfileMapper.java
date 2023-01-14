package com.movies.acmeflix.mapper;

import com.movies.acmeflix.model.Profile;
import com.movies.acmeflix.transfer.resources.ProfileResource;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProfileMapper extends BaseMapper<Profile, ProfileResource> {
}
