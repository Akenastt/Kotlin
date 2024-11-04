package br.edu.up.appimagem.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "fotos")
data class Foto(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val categoriaId: Int,
    val titulo: String,
    val descricao: String,
    val urlImagem: String
)
