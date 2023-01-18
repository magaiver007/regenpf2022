package com.movies.acmeflix.mapper;

import com.movies.acmeflix.model.Views;
import com.movies.acmeflix.transfer.resources.ViewsResource;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ViewsMapper extends BaseMapper<Views, ViewsResource>{

}
