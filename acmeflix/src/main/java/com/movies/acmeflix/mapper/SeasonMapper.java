package com.movies.acmeflix.mapper;
import com.movies.acmeflix.model.Season;
import com.movies.acmeflix.transfer.resources.SeasonResource;
import org.mapstruct.Mapper;
@Mapper(componentModel = "spring")
public interface SeasonMapper extends BaseMapper<Season, SeasonResource> {
}
