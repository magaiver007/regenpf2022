package com.movies.acmeflix.transfer.resources;
import lombok.*;


@Data
@ToString(callSuper = true)


public class SeriesResource extends ContentResource {

     private String yearOfEnding;

}
