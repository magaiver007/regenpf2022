package com.movies.acmeflix.transfer.resources;


import com.movies.acmeflix.model.enumeration.PaymentMethod;
import com.movies.acmeflix.model.enumeration.SubscriptionPlan;
import lombok.Data;
import lombok.ToString;
import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;


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
    private Set<ProfileResource> profileResource = new HashSet<>();
    //private ProfileResource profileResource;

}
