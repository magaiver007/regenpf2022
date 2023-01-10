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
@Table(name = "EPISODES")
@SequenceGenerator(name = "idGenerator", sequenceName = "EPISODE_SEQ", initialValue = 1, allocationSize = 1)
public class Episode extends Content{
    @ManyToOne(fetch = FetchType.LAZY)
    private Season season;
    @OneToMany(fetch = FetchType.LAZY,mappedBy = "episode",cascade = CascadeType.ALL,orphanRemoval = true)
    private Set<Ratings> ratings = new HashSet<>();
    @OneToMany(fetch = FetchType.LAZY,mappedBy = "episode",cascade = CascadeType.ALL,orphanRemoval = true)
    private Set <Views> views = new HashSet<>();
    @ManyToMany(mappedBy = "episodes", cascade = {CascadeType.ALL})
    private Set<CrewMember> crewMembers=new HashSet<>();
}
