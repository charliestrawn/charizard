package com.heroku.charizard.controller;

import com.heroku.charizard.domain.Payment;
import com.heroku.charizard.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class PaymentController {

    @Autowired PaymentService paymentService;

    @RequestMapping(value = "/payment")
    @ResponseBody
    public List<Payment> getAll() {
        return paymentService.getAll();
    }
}
