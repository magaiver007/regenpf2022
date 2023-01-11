package com.movies.acmeflix.services;

import com.movies.acmeflix.model.CrewMember;
import com.movies.acmeflix.repository.CrewMemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CrewMemberServiceImpl extends BaseServiceImpl<CrewMember> implements CrewMemberService{
    private final CrewMemberRepository crewMemberRepository;
    @Override
    JpaRepository<CrewMember, Long> getRepository() {
        return crewMemberRepository;
    }
}
