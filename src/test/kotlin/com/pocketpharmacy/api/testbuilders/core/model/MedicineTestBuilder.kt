package com.pocketpharmacy.api.testbuilders.core.model

import com.pocketpharmacy.api.core.model.Medicine
import java.time.LocalDate

class MedicineTestBuilder {
    companion object {
        private val instance = MedicineTestBuilder()
        val default: Medicine = instance.build()
        val expired: Medicine = instance.build(expirationDate = LocalDate.of(2022, 1, 1))
    }

    @Suppress("LongParameterList")
    private fun build(
        id: Int = 1,
        name: String = "Xanax",
        description: String = "Domestic painkiller.",
        amount: Double = 20.0,
        dailyDosageAmount: Double = 1.5,
        unit: String = "mg",
        expirationDate: LocalDate = LocalDate.of(2099, 1, 1),
        needPrescription: Boolean = false,
        quantity: Int = 20
    ): Medicine {
        return Medicine(id, name, description, amount, dailyDosageAmount, unit, expirationDate, needPrescription, quantity)
    }
}
