package com.movies.acmeflix.model.MovieModel;

import com.movies.acmeflix.base.BaseModel;
import com.movies.acmeflix.model.MovieModel.enumeration.Category;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.math.BigInteger;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@MappedSuperclass

public class Content extends BaseModel {
    @NotNull(message = "Movie's title can't be null")
    @Column(length = 50, nullable = false)
    private String title;

    @NotNull(message = "Movie's category can't be null")
    @Enumerated(EnumType.STRING)
    @Column(length = 15, nullable = false)
    private Category category;

    private String description;

    @Column(precision = 2,scale = 1)
    private BigDecimal duration;

    @Min(1900)
    @Max(2023)
    private int yearOfRelease;
}
