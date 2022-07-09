package com.pocketpharmacy.api.application.resource.mapping

interface Mapper<From, To> {
    fun map(from: From): To
}
