package com.movies.acmeflix.controller;

import com.movies.acmeflix.mapper.EpisodeMapper;
import com.movies.acmeflix.mapper.BaseMapper;
import com.movies.acmeflix.model.Episode;
import com.movies.acmeflix.model.Movie;
import com.movies.acmeflix.service.EpisodeService;
import com.movies.acmeflix.service.BaseService;
import com.movies.acmeflix.transfer.resources.EpisodeResource;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequiredArgsConstructor
@RequestMapping("episodes")
public class EpisodeController extends BaseController<Episode, EpisodeResource>{
   private final EpisodeService EpisodeService;
   private final EpisodeMapper EpisodeMapper;

   @Override
   protected BaseService<Episode, Long> getBaseService() {
      return EpisodeService;
   }

   @Override
   protected BaseMapper<Episode, EpisodeResource> getBaseMapper() {
      return EpisodeMapper;
   }

   @GetMapping(params = "title")
   public Episode findByTitle(@RequestParam("title") String title) {
      return EpisodeService.findAllByTitle(title);
   }

}
