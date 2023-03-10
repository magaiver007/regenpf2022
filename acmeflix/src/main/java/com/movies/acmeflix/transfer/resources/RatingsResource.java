package com.movies.acmeflix.transfer.resources;

import lombok.*;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;


@Data
@ToString(callSuper = true)
public class RatingsResource extends BaseResource {

    private MovieResource movie;

    private EpisodeResource episode;

    @Min(1)
    @Max(10)
    private int rating;


    private ProfileResource profile;

}
