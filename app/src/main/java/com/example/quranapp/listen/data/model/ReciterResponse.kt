package com.example.quranapp.listen.data.model

import com.google.gson.annotations.SerializedName

data class ReciterResponse(
    @SerializedName("reciters") var reciters: ArrayList<Reciters> = arrayListOf()
)

data class Moshaf(

    @SerializedName("id") var id: Int? = null,
    @SerializedName("name") var name: String? = null,
    @SerializedName("server") var server: String? = null,
    @SerializedName("surah_total") var surahTotal: Int? = null,
    @SerializedName("moshaf_type") var moshafType: Int? = null,
    @SerializedName("surah_list") var surahList: String? = null

)

data class Reciters(

    @SerializedName("id") var id: Int? = null,
    @SerializedName("name") var name: String? = null,
    @SerializedName("letter") var letter: String? = null,
    @SerializedName("moshaf") var moshaf: ArrayList<Moshaf> = arrayListOf()

)