package com.example.app.SpringBootRestH2Employee.services;


import com.example.app.SpringBootRestH2Employee.entity.Client;
import com.example.app.SpringBootRestH2Employee.repository.ClientRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ClientService {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(ClientService.class);

    @Autowired
    ClientRepository repository;

    public List<Client> getAllClients() {
        LOGGER.info("MY_LOG: ClientService.getAllClients()");
        return new ArrayList<>(repository.findAll());
    }

    public ResponseEntity<Client> getClientById(int id) {
        LOGGER.info("MY_LOG: ClientService.getClientById(int id). ID: " + id);
        Optional<Client> client = repository.findById(id);
        return client.map(value ->
                ResponseEntity.ok().body(value)).orElseGet(() ->
                ResponseEntity.notFound().build());
    }

    public Client saveOrUpdate(Client client) {
        LOGGER.info("MY_LOG: ClientService.saveOrUpdate(Client client). Save " +
                client.getFirst_name() + ", " + client.getPhone());
        return repository.save(client);
    }

    public void deleteClientById(int id) {
        LOGGER.info("MY_LOG: ClientService.deleteClientById(int id). ID: " + id);
        repository.deleteById(id);
    }
}
