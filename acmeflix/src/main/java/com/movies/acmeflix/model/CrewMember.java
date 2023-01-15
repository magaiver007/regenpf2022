package com.movies.acmeflix.model;

import lombok.*;
import lombok.experimental.SuperBuilder;
import javax.persistence.*;
import javax.validation.constraints.Max;
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
@Table(name="CREW_MEMBERS")
@SequenceGenerator(name = "idGenerator", sequenceName = "CREW_MEMBERS_SEQ", initialValue = 1, allocationSize = 1)

public class CrewMember extends BaseModel {
    @NotNull(message = "Crew member's firstname cannot be null")
    @Column(length = 20, nullable = false)
    private String firstname;
    @NotNull(message = "Crew member's lastname cannot be null")
    @Column(length = 20, nullable = false)
    private String lastname;
    @Min(10)
    @Max(100)
    private int age;
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @ManyToMany(fetch = FetchType.EAGER,cascade={CascadeType.ALL})
    @JoinTable(name = "series_crew",joinColumns = {
            @JoinColumn(name = "crew_members_id")
    },inverseJoinColumns={@JoinColumn(name = "episodes_id")})
    private Set<Episode> episodes=new HashSet<>();
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @ManyToMany(fetch = FetchType.EAGER,cascade={CascadeType.ALL})
    @JoinTable(name = "movies_crew",joinColumns = {
            @JoinColumn(name = "crew_members_id")
    },inverseJoinColumns={@JoinColumn(name = "movies_id")})
    private Set<Movie> movies=new HashSet<>();

}