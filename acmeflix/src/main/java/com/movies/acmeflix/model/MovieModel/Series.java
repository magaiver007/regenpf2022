package com.movies.acmeflix.model.MovieModel;
import com.movies.acmeflix.model.Ratings;
import com.movies.acmeflix.model.Views;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
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
    @NotNull(message = "Series title can't be null")
    @Column(length = 20, nullable = false)
    private String seriesTitle;

    @Column(length = 50)
    private String seriesDescription;

    @Min(2)
    private int number_of_episodes;
    @Min(1)
    private int seasons;

    @Column(length = 10)
    private String fromTo;

    //Could be year or --(still continues)
    private String yearOfEnding;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "serie",cascade = CascadeType.ALL,orphanRemoval = true)
    Set<Ratings> ratings = new HashSet<>();
    @OneToMany(fetch = FetchType.LAZY,mappedBy = "serie",cascade = CascadeType.ALL,orphanRemoval = true)
    Set<Views> views = new HashSet<>();

    @ManyToMany(mappedBy = "series", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Set<CrewMember> crewMembers=new HashSet<>();
}
