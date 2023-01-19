package com.movies.acmeflix.model;


import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.movies.acmeflix.model.enumeration.PaymentMethod;
import com.movies.acmeflix.model.enumeration.SubscriptionPlan;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "ACCOUNTS")
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
}
