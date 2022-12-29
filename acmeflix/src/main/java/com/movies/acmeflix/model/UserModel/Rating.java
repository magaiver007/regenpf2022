package com.movies.acmeflix.model.UserModel;

import com.movies.acmeflix.model.BaseModel;
import com.movies.acmeflix.model.MovieModel.Movies;
import lombok.Data;

@Data
public class Rating extends BaseModel {
    private Movies movie;
    private double rating;

}
