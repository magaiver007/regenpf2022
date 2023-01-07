package com.movies.acmeflix.model.moviemodel;

// class that Movie and Episode classes extend | contains fields found in both entities

import com.movies.acmeflix.model.BaseModel;
import lombok.Data;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Data
public class Content extends BaseModel {

    private String contentTitle;
    private MovieCategories contentCategory;
    private String contentDescription;
    private int contentReleaseYear;
    private double contentDuration;
    private double contentRating;
    private List<CrewMember> contentCrewMembers;


}
