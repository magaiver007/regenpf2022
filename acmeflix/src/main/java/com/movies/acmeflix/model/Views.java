package com.movies.acmeflix.model;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.math.BigDecimal;


@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "VIEWS")
@SequenceGenerator(name = "idGenerator", sequenceName = "VIEW_SEQ", initialValue = 1, allocationSize = 1)

public class Views extends BaseModel {

    //Many views to one movie
    @ManyToOne
    private Movie movie;
    @ManyToOne
    private Episode episode;

    //PER MINUTE
    private BigDecimal duration;
    @ManyToOne
    private Profile profile;

}
