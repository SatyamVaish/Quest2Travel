package com.weddingplanner.service;

import com.weddingplanner.model.Vendor;
import com.weddingplanner.repository.VendorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VendorSrvc {

    @Autowired
    private VendorRepo vendorRepo;

    public Vendor addVendor(Vendor vendor) {
        return vendorRepo.save(vendor);
    }

    public Vendor updateAvailability(Long id, boolean isAvailable) {
        Vendor vendor = vendorRepo.findById(id).orElseThrow();
        vendor.setAvailable(isAvailable);
        return vendorRepo.save(vendor);
    }

    public List<Vendor> getAvailableVendors(String serviceType) {
        return vendorRepo.findByServiceTypeAndIsAvailableTrue(serviceType);
    }
}
