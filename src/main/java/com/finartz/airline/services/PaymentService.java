package com.finartz.airline.services;

import com.finartz.airline.Utils.Util;
import com.finartz.airline.entities.Flight;
import com.finartz.airline.models.PaymentRequest;
import com.finartz.airline.models.PaymentResponse;
import com.finartz.airline.repository.FlightRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PaymentService {

    private final FlightService flightService;
    private final FlightRepository flightRepository;

    public PaymentResponse payTicket(PaymentRequest request) throws Exception {

        final Flight flight = flightService.getFlight(request.getFlightId());

        flight.setSold(flight.getSold() + 1);

        if (flight.getSold() >= flight.getTotalCapacity() / 10 && flight.getSold() % (flight.getTotalCapacity() / 10) == 0) {
            flight.setPrice(flight.getPrice() * 110 / 100);
        }

        flightRepository.save(flight);

        //payment status always true
        PaymentResponse paymentResponse = PaymentResponse.builder()
                .paymentStatus(true)
                .maskedCreditCardNumber(Util.maskCreditCard(request.getCreditCardNumber()))
                .build();

        return paymentResponse;
    }

}
