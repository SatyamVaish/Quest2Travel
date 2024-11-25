package com.weddingplanner.repository;

import com.weddingplanner.model.Vendor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VendorRepo extends JpaRepository<Vendor, Long> {
    List<Vendor> findByServiceTypeAndIsAvailableTrue(String serviceType);
}
