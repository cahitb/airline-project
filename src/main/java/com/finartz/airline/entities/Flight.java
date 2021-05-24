package com.finartz.airline.entities;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "flights")
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "company_id")
    private Integer companyId;

    @Column(name = "route_id")
    private Integer routeId;

    @Column(name = "price")
    private Integer price;

    @Column(name = "capacity")
    private Integer totalCapacity;

    @Column(name = "sold")
    private Integer sold;
}
