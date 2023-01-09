package com.movies.acmeflix.model;

import com.movies.acmeflix.base.BaseModel;
import com.movies.acmeflix.model.Account;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "PROFILES")
@SequenceGenerator(name = "idGenerator", sequenceName = "PROFILE_SEQ", initialValue = 1, allocationSize = 1)

public class Profile extends BaseModel {
    @NotNull(message = "username can't be null")
    @Column(length = 10,nullable = false)
    private String username;
    @Column(nullable = false)
    private boolean is_Kid;
    @ManyToOne (fetch = FetchType.LAZY,optional = false)
    private Account account;

}
