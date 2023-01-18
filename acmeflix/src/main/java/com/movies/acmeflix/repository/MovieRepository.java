package com.movies.acmeflix.repository;

import com.movies.acmeflix.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import reportsss.Top10ContentByViews;

import java.util.List;

public interface MovieRepository extends JpaRepository<Movie, Long> {

    Movie findAllByTitle(String title);
}
