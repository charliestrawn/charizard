package com.heroku.charizard.repository;

import com.heroku.charizard.domain.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PaymentRepository {

    @Autowired MongoTemplate mongoTemplate;

    public List<Payment> getAll() {
        return mongoTemplate.findAll(Payment.class);
    }
}
