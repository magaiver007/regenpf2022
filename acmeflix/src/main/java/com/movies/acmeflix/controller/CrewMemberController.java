package com.movies.acmeflix.controller;

import com.movies.acmeflix.model.CrewMember;
import com.movies.acmeflix.service.CrewMemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("crewMembers")
public class CrewMemberController {

    private final CrewMemberService crewMemberService;

}
