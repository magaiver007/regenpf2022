package com.movies.acmeflix.repository;

import com.movies.acmeflix.model.CrewMember;
import com.movies.acmeflix.model.Episode;
import com.movies.acmeflix.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CrewMemberRepository extends JpaRepository<CrewMember, Long> {
}
