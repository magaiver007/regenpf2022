package com.movies.acmeflix.controller;

import com.movies.acmeflix.mapper.CrewMemberMapper;
import com.movies.acmeflix.mapper.BaseMapper;
import com.movies.acmeflix.model.CrewMember;
import com.movies.acmeflix.model.CrewMember;
import com.movies.acmeflix.service.CrewMemberService;
import com.movies.acmeflix.service.BaseService;
import com.movies.acmeflix.service.CrewMemberService;
import com.movies.acmeflix.transfer.resources.CrewMemberResource;
import com.movies.acmeflix.transfer.resources.CrewMemberResource;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("crewMembers")
public class CrewMemberController extends BaseController<CrewMember, CrewMemberResource>{

    private final CrewMemberService crewMemberService;

    private final CrewMemberMapper CrewMemberMapper;

    @Override
    protected BaseService<CrewMember, Long> getBaseService() {
        return crewMemberService;
    }

    @Override
    protected BaseMapper<CrewMember, CrewMemberResource> getBaseMapper() {
        return CrewMemberMapper;
    }

}
