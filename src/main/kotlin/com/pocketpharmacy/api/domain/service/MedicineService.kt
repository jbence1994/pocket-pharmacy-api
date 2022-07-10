package com.pocketpharmacy.api.domain.service

import com.pocketpharmacy.api.data.model.Medicine
import com.pocketpharmacy.api.data.repository.MedicineRepository
import org.springframework.stereotype.Service
import java.util.UUID

@Service
class MedicineService(
    private val medicineRepository: MedicineRepository
) {
    fun addMedicine(medicine: Medicine): Medicine {
        // TODO: later extract 'UUID.randomUUID().toString()' to separate component to be able to fake a static value
        medicine.id = UUID.randomUUID().toString()
        return medicineRepository.save(medicine)
    }
}
