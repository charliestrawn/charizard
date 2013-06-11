package com.heroku.charizard.controller;

import com.heroku.charizard.domain.Payment;
import com.heroku.charizard.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.*;

@Controller
public class PaymentController {

    @Autowired PaymentService paymentService;

    @RequestMapping(value = "/payments")
    @ResponseBody
    public List<Payment> getAll() {
        return paymentService.getAll();
    }

    @RequestMapping(value = "/payments", method = POST)
    public void add(@ModelAttribute Payment payment) {
        paymentService.add(payment);
    }
}
