package com.example.CRM.repository

import com.example.CRM.entity.Invoice
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface InvoiceRepository:JpaRepository<Invoice, Long> {
    fun findById(id: Long?): Invoice?
    fun findByClientId(clientId: Long?): List<Invoice>?
}