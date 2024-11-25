package com.weddingplanner.repository;

import com.weddingplanner.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PaymentRepo extends JpaRepository<Payment, Long> {
    List<Payment> findByIsCompleted(boolean isCompleted);
}
