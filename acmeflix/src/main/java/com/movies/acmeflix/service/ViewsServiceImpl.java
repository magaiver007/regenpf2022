package com.movies.acmeflix.service;

import com.movies.acmeflix.model.Movie;
import com.movies.acmeflix.model.Views;
import com.movies.acmeflix.repository.ViewsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import reportsss.Top10ByAvgRating;
import reportsss.Top10ContentByViews;
import reportsss.Top5Categories;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ViewsServiceImpl extends BaseServiceImpl<Views> implements ViewsService{

    private final ViewsRepository viewsRepository;

    @Override
    JpaRepository<Views, Long> getRepository() {
        return viewsRepository;
    }

    @Override
    public List<Top10ContentByViews> findTop10ByTotalViews() {
        return Optional.ofNullable(viewsRepository.findTop10ByTotalViews()).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public List<Top10ByAvgRating> findTop10ByAvgRate() {
        return Optional.ofNullable(viewsRepository.findTop10ByAvgRate()).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public List<Top5Categories> findTop5Categories() {
        return Optional.ofNullable(viewsRepository.findTop5Categories()).orElseThrow(NoSuchElementException::new);
    }

}
