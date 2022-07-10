package com.pocketpharmacy.api.application.resource.mapping.response

import com.pocketpharmacy.api.application.resource.response.MedicineResponse
import com.pocketpharmacy.api.data.model.Medicine
import com.pocketpharmacy.api.testbuilders.application.resource.response.MedicineResponseTestBuilder
import com.pocketpharmacy.api.testbuilders.data.model.MedicineTestBuilder
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class MedicineToMedicineResponseMapperTests {
    private val medicineToMedicineResponseMapper = MedicineToMedicineResponseMapper()

    @Test
    fun mapTest() {
        val expectedResult: MedicineResponse = MedicineResponseTestBuilder.default
        val medicine: Medicine = MedicineTestBuilder.default
        val result: MedicineResponse = medicineToMedicineResponseMapper.map(medicine)
        assertEquals(expectedResult, result)
    }
}
