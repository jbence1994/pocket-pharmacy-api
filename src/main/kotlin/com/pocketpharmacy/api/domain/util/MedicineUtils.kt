package com.pocketpharmacy.api.domain.util

import com.pocketpharmacy.api.data.model.Medicine

fun Medicine.isExpired(): Boolean = getLocalDateNow() > expirationDate
