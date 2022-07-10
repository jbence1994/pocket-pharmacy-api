package com.pocketpharmacy.api.application.resource.request

import java.time.LocalDate

data class CreateMedicineRequest(
    val name: String = "",
    val description: String = "",
    val amount: Double = 0.0,
    val dailyDosageAmount: Double = 0.0,
    val unit: String = "",
    val expirationDate: LocalDate = LocalDate.of(0, 1, 1),
    val needPrescription: Boolean = false,
    val quantity: Int = 0
)
