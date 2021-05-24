package com.finartz.airline.models;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class PaymentResponse {

    private boolean paymentStatus;
    private String maskedCreditCardNumber;
}
