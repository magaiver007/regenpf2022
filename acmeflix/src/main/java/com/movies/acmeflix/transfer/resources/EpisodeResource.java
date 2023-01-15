package com.movies.acmeflix.transfer.resources;
import lombok.*;

import java.util.HashSet;
import java.util.Set;


@Data
@ToString(callSuper = true)

public class EpisodeResource extends ContentResource {
   // private SeasonResource season;

//    private Set<RatingsResource> ratings = new HashSet<>();
//
//    private Set<ViewsResource> views= new HashSet<>();

   private Set<CrewMemberResource> crewMembers= new HashSet<>();

}
