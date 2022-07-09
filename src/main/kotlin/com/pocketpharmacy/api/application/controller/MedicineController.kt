package com.pocketpharmacy.api.application.controller

import com.pocketpharmacy.api.application.constants.RouteConstants
import com.pocketpharmacy.api.application.resource.request.CreateMedicineRequest
import com.pocketpharmacy.api.application.resource.response.MedicineResponse
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(RouteConstants.MEDICINES)
class MedicineController {

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
        throw NotImplementedError("Operation not yet implemented.")
    }
}
