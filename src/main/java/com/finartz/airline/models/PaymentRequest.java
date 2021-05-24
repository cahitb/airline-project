package com.finartz.airline.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PaymentRequest {

    private Integer flightId;
    private String creditCardNumber;
}
