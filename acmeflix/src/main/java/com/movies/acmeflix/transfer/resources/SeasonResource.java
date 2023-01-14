package com.movies.acmeflix.transfer.resources;

import lombok.*;

import javax.validation.constraints.Min;
import java.util.HashSet;
import java.util.Set;

@Data
@ToString(callSuper = true)

public class SeasonResource extends BaseResource{

    private SeriesResource series;
    @Min(1)
    private int seasonNumber;
    private Set<EpisodeResource> episodes =  new HashSet<>();
}
