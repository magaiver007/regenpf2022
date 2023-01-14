package com.movies.acmeflix.mapper;

import com.movies.acmeflix.model.Account;
import com.movies.acmeflix.transfer.resources.AccountResource;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AccountMapper extends BaseMapper<Account, AccountResource>{

}
