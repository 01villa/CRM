package com.example.CRM.controller

import com.example.CRM.entity.Invoice
import com.example.CRM.service.InvoiceService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/invoice")
class InvoiceController {

    @Autowired

    lateinit var invoiceService: InvoiceService

    @GetMapping
    fun finAll(): List<Invoice> {
        return invoiceService.findAll()
    }

    @GetMapping("/{id}")
    fun findById(@PathVariable("id") id: Long): Invoice? {
        return invoiceService.findById(id)
    }

    @PostMapping
    fun save(@RequestBody invoice: Invoice): Invoice {
        return invoiceService.save(invoice)
    }
}