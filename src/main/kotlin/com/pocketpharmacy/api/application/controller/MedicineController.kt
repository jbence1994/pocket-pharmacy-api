package com.pocketpharmacy.api.application.controller

import com.pocketpharmacy.api.application.constants.RouteConstants.ID
import com.pocketpharmacy.api.application.constants.RouteConstants.MEDICINES
import com.pocketpharmacy.api.application.resource.response.DosageResponse
import com.pocketpharmacy.api.application.resource.response.MedicineResponse
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.time.LocalDate

@RestController
@RequestMapping(MEDICINES)
class MedicineController {

    @Suppress("MagicNumber")
    private val medicine1: MedicineResponse = MedicineResponse(
        id = 1,
        name = "Xanax",
        description = "Domestic painkiller.",
        amount = 20.0,
        unit = "mg",
        expirationDate = LocalDate.of(2023, 1, 1),
        needPrescription = false,
        quantity = 20,
        dosage = DosageResponse(1, 2, 1.5, "mg")
    )

    @Suppress("MagicNumber")
    private val medicine2: MedicineResponse = MedicineResponse(
        id = 2,
        name = "Rubophen",
        description = "For high fever.",
        amount = 20.0,
        unit = "mg",
        expirationDate = LocalDate.of(2024, 1, 1),
        needPrescription = true,
        quantity = 20,
        dosage = DosageResponse(2, 1, 2.0, "mg")
    )

    @GetMapping
    fun getMedicines(): ResponseEntity<List<MedicineResponse>> {
        val medicines: List<MedicineResponse> = listOf(medicine1, medicine2)
        return ResponseEntity(medicines, HttpStatus.OK)
    }

    @Suppress("MagicNumber")
    @GetMapping(ID)
    fun getMedicine(@PathVariable id: Int): ResponseEntity<MedicineResponse> {
        return when (id) {
            1 -> {
                ResponseEntity(medicine1, HttpStatus.OK)
            }
            2 -> {
                ResponseEntity(medicine2, HttpStatus.OK)
            }
            else -> {
                ResponseEntity(HttpStatus.NOT_FOUND)
            }
        }
    }
}
