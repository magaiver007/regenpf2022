package com.movies.acmeflix.transfer.resources;

import com.movies.acmeflix.model.enumeration.PaymentMethod;
import com.movies.acmeflix.model.enumeration.SubscriptionPlan;
import lombok.*;

import javax.validation.constraints.NotNull;



@Data
@ToString(callSuper = true)


public class AccountResource extends BaseResource {
    @NotNull(message = "Account's email can't be null")
    private String email;
    @NotNull(message = "Account's Password can't be null")
    private String password;
    @NotNull(message = "Account's Subscription Plan can't be null")
    private SubscriptionPlan subscriptionPlan;
    @NotNull(message = "Account's Payment Method can't be null")
    private PaymentMethod paymentMethod;
//    private Set<ProfileResource> profiles = new HashSet<>();
//    private ProfileResource profileResource;

}
