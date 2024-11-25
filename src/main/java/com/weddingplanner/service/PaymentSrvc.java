package com.weddingplanner.service;

import com.weddingplanner.model.Payment;
import com.weddingplanner.repository.PaymentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentSrvc {

    @Autowired
    private PaymentRepo paymentRepo;

    public Payment recordPayment(Payment payment) {
        return paymentRepo.save(payment);
    }

    public List<Payment> getAllPayments(boolean isCompleted) {
        return paymentRepo.findByIsCompleted(isCompleted);
    }
}
