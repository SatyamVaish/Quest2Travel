package com.weddingplanner.controller;

import com.weddingplanner.model.Vendor;
import com.weddingplanner.service.VendorSrvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vendors")
public class VendorController {

    @Autowired
    private VendorSrvc vendorSrvc;

    @PostMapping
    public Vendor addVendor(@RequestBody Vendor vendor) {
        return vendorSrvc.addVendor(vendor);
    }

    @PutMapping("/{id}/updateAvailability")
    public Vendor updateAvailability(@PathVariable Long id, @RequestBody boolean availability) {
        return vendorSrvc.updateAvailability(id, availability);
    }

    @GetMapping("/available")
    public List<Vendor> getAvailableVendors(@RequestParam String serviceType) {
        return vendorSrvc.getAvailableVendors(serviceType);
    }
}
