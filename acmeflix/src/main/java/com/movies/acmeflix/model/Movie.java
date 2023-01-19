package com.movies.acmeflix.model;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)

@Entity
@Table(name="MOVIES")
@SequenceGenerator(name = "idGenerator", sequenceName = "MOVIE_SEQ", initialValue = 1, allocationSize = 1)
public class Movie extends Content {
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @ManyToMany(fetch = FetchType.EAGER,mappedBy = "movies", cascade = {CascadeType.ALL})
    private Set<CrewMember> crewMember=new HashSet<>();

}
