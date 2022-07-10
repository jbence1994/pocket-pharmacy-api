package com.pocketpharmacy.api.domain.service

import com.pocketpharmacy.api.constants.MEDICINE_ID
import com.pocketpharmacy.api.data.model.Medicine
import com.pocketpharmacy.api.data.repository.MedicineRepository
import com.pocketpharmacy.api.domain.exception.MedicineNotFoundException
import com.pocketpharmacy.api.testbuilders.data.model.MedicineTestBuilder
import io.mockk.every
import io.mockk.mockk
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNotNull
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.springframework.boot.test.context.SpringBootTest
import java.util.Optional

@SpringBootTest
class MedicineServiceTests {
    private val medicineRepository: MedicineRepository = mockk()
    private val medicineService = MedicineService(medicineRepository)

    @Test
    fun getMedicineTest_HappyPath() {
        every { medicineRepository.findById(any()) } returns Optional.of(MedicineTestBuilder.default)

        val expectedResult: Medicine = MedicineTestBuilder.default
        val medicine: Medicine = medicineService.getMedicine(MEDICINE_ID)
        assertEquals(expectedResult, medicine)
    }

    @Test
    fun getMedicineTest_UnhappyPath() {
        every { medicineRepository.findById(any()) } returns Optional.ofNullable(null)

        assertThrows<MedicineNotFoundException> {
            medicineService.getMedicine(MEDICINE_ID)
        }
    }

    @Test
    fun addMedicineTest() {
        every { medicineRepository.save(any()) } returns MedicineTestBuilder.default

        val medicine: Medicine = MedicineTestBuilder.afterRequestMapping
        val createdMedicine: Medicine = medicineService.addMedicine(medicine)
        assertNotNull(createdMedicine.id)
        assertNotNull(createdMedicine)
    }
}
