package com.movies.acmeflix.transfer.resources;

import lombok.*;
import java.math.BigDecimal;

@Data
@ToString(callSuper = true)

public class ViewsResource extends BaseResource {

    //Many views to one movie

    private MovieResource movie;

    private EpisodeResource episode;

    //PER MINUTE
    private BigDecimal duration;

    private ProfileResource profile;

}
