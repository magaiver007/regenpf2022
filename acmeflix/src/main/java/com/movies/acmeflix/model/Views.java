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

    //One view to many movie
    @ManyToOne(fetch = FetchType.LAZY)
    private Movie movie;

    @ManyToOne(fetch = FetchType.LAZY)
    private Series series;
    private BigDecimal duration;

}
