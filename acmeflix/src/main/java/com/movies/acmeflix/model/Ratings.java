package com.movies.acmeflix.model;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;


@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)

@Entity
@Table(name = "RATINGS")
@SequenceGenerator(name = "idGenerator", sequenceName = "RATING_SEQ", initialValue = 1, allocationSize = 1)
public class Ratings extends BaseModel {

    //Many ratings to one movie.
    @ManyToOne
    private Movie movie;

    @ManyToOne
    private Episode episode;

    @Min(1)
    @Max(10)
    private int rating;

    @ManyToOne
    private Profile profile;

}
