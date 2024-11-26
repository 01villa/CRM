package com.example.CRM.entity

import jakarta.persistence.*
import java.time.LocalDate
import java.util.*

@Entity
@Table(name = "invoice")
class Invoice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false)
    var id: Long? = null
    @Column(nullable = false)
    var code: String? = null
    @Column(nullable = false)
    var createdAt: Date? = null
    @Column(nullable = false, columnDefinition = "Decimal (5,2)")
    var total: Double? = null

    @ManyToOne
    @JoinColumn(referencedColumnName = "id")
    var client: Client? = null
}