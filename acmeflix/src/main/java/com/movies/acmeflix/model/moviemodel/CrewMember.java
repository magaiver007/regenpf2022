package com.movies.acmeflix.model.moviemodel;

import com.movies.acmeflix.model.BaseModel;
import lombok.Data;

import java.util.List;

@Data
public class CrewMember extends BaseModel {
    private String firstname;
    private String lastname;
    private int age;
    private List<Movie> movieList;
}
