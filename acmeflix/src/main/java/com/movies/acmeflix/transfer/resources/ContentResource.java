package com.movies.acmeflix.transfer.resources;

import com.movies.acmeflix.model.enumeration.Category;
import lombok.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Data
@ToString(callSuper = true)

public class ContentResource extends BaseResource {
    @NotNull(message = "Content's title can't be null")
    private String title;
    @NotNull(message = "Content's category can't be null")
    private Category category;
    private String description;

    //PER MINUTE
    private BigDecimal duration;
    @Min(1900)
    @Max(2023)
    private int yearOfRelease;


}
