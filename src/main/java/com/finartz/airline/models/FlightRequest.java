package com.finartz.airline.models;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class FlightRequest {

    private Integer companyId;
    private Integer routeId;
    private Integer price;
    private Integer capacity;
}
