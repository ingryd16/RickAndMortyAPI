package br.senai.sp.jandira.rickandmorty.model

data class Info(
    val count:  Int,
    val pages:  Int,
    val next:  String?, //? significa q pode ser nulo
    val prev:  String?
)
