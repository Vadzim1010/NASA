package com.example.nasa.data.model

import com.example.nasa.data.network.Collection
import com.google.gson.annotations.SerializedName

internal data class NasaImageDto(
    @SerializedName("collection")
    val collection: Collection
)
