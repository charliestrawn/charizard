package com.heroku.charizard.service;

import com.heroku.charizard.domain.Payment;
import com.heroku.charizard.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentService {

    @Autowired
    PaymentRepository paymentRepository;

    public List<Payment> getAll() {
        return paymentRepository.getAll();
    }
}
