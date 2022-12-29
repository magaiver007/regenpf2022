package com.movies.acmeflix.model.MovieModel;

import lombok.Data;

@Data
public class Series extends Movies {
    private int seriesTitle;
    private String seriesDescription;
    private int number_of_episodes;
    private int seasons;
    private String fromTo;
    private double seriesRating;
}
