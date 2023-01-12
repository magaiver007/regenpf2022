package com.movies.acmeflix.service;

import com.movies.acmeflix.model.CrewMember;
import com.movies.acmeflix.model.Episode;
import com.movies.acmeflix.model.Movie;
import com.movies.acmeflix.repository.CrewMemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CrewMemberServiceImpl extends BaseServiceImpl<CrewMember> implements CrewMemberService{
    private final CrewMemberRepository crewMemberRepository;
    @Override
    JpaRepository<CrewMember, Long> getRepository() {
        return crewMemberRepository;
    }

    @Override
    public List<CrewMember> findAllByMoviesAndEpisodes(Movie movie, Episode episode) {
        return crewMemberRepository.findAllByMoviesAndEpisodes(movie,episode);
    }
}
