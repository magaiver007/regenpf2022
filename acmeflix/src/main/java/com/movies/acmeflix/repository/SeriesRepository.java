package com.movies.acmeflix.repository;

import com.movies.acmeflix.model.Series;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeriesRepository extends JpaRepository<Series, Long> {

}
