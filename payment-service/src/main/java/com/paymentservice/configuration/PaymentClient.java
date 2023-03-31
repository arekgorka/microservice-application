package com.paymentservice.configuration;

import com.paymentservice.domain.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient("payment-service")
public interface PaymentClient {

    @GetMapping("payments/{paymentId}")
    Payment getPayment(@PathVariable Long paymentId);
}
