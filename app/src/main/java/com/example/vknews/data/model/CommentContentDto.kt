package com.example.vknews.data.model

import com.google.gson.annotations.SerializedName

data class CommentContentDto(
    @SerializedName("items") val comments: List<CommentDto>,
    @SerializedName("profiles") val profiles: List<ProfileDto>,
)
