package br.com.fiap.projetoglobalsolutions.Model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "TB_USUARIO")
data class Usuario(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "ID_USUARIO")
    val id:Long,
    @ColumnInfo(name = "NOME_USUARIO")
    val nome:String,
    @ColumnInfo(name = "EMAIL_USUARIO")
    val email:String,
    @ColumnInfo(name = "TELEFONE_USUARIO")
    val telefone:String,
    @ColumnInfo(name = "RESPONSAVEL_USUARIO")
    val responsavel:Boolean,
    @ColumnInfo(name = "SENHA_USUARIO")
    val senha:String)
