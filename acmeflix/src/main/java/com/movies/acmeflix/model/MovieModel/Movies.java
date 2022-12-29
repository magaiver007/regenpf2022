package com.movies.acmeflix.model.MovieModel;

import com.movies.acmeflix.model.BaseModel;
import lombok.Data;

import java.util.List;

@Data
public class Movies extends BaseModel {
    private String title;
    private Category category;
    private String description;
    private int year;
    private double duration;
    private double rating;
    private List<CrewMember> crewMembers;

}
