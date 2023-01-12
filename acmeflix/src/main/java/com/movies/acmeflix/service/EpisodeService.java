package com.movies.acmeflix.service;

import com.movies.acmeflix.model.Episode;

public interface EpisodeService extends BaseService<Episode,Long> {
    Episode findAllByTitle(String title);
}
