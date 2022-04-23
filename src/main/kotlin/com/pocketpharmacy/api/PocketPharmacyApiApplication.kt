package com.pocketpharmacy.api

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PocketPharmacyApiApplication

fun main(args: Array<String>) {
    runApplication<PocketPharmacyApiApplication>(*args)
}
