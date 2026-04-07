package com.example.jpah2demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
public class CustomerController {

    @Autowired
    private CustomerRepository repo;

    @PostMapping("/addClient")
    public ResponseEntity<Customer> addClient(@RequestBody Customer c) {
        return ResponseEntity.ok(repo.save(c));
    }

    @GetMapping("/findAllClients")
    public ResponseEntity<List<Customer>> findAllClients() {
        return ResponseEntity.ok(repo.findAll());
    }

    @GetMapping("/findClientById/{id}")
    public ResponseEntity<Customer> findClientById(@PathVariable Long id) {
        return ResponseEntity.of(repo.findById(id));
    }

    @DeleteMapping("/removeClientById/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void removeCustomer(@PathVariable Long id) {
        repo.deleteById(id);
    }

    @PutMapping("/updateClientById/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateCustomer(@PathVariable Long id, @RequestBody Customer c) {
        c.setId(id);
        repo.save(c);
    }
}
