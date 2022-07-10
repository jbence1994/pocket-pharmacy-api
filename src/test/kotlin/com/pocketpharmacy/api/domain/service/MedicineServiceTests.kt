package com.pocketpharmacy.api.domain.service

import com.pocketpharmacy.api.data.model.Medicine
import com.pocketpharmacy.api.data.repository.MedicineRepository
import com.pocketpharmacy.api.testbuilders.data.model.MedicineTestBuilder
import io.mockk.every
import io.mockk.mockk
import org.junit.jupiter.api.Assertions.assertNotNull
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class MedicineServiceTests {
    private val medicineRepository: MedicineRepository = mockk()
    private val medicineService = MedicineService(medicineRepository)

    @Test
    fun addMedicineTest() {
        every { medicineRepository.save(any()) } returns MedicineTestBuilder.default

        val medicine: Medicine = MedicineTestBuilder.afterRequestMapping
        val createdMedicine: Medicine = medicineService.addMedicine(medicine)
        assertNotNull(createdMedicine.id)
        assertNotNull(createdMedicine)
    }
}
