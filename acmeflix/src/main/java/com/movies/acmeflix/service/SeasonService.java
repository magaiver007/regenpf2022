package com.movies.acmeflix.service;

import com.movies.acmeflix.model.Season;
import com.movies.acmeflix.model.Series;

import java.util.List;

public interface SeasonService extends BaseService<Season,Long> {
    List<Season> findAllBySeries(Series series);

}
