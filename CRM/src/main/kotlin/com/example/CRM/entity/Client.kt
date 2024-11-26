package com.example.CRM.entity

import jakarta.persistence.*


@Entity
@Table(name = "client")
class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false)
    var id: Long? = null
    @Column(unique = true, nullable = false)
    var fullName: String? = null
    @Column(nullable = false)
    var age: Int? = null
    @Column(nullable = false)
    var address: String? = null
}