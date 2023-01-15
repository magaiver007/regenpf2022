package com.movies.acmeflix.model;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)

@Entity
@Table(name = "SERIES")
@SequenceGenerator(name = "idGenerator", sequenceName = "SERIES_SEQ", initialValue = 1, allocationSize = 1)
//@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property="id")

public class Series extends Content {

    //Could be year or --(still continues)
    private String yearOfEnding;
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "series", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Season> season = new HashSet<>();
    }
