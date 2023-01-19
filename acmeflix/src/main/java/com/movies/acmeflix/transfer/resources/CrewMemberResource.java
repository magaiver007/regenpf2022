package com.movies.acmeflix.transfer.resources;

import lombok.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

@Data
@ToString(callSuper = true)

public class CrewMemberResource extends BaseResource {
    @NotNull(message = "Crew member's firstname cannot be null")
    private String firstname;
    @NotNull(message = "Crew member's lastname cannot be null")
    private String lastname;
    @Min(10)
    @Max(100)
    private int age;
}