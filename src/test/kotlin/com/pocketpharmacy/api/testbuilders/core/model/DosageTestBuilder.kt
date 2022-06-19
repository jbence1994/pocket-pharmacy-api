package com.pocketpharmacy.api.testbuilders.core.model

import com.pocketpharmacy.api.core.model.Dosage

class DosageTestBuilder {
    companion object {
        private val instance = DosageTestBuilder()
        val default: Dosage = instance.build()
    }

    private fun build(
        id: Int = 1,
        perDays: Int = 2,
        amount: Double = 1.5,
        unit: String = "mg"
    ): Dosage {
        return Dosage(id, perDays, amount, unit)
    }
}
