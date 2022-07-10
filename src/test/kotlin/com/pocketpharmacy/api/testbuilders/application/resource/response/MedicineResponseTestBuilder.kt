package com.pocketpharmacy.api.testbuilders.application.resource.response

import com.pocketpharmacy.api.application.resource.response.MedicineResponse
import java.time.LocalDate

class MedicineResponseTestBuilder {
    companion object {
        private val instance = MedicineResponseTestBuilder()
        val default: MedicineResponse = instance.build()
    }

    fun build(
        id: String = "8a2b853a-c621-4289-913d-3bb950097e51",
        name: String = "Xanax",
        description: String = "Domestic painkiller.",
        amount: Double = 20.0,
        dailyDosageAmount: Double = 1.5,
        unit: String = "mg",
        expirationDate: LocalDate = LocalDate.of(2099, 1, 1),
        needPrescription: Boolean = false,
        quantity: Int = 20
    ): MedicineResponse {
        return MedicineResponse(
            id,
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
