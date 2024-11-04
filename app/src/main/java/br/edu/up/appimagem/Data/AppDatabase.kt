package br.edu.up.appimagem.Data

import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import br.edu.up.appimagem.model.Foto
import br.edu.up.appimagem.model.Categoria
import android.content.Context

@Database(entities = [Foto::class, Categoria::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun fotoDao(): FotoDao
    abstract fun categoriaDao(): CategoriaDao

    companion object {
        @Volatile
        private var INSTANCE: AppDatabase? = null

        fun getDatabase(context: Context): AppDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    "app_database"
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }
}
