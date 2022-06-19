package com.pocketpharmacy.api.core.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class Dosage(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int = 0,

    val perDays: Int = 0,
    val amount: Double = 0.0,
    val unit: String = ""
)