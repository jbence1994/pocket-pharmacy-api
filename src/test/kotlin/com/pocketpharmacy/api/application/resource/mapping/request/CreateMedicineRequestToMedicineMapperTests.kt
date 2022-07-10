package com.pocketpharmacy.api.application.resource.mapping.request

import com.pocketpharmacy.api.application.resource.request.CreateMedicineRequest
import com.pocketpharmacy.api.data.model.Medicine
import com.pocketpharmacy.api.testbuilders.application.resource.request.CreateMedicineRequestTestBuilder
import com.pocketpharmacy.api.testbuilders.data.model.MedicineTestBuilder
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class CreateMedicineRequestToMedicineMapperTests {
    private val createMedicineRequestToMedicineMapper = CreateMedicineRequestToMedicineMapper()

    @Test
    fun mapTest() {
        val expectedResult: Medicine = MedicineTestBuilder.afterRequestMapping
        val createMedicineRequest: CreateMedicineRequest = CreateMedicineRequestTestBuilder.default
        val result: Medicine = createMedicineRequestToMedicineMapper.map(createMedicineRequest)
        assertEquals(expectedResult, result)
    }
}
