package com.movies.acmeflix.mapper;

import com.movies.acmeflix.model.Movie;
import com.movies.acmeflix.transfer.resources.MovieResource;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MovieMapper extends BaseMapper<Movie, MovieResource> {


}
