package br.com.fiap.projetoglobalsolutions.Database.dao

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import br.com.fiap.projetoglobalsolutions.Model.Email
import br.com.fiap.projetoglobalsolutions.Model.Evento
import br.com.fiap.projetoglobalsolutions.Model.Usuario

@Database(entities = [Usuario::class,Email::class,Evento::class], version = 1)
abstract class DatabaseDb:RoomDatabase() {
    abstract fun usuarioDao():UsuarioDAO
    abstract fun emailDao():EmailDAO
    abstract fun eventoDao():EventoDAO

    companion object {

        private lateinit var instance: DatabaseDb

        fun getDatabase(context: Context): DatabaseDb {
            if (!::instance.isInitialized) {
                instance = Room
                    .databaseBuilder(
                        context,
                        DatabaseDb::class.java,
                        "database_db"
                    )
                    .allowMainThreadQueries()
                    .fallbackToDestructiveMigration()
                    .build()
            }
            return instance
        }
    }

}