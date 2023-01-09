package com.movies.acmeflix.repository;

import com.movies.acmeflix.model.Content;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContentRepository extends JpaRepository<Content, Long> {


}
