package com.pocketpharmacy.api.domain.util

import com.pocketpharmacy.api.data.model.Medicine
import java.time.LocalDate

fun Medicine.isExpired(): Boolean = LocalDate.now() > expirationDate
