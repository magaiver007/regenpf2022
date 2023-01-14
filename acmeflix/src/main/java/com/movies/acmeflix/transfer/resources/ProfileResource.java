package com.movies.acmeflix.transfer.resources;

import lombok.*;
import javax.validation.constraints.NotNull;
@Data
@ToString(callSuper = true)


public class ProfileResource extends BaseResource {
    @NotNull(message = "username can't be null")
    private String username;

    private boolean is_Kid;
    private AccountResource account;

}
