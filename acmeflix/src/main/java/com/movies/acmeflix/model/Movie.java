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
@Table(name = "MOVIES")
@SequenceGenerator(name = "idGenerator", sequenceName = "MOVIES_SEQ", initialValue = 1, allocationSize = 1)

public class Movie extends Content {

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "movie",cascade = CascadeType.ALL,orphanRemoval = true)
    private Set<Ratings> ratings = new HashSet<>();
    @OneToMany(fetch = FetchType.LAZY,mappedBy = "movie",cascade = CascadeType.ALL,orphanRemoval = true)
    private Set<Views> views = new HashSet<>();
    @ManyToMany(fetch = FetchType.LAZY,mappedBy = "movies", cascade = CascadeType.ALL)
    private Set<CrewMember> crewMember=new HashSet<>();

}
