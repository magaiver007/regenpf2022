package com.movies.acmeflix.controller;

import com.movies.acmeflix.mapper.BaseMapper;
import com.movies.acmeflix.mapper.ViewsMapper;
import com.movies.acmeflix.model.Movie;
import com.movies.acmeflix.model.Views;
import com.movies.acmeflix.service.BaseService;
import com.movies.acmeflix.service.ViewsService;
import com.movies.acmeflix.transfer.resources.ViewsResource;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reportsss.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("views")
public class ViewsController extends BaseController<Views, ViewsResource> {

    private final ViewsService viewsService;

    private final ViewsMapper viewsMapper;

    @Override
    protected BaseService<Views, Long> getBaseService() {return viewsService;}

    @Override
    protected BaseMapper<Views, ViewsResource> getBaseMapper() {return viewsMapper;}

    @GetMapping("/top10")
    public List<Top10ContentByViews> findTop10ByTotalViews(){
        return viewsService.findTop10ByTotalViews();
    }

    @GetMapping("/topAvg")
    public List<Top10ByAvgRating> findTop10ByAvgRate(){return viewsService.findTop10ByAvgRate();}

    @GetMapping("/top5Categories")
    public List<Top5Categories> findTop5Categories(){return viewsService.findTop5Categories();}
    @GetMapping("/hoursPerProfile")
    public List<HoursPerProfile> hoursPerProfiles(){return viewsService.findViewsByProfile();}
    @GetMapping("/viewingHistory")
    public List<ViewingHistoryPerProfile> viewingHistoryPerProfiles(){
        return viewsService.findViewsByProfileAndMovie();
    }
}
