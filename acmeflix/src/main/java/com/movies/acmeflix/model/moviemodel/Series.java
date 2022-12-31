package com.movies.acmeflix.model.moviemodel;
import lombok.Data;

@Data
public class Series {
    private int seriesTitle;
    private String seriesDescription;
    private int number_of_episodes;
    private int seasons;
    private String fromTo;
    private double seriesRating;
}
