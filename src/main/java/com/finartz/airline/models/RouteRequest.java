package com.finartz.airline.models;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class RouteRequest {

    private Integer fromAirlineId;
    private Integer toAirlineId;
}
