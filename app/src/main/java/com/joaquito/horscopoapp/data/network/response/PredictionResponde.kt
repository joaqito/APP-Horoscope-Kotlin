package com.joaquito.horscopoapp.data.network.response

import android.graphics.drawable.Icon
import com.google.gson.annotations.SerializedName
import com.joaquito.horscopoapp.domain.model.PredictionModel

//tomamos y serlializamos la respuesta de internet y la enviamos al dominio
data class PredictionResponde(
    @SerializedName("date") val date: String,
    @SerializedName("horoscope") val horoscope: String,
    @SerializedName("sign") val sign: String,

    ) {
    fun toDomain(): PredictionModel {
        return PredictionModel(horoscope = horoscope, sign = sign)
    }
}
