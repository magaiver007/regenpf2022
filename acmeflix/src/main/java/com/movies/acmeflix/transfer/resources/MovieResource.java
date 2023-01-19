package com.movies.acmeflix.transfer.resources;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Data
@ToString(callSuper = true)

public class MovieResource extends ContentResource {

  private Set<CrewMemberResource> crewMember= new HashSet<>();
}
