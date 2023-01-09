package com.movies.acmeflix.model.MovieModel;

import com.movies.acmeflix.base.BaseModel;
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

    @ManyToMany
    @JoinTable(name = "content_crew_members")
    private Set<Series> series=new HashSet<>();

    @ManyToMany
    @JoinTable(name = "content_crew_members")
    private Set<Movie> movies=new HashSet<>();

}