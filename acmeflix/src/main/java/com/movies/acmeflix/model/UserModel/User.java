package com.movies.acmeflix.model.UserModel;

import com.movies.acmeflix.model.BaseModel;
import lombok.Data;

@Data
public class User extends BaseModel {

    private String email;
    private String password;
    private PaymentMethod paymentMethod;
    private SubscriptionPlan subscriptionPlan;

}
