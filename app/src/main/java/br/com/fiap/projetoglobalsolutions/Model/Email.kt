package br.com.fiap.projetoglobalsolutions.Model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "TB_EMAIL")
data class Email(
    @PrimaryKey(autoGenerate = true)
    val id:Long,
    val remetente:String,
    val destinatario:String,
    val assunto:String,
    val corpo:String,
    val favorito:Boolean
)