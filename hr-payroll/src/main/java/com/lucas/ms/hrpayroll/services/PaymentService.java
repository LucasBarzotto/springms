package com.lucas.ms.hrpayroll.services;

import com.lucas.ms.hrpayroll.entities.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PaymentService {

    @Autowired
    private RestTemplate restTemplate;

    public Payment getPayment(long workerId, int days) {
        return new Payment("Bob", 200.0, days);
    }

}
