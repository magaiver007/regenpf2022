package com.movies.acmeflix.mapper;
import com.movies.acmeflix.model.Episode;
import com.movies.acmeflix.transfer.resources.EpisodeResource;
import org.mapstruct.Mapper;
@Mapper(componentModel = "spring", uses = CrewMemberMapper.class)
public interface EpisodeMapper extends BaseMapper<Episode, EpisodeResource> {
}
