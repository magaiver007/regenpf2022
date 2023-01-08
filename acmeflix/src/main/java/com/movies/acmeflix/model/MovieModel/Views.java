package com.movies.acmeflix.model.MovieModel;

import com.movies.acmeflix.base.BaseModel;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "VIEWS")
@SequenceGenerator(name = "idGenerator", sequenceName = "VIEW_SEQ", initialValue = 1, allocationSize = 1)

public class Views extends BaseModel {

    //One view to many movie
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Movie movie;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Series series;
    private double duration;

}
