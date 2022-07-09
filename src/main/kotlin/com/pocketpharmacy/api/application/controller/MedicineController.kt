package com.pocketpharmacy.api.application.controller

import com.pocketpharmacy.api.application.constants.RouteConstants
import com.pocketpharmacy.api.application.resource.mapping.request.CreateMedicineRequestToMedicineMapper
import com.pocketpharmacy.api.application.resource.mapping.response.MedicineToMedicineResponseMapper
import com.pocketpharmacy.api.application.resource.request.CreateMedicineRequest
import com.pocketpharmacy.api.application.resource.response.MedicineResponse
import com.pocketpharmacy.api.data.model.Medicine
import com.pocketpharmacy.api.domain.service.MedicineService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(RouteConstants.MEDICINES)
class MedicineController(
    private val medicineService: MedicineService,
    private val createMedicineRequestToMedicineMapper: CreateMedicineRequestToMedicineMapper,
    private val medicineToMedicineResponseMapper: MedicineToMedicineResponseMapper
) {

    @GetMapping
    fun getMedicines(): ResponseEntity<List<MedicineResponse>> {
        throw NotImplementedError("Operation not yet implemented.")
    }

    @GetMapping(RouteConstants.ID)
    fun getMedicine(@PathVariable id: Int): ResponseEntity<MedicineResponse> {
        throw NotImplementedError("Operation not yet implemented.")
    }

    @PostMapping
    fun createMedicine(@RequestBody request: CreateMedicineRequest): ResponseEntity<MedicineResponse> {
        val medicine: Medicine = createMedicineRequestToMedicineMapper.map(request)
        val createdMedicine: Medicine = medicineService.addMedicine(medicine)
        val medicineResponse: MedicineResponse = medicineToMedicineResponseMapper.map(createdMedicine)
        return ResponseEntity(medicineResponse, HttpStatus.CREATED)
    }
}
