package br.senai.sp.jandira.rickandmorty.model

data class CharacterList(
    var info: Info, // criei uma classe info pra receber todos os objetos da API
    val results: List<Character>
)
