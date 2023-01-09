package com.movies.acmeflix.repository;

import com.movies.acmeflix.model.MovieModel.Content;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ContentRepository extends JpaRepository<Content, Long> {


}
