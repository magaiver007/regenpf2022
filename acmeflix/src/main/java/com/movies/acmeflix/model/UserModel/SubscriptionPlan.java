package com.movies.acmeflix.model.UserModel;

public enum SubscriptionPlan {
    STARTER(5.99),BASIC(7.99),ADVANCED(9.99);

    private final double cost;

    SubscriptionPlan(double cost) {
        this.cost =cost;
    }
}
