package com.pocketpharmacy.api.data.model

import com.pocketpharmacy.api.domain.util.isExpired
import com.pocketpharmacy.api.testbuilders.data.model.MedicineTestBuilder
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import org.springframework.boot.test.context.SpringBootTest
import java.util.stream.Stream

@SpringBootTest
class MedicineTests {

    companion object {
        @JvmStatic
        fun isExpiredTestParams(): Stream<Arguments> {
            return Stream.of(
                Arguments.of("Medicine is expired", MedicineTestBuilder.expired, true),
                Arguments.of("Medicine is not expired", MedicineTestBuilder.default, false)
            )
        }
    }

    @ParameterizedTest(name = "{index} => {0}")
    @MethodSource("isExpiredTestParams")
    fun isExpiredTest(
        testCase: String,
        medicine: Medicine,
        expectedResult: Boolean
    ) {
        assertEquals(expectedResult, medicine.isExpired())
    }
}
