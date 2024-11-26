package com.example.CRM.service

import com.example.CRM.entity.Client
import com.example.CRM.repository.ClientRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ClientService {

    @Autowired
    lateinit var clientRepository: ClientRepository

    fun findAll(): List<Client> {
        return clientRepository.findAll()
    }

    fun findById(id: Long?): Client? {
        return clientRepository.findById(id)
    }

    fun save(client: Client) :Client {
        return clientRepository.save(client)
    }
}

