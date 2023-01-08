package com.movies.acmeflix.model.UserModel;

import com.movies.acmeflix.base.BaseModel;
import com.movies.acmeflix.model.UserModel.enumeration.PaymentMethod;
import com.movies.acmeflix.model.UserModel.enumeration.SubscriptionPlan;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

@Data
@SuperBuilder
@NoArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "ACCOUNTS",indexes = {@Index(columnList = "email")})
@SequenceGenerator(name = "idGenerator", sequenceName = "ACCOUNT_SEQ", initialValue = 1, allocationSize = 1)

public class Account extends BaseModel {
    @NotNull(message = "Account's email can't be null")
    @Column(length = 50, nullable = false, unique = true)
    private String email;
    @NotNull(message = "Account's Password can't be null")
    @Column(length = 20, nullable = false)
    private String password;
    @NotNull(message = "Account's Subscription Plan can't be null")
    @Enumerated(EnumType.STRING)
    @Column(length = 8, nullable = false)
    private SubscriptionPlan subscriptionPlan;

    @NotNull(message = "Account's Payment Method can't be null")
    @Enumerated(EnumType.STRING)
    @Column(length = 12, nullable = false)
    private PaymentMethod paymentMethod;

    @OneToMany (fetch=FetchType.LAZY,mappedBy = "account",cascade = CascadeType.ALL,orphanRemoval = true)
    private Set<Profile> profiles =  new HashSet<>();
}
