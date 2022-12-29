package com.movies.acmeflix.model;

import com.movies.acmeflix.model.UserModel.PaymentMethod;
import com.movies.acmeflix.model.UserModel.SubscriptionPlan;
import lombok.Data;

@Data
public class Account extends BaseModel {

    private String email;
    private String password;
    private PaymentMethod paymentMethod;
    private SubscriptionPlan subscriptionPlan;

}
