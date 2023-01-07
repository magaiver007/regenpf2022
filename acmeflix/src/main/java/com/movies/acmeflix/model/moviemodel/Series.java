package com.movies.acmeflix.model.moviemodel;
import lombok.Data;

import java.time.Year;
import java.util.List;
import java.util.Map;

@Data
public class Series {
    private int seriesTitle;
    private String seriesDescription;
    private int seriesEpisodeCount;
    private int seriesSeasonCount;
    private int seriesStartYear;
    private int seriesEndYear;
    private double seriesRating;        // cumulative rating of each episode divided by seriesTotalEpisodes?
}
