package com.example.dndhandbook.data.remote.dto.monster

import android.os.Parcelable
import com.example.dndhandbook.domain.models.base.DefaultObject
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class MonsterListDto(
    @SerializedName("count")
    val count: Int = 0,
    @SerializedName("results")
    val results: List<DefaultObject> = emptyList(),
) : Parcelable