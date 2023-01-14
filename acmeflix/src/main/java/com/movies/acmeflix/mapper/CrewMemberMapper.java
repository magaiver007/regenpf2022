package com.movies.acmeflix.mapper;

import com.movies.acmeflix.model.CrewMember;
import com.movies.acmeflix.transfer.resources.CrewMemberResource;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CrewMemberMapper extends BaseMapper<CrewMember, CrewMemberResource>{
}
