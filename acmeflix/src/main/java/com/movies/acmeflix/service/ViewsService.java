package com.movies.acmeflix.service;

import com.movies.acmeflix.model.Movie;
import com.movies.acmeflix.model.Views;
import reportsss.Top10ByAvgRating;
import reportsss.Top10ContentByViews;
import reportsss.Top5Categories;

import java.util.List;

public interface ViewsService extends BaseService<Views,Long>{

    List<Top10ContentByViews> findTop10ByTotalViews();

    List<Top10ByAvgRating>findTop10ByAvgRate();

    List<Top5Categories>findTop5Categories();
}
