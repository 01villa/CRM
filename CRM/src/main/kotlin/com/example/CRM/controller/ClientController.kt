package com.example.CRM.controller

import com.example.CRM.entity.Client
import com.example.CRM.service.ClientService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("client")
class ClientController{

    @Autowired
    lateinit var clientService: ClientService

    @GetMapping
    fun findAll(): List<Client>{
        return clientService.findAll()
    }

    @GetMapping("/{id}")
    fun findById(@PathVariable id: Long): Client?{
        return clientService.findById(id)
    }

    @PostMapping
    fun save(@RequestBody client: Client): Client{
        return clientService.save(client)
    }
}