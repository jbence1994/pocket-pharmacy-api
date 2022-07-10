package com.pocketpharmacy.api.application.resource.mapping.response

import com.pocketpharmacy.api.application.resource.mapping.Mapper
import com.pocketpharmacy.api.application.resource.response.MedicineResponse
import com.pocketpharmacy.api.data.model.Medicine
import org.springframework.stereotype.Component

@Component
class MedicineToMedicineResponseMapper : Mapper<Medicine, MedicineResponse> {

    override fun map(from: Medicine): MedicineResponse {
        return MedicineResponse(
            id = from.id,
            name = from.name,
            description = from.description,
            amount = from.amount,
            dailyDosageAmount = from.dailyDosageAmount,
            unit = from.unit,
            expirationDate = from.expirationDate,
            needPrescription = from.needPrescription,
            quantity = from.quantity
        )
    }
}
