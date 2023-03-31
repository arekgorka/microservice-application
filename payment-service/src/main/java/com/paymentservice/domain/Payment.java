package com.paymentservice.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Payment {
    Long id;
    String title;
    double amount;
    boolean isVerified;

    public Payment(Long id, String title, double amount, boolean isVerified) {
        this.id = id;
        this.title = title;
        this.amount = amount;
        this.isVerified = isVerified;
    }
}
