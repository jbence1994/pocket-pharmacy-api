package com.pocketpharmacy.api.data.repository

import com.pocketpharmacy.api.data.model.Medicine
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface MedicineRepository : MongoRepository<Medicine, String>
