package com.pocketpharmacy.api.application.controller

import com.pocketpharmacy.api.application.constants.MockConstants.RUBOPHEN
import com.pocketpharmacy.api.application.constants.MockConstants.XANAX
import com.pocketpharmacy.api.application.constants.RouteConstants.ID
import com.pocketpharmacy.api.application.constants.RouteConstants.MEDICINES
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(MEDICINES)
class MedicineController {

    @GetMapping
    fun getMedicines(): ResponseEntity<List<String>> {
        return ResponseEntity(listOf("{ id: 1, name: $XANAX }", "{ id: 2, name: $RUBOPHEN }"), HttpStatus.OK)
    }

    @GetMapping(ID)
    fun getMedicine(@PathVariable id: Int): ResponseEntity<String> {
        return if (id <= 0 || id >= 3) {
            return ResponseEntity("Medicine not found with id: $id", HttpStatus.NOT_FOUND)
        } else if (id == 1) {
            ResponseEntity("{ id: $id, name: $XANAX }", HttpStatus.OK)
        } else {
            ResponseEntity("{ id: $id, name: $RUBOPHEN }", HttpStatus.OK)
        }
    }
}
