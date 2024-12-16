package com.example.pertemuan10.ui.navigasi

interface AlamatNavigasi {
    val route: String
}

//Dari Sini yang berubah
object DestinasiHome : AlamatNavigasi {
    override val route = "home"
}

object DestinasiDetail : AlamatNavigasi {
    override val route = "detail"
    const val NIM = "nim"
    val routesWithArg = "$route/{$NIM}"
}

object DestinasiUpdate : AlamatNavigasi {
    override val route = "update"
    const val NIM = "nim"
    val routesWithArg = "$route/{$NIM}"
}