package com.nchain.spvchannels.channels.models.create

import com.nchain.spvchannels.channels.models.AccessToken
import com.nchain.spvchannels.channels.models.Retention
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CreateResponse(
    @Json(name = "id") val id: String?,
    @Json(name = "href") val href: String?,
    @Json(name = "public_read") val publicRead: Boolean,
    @Json(name = "public_write") val publicWrite: Boolean,
    @Json(name = "sequenced") val sequenced: Boolean,
    @Json(name = "locked") val locked: Boolean,
    @Json(name = "head") val head: Long,
    @Json(name = "retention") val retention: Retention,
    @Json(name = "access_tokens") val accessTokens: List<AccessToken>?,
)
