package com.paymentservice.controller;

import com.paymentservice.configuration.PaymentClient;
import com.paymentservice.domain.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payments")
public class PaymentController {

    private PaymentClient paymentClient;

    @Autowired
    public PaymentController(PaymentClient paymentClient) {
        this.paymentClient = paymentClient;
    }

    @GetMapping("/{paymentId}")
    public Payment getPayment(@PathVariable Long paymentId) {
        return new Payment(1L,"order345",19.9,true);
    }

    @GetMapping
    public String getPayment() {
        return "Payments... Ohh No!";
    }

}
