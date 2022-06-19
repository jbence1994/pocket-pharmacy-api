package com.pocketpharmacy.api.application.resource.response

data class DosageResponse(
    val id: Int = 0,
    val perDays: Int = 0,
    val amount: Double = 0.0,
    val unit: String = ""
)
