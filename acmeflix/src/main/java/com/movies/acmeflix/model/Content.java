package com.movies.acmeflix.model;

import com.movies.acmeflix.base.BaseModel;
import com.movies.acmeflix.model.enumeration.Category;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@MappedSuperclass

public class Content extends BaseModel {
    @NotNull(message = "Content's title can't be null")
    @Column(length = 50, nullable = false)
    private String title;
    @NotNull(message = "Content's category can't be null")
    @Enumerated(EnumType.STRING)
    @Column(length = 15, nullable = false)
    private Category category;
    private String description;

    //PER MINUTE
    private BigDecimal duration;
    @Min(1900)
    @Max(2023)
    private int yearOfRelease;


}
