package com.movies.acmeflix.model.UserModel;

import com.movies.acmeflix.model.BaseModel;
import com.movies.acmeflix.model.moviemodel.Movie;
import lombok.Data;

@Data
public class View extends BaseModel {
    private Movie movie;
    private double duration;

}
