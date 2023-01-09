package com.movies.acmeflix.model;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import javax.validation.constraints.Min;
import java.util.HashSet;
import java.util.Set;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)

@Entity
@Table(name = "SERIES")
@SequenceGenerator(name = "idGenerator", sequenceName = "SERIES_SEQ", initialValue = 1, allocationSize = 1)

public class Series extends Content {
      @Min(2)
    private int number_of_episodes;
    @Min(1)
    private int seasons;

    //Could be year or --(still continues)
    private String yearOfEnding;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "series",cascade = CascadeType.ALL,orphanRemoval = true)
    Set<Ratings> ratings = new HashSet<>();
    @OneToMany(fetch = FetchType.LAZY,mappedBy = "series",cascade = CascadeType.ALL,orphanRemoval = true)
    Set<Views> views = new HashSet<>();

    @ManyToMany(mappedBy = "series", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Set<CrewMember> crewMembers=new HashSet<>();
}
