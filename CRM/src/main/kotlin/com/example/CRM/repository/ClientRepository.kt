package com.example.CRM.repository

import com.example.CRM.entity.Client
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ClientRepository: JpaRepository<Client, Long> {
    fun findById(id: Long?): Client?
}