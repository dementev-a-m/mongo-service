package ru.dementev.mongoservice.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.dementev.mongoservice.entity.Client;
import ru.dementev.mongoservice.repository.MongoService;

@RestController
@RequiredArgsConstructor
public class ClientController {

    private final MongoService mongoService;

    @GetMapping("/client/get")
    public Client getClientById(@RequestParam Long id){
        return mongoService.findById(id,Client.class);
    }

    @PostMapping("/client/save")
    public Client saveClient(@RequestBody Client client){
        return mongoService.save(client);
    }
}
