package com.pocketpharmacy.api.domain.exception

class MedicineNotFoundException(
    medicineId: String
) : Exception("Medicine not found with id: $medicineId")
