package com.movies.acmeflix.repository;

import com.movies.acmeflix.model.Season;
import com.movies.acmeflix.model.Series;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SeasonRepository extends JpaRepository<Season, Long> {
   //List<Season> findAllBySeries(Series series);
}
