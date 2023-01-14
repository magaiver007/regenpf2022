package com.movies.acmeflix.transfer.resources;
import lombok.Data;
import lombok.ToString;
import java.io.Serializable;

@Data
@ToString(callSuper = true)
public class BaseResource implements Serializable {
    private Long id;
}
