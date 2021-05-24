package com.finartz.airline.controllers;

import com.finartz.airline.models.PaymentRequest;
import com.finartz.airline.models.PaymentResponse;
import com.finartz.airline.services.PaymentService;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("api/v1/airline")
public class PaymentController {

    private final PaymentService paymentService;

    @PostMapping(value = "/payment/pay", consumes = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<PaymentResponse> makePayment(@RequestBody PaymentRequest request) throws Exception {
        return ResponseEntity.ok(paymentService.payTicket(request));
    }
}
