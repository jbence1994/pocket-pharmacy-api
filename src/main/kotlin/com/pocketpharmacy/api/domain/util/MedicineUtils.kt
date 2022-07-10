package com.pocketpharmacy.api.domain.util

import com.pocketpharmacy.api.data.model.Medicine
import java.time.LocalDate

// TODO: later extract 'LocalDate.now()' to separate component to fake a static value
fun Medicine.isExpired(): Boolean = LocalDate.now() > expirationDate
