package com.finartz.airline.entities;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "routes")
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Route {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "from_airline_id")
    private Integer fromAirlineId;

    @Column(name = "to_airline_id")
    private Integer toAirlineId;
}
