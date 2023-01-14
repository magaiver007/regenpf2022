package com.movies.acmeflix.mapper;

import com.movies.acmeflix.model.Series;
import com.movies.acmeflix.transfer.resources.SeriesResource;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SeriesMapper extends BaseMapper<Series, SeriesResource> {
}
