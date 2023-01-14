package com.movies.acmeflix.transfer.resources;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Data
@ToString(callSuper = true)


public class SeriesResource extends ContentResource {

    //Could be year or --(still continues)
    private String yearOfEnding;
    private Set<SeasonResource> season = new HashSet<>();

}
