package br.com.fiap.projetoglobalsolutions.Model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "TB_EVENTO")
data class Evento(
    @PrimaryKey(autoGenerate = true)
    val id:Long,
    val nome:String,
    val data:String,
    val periodo:String,
    val local:String
)
