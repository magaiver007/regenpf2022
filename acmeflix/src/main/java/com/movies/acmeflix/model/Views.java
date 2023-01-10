package com.movies.acmeflix.model;

import com.movies.acmeflix.base.BaseModel;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.math.BigDecimal;

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

    //Many views to one movie
    @ManyToOne(fetch = FetchType.LAZY)
    private Movie movie;
    @ManyToOne(fetch = FetchType.LAZY)
    private Episode episode;

    //PER MINUTE
    private BigDecimal duration;
    @ManyToOne (fetch = FetchType.LAZY,optional = false)
    private Profile profile;

}
