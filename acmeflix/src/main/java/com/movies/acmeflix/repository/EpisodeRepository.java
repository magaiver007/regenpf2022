package com.movies.acmeflix.repository;

import com.movies.acmeflix.model.Episode;
import com.movies.acmeflix.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface EpisodeRepository extends JpaRepository<Episode, Long> {
    Episode findAllByTitle(String title);

    @Query(value = "SELECT ROUND(SUM(VIEWS.DURATION)/60,2) AS HOURS_VIEWED, SERIES.TITLE AS SERIES\n" +
            "FROM VIEWS,EPISODES,SEASONS,SERIES WHERE EPISODE_ID=EPISODES.ID AND SEASONS.ID=SEASON_ID\n"
            + "AND SERIES.ID=SERIES_ID GROUP BY TITLE ORDER BY HOURS_VIEWED DESC LIMIT 10", nativeQuery = true)
    List<Episode> findTop10ByTotalViews();

    @Query(value="SELECT ROUND(AVG(RATING),2) AS  AVG_RATING, SERIES.TITLE AS SERIES\n" +
            "FROM RATINGS,EPISODES,SEASONS,SERIES WHERE EPISODE_ID=EPISODES.ID AND SEASONS.ID=SEASON_ID AND SERIES.ID=SERIES_ID\n" +
            "GROUP BY TITLE ORDER BY AVG_RATING DESC LIMIT 10;", nativeQuery = true)
    List<Episode>findTop10ByAvgRate();

    @Query(value = "SELECT COUNT(VIEWS.EPISODE_ID) AS MOST_VIEWED, SERIES.CATEGORY AS CATEGORY FROM VIEWS,EPISODES,SEASONS,SERIES\n" +
            "WHERE EPISODE_ID=EPISODES.ID AND SEASONS.ID=SEASON_ID AND SERIES.ID=SERIES_ID\n" +
            "GROUP BY CATEGORY ORDER BY MOST_VIEWED DESC LIMIT 5;", nativeQuery = true)
    List<Episode>findTop5Popular();
}
