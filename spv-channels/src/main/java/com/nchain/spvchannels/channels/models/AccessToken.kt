package com.nchain.spvchannels.channels.models

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AccessToken(
    @Json(name = "id") val id: String?,
    @Json(name = "token") val token: String?,
    @Json(name = "description") val description: String?,
    @Json(name = "can_read") val readable: Boolean,
    @Json(name = "can_write") val writable: Boolean,
)
