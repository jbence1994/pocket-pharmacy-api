package com.pocketpharmacy.api.data.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDate

@Document
data class Medicine(
    @Id
    val id: String = "",
    val name: String = "",
    val description: String = "",
    val amount: Double = 0.0,
    val dailyDosageAmount: Double = 0.0,
    val unit: String = "",
    val expirationDate: LocalDate = LocalDate.of(0, 1, 1),
    val needPrescription: Boolean = false,
    val quantity: Int = 0
) {
    fun isExpired(): Boolean = LocalDate.now() > expirationDate
}
