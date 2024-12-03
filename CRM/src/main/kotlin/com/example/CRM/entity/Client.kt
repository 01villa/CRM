package com.example.CRM.entity

import jakarta.persistence.*


@Entity
@Table(name = "client")
class Client(
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id: Long? = null,
    @Column(name = "full_name")
    var fullName: String? = null,
    var age: Int? = null,
    var address: String? = null
)