package com.guido.outcoding.model

import com.google.gson.annotations.SerializedName

data class ModelItem(
    @SerializedName("_id") val id: String,
    val tags: List<String>,
    val owner: String?,
    val createdAt: String,
    val updatedAt: String
)