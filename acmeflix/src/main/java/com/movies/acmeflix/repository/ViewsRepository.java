package com.movies.acmeflix.repository;

import com.movies.acmeflix.model.Movie;
import com.movies.acmeflix.model.Views;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import reportsss.Top10ByAvgRating;
import reportsss.Top10ContentByViews;
import reportsss.Top5Categories;

import java.util.List;

public interface ViewsRepository extends JpaRepository<Views, Long> {

    @Query(value = "SELECT ROUND(SUM(VIEWS.DURATION)/60,2) AS HOURS_VIEWED, SERIES.TITLE AS TITLE\n" +
            "FROM VIEWS,EPISODES,SEASONS,SERIES\n" +
            "WHERE EPISODE_ID=EPISODES.ID AND SEASONS.ID=SEASON_ID AND SERIES.ID=SERIES_ID\n" +
            "UNION\n" +
            "SELECT ROUND(SUM(VIEWS.DURATION)/60,2) AS HOURS_VIEWED, TITLE\n" +
            "FROM MOVIES,VIEWS\n" +
            "WHERE MOVIES.ID = VIEWS.MOVIE_ID\n" +
            "GROUP BY TITLE\n" +
            "ORDER BY HOURS_VIEWED DESC\n" +
            "LIMIT 10;", nativeQuery = true)
    List<Top10ContentByViews> findTop10ByTotalViews();

    @Query(value="SELECT ROUND(AVG(RATING),2) AS  AVG_RATING, SERIES.TITLE AS TITLE\n" +
            "FROM RATINGS,EPISODES,SEASONS,SERIES\n" +
            "WHERE EPISODE_ID=EPISODES.ID AND SEASONS.ID=SEASON_ID AND SERIES.ID=SERIES_ID\n" +
            "UNION\n" +
            "SELECT AVG(RATING) AS AVG_RATING, TITLE\n" +
            "FROM RATINGS,MOVIES\n" +
            "WHERE MOVIE_ID= MOVIES.ID\n" +
            "GROUP BY TITLE\n" +
            "ORDER BY AVG_RATING DESC\n" +
            "LIMIT 10;", nativeQuery = true)
    List<Top10ByAvgRating>findTop10ByAvgRate();

    @Query(value = "SELECT COUNT(VIEWS.EPISODE_ID) AS MOST_VIEWED, SERIES.CATEGORY AS CATEGORY\n" +
            "FROM VIEWS,EPISODES,SEASONS,SERIES\n" +
            "WHERE EPISODE_ID=EPISODES.ID AND SEASONS.ID=SEASON_ID AND SERIES.ID=SERIES_ID\n" +
            "UNION\n" +
            "SELECT COUNT(VIEWS.MOVIE_ID) AS MOST_VIEWED, CATEGORY\n" +
            "FROM MOVIES,VIEWS\n" +
            "WHERE MOVIES.ID = VIEWS.MOVIE_ID\n" +
            "GROUP BY CATEGORY\n" +
            "ORDER BY MOST_VIEWED DESC\n" +
            "LIMIT 5;", nativeQuery = true)
    List<Top5Categories>findTop5Categories();
}
