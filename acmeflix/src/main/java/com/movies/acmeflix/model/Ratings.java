package com.movies.acmeflix.model;

import com.movies.acmeflix.model.MovieModel.Movie;
import com.movies.acmeflix.model.MovieModel.Series;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;


@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "RATINGS")
@SequenceGenerator(name = "idGenerator", sequenceName = "RATING_SEQ", initialValue = 1, allocationSize = 1)
public class Ratings extends BaseModel {

    //Many ratings to one movie.
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Movie movie;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Series series;

    @Min(1)
    @Max(10)
    @Column(precision = 2,scale=1)
    private double rating;

}
