package com.pocketpharmacy.api.testbuilders.application.resource.request

import com.pocketpharmacy.api.application.resource.request.CreateMedicineRequest
import java.time.LocalDate

class CreateMedicineRequestTestBuilder {
    companion object {
        private val instance = CreateMedicineRequestTestBuilder()
        val default: CreateMedicineRequest = instance.build()
    }

    fun build(
        name: String = "Xanax",
        description: String = "Domestic painkiller.",
        amount: Double = 20.0,
        dailyDosageAmount: Double = 1.5,
        unit: String = "mg",
        expirationDate: LocalDate = LocalDate.of(2099, 1, 1),
        needPrescription: Boolean = false,
        quantity: Int = 20
    ): CreateMedicineRequest {
        return CreateMedicineRequest(
            name,
            description,
            amount,
            dailyDosageAmount,
            unit,
            expirationDate,
            needPrescription,
            quantity
        )
    }
}
