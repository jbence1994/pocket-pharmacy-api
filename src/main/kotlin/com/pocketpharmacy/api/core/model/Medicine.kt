package com.pocketpharmacy.api.core.model

import java.time.LocalDate
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "medicines")
data class Medicine(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int = 0,
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
