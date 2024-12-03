package com.example.CRM.dto

import org.jetbrains.annotations.NotNull
import java.time.LocalDate

class InvoiceDto {
    var id: Long? = null

    @NotNull(message = "Code is required")
    var code: String? = null

    @NotNull(message = "Total is required")
    var total: Double? = null

    var createdAt: LocalDate? = null

    @NotNull(message = "Client id is required")
    var clientId: Long? = null
}