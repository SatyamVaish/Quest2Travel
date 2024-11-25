package com.weddingplanner.controller;

import com.weddingplanner.model.Client;
import com.weddingplanner.service.ClientSrvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/clients")
public class ClientController {

    @Autowired
    private ClientSrvc clientSrvc;

    @PostMapping
    public Client createClient(@RequestBody Client client) {
        return clientSrvc.createClient(client);
    }

    @GetMapping("/{id}")
    public Optional<Client> getClientById(@PathVariable Long id) {
        return clientSrvc.getClientById(id);
    }

    @GetMapping
    public List<Client> getAllClients() {
        return clientSrvc.getAllClients();
    }
}
