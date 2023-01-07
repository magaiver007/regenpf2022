package com.movies.acmeflix.model.MovieModel.repository;

import com.movies.acmeflix.model.MovieModel.CrewMember;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CrewMemberRepository extends JpaRepository<CrewMember, Long> {
}
