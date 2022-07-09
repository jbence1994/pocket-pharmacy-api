package com.pocketpharmacy.api.application.resource.mapping.request

import com.pocketpharmacy.api.application.resource.mapping.Mapper
import com.pocketpharmacy.api.application.resource.request.CreateMedicineRequest
import com.pocketpharmacy.api.data.model.Medicine
import org.springframework.stereotype.Component

@Component
class CreateMedicineRequestToMedicineMapper : Mapper<CreateMedicineRequest, Medicine> {

    override fun map(from: CreateMedicineRequest): Medicine {
        return Medicine(
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
