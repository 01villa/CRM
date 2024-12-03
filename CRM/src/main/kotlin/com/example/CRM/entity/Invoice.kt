package com.example.CRM.entity

import jakarta.persistence.*
import java.time.LocalDate
import java.util.*

@Entity
@Table(name = "invoice")
class Invoice {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    var id: Long? = null
    @Column(name = "code")
    var code: String? = null
    var createdAt: LocalDate? = LocalDate.now()
    var total: Double? = null
    @ManyToOne
    @JoinColumn(name = "client_id")
    var client: Client? = null
}