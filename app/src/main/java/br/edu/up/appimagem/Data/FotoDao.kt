package br.edu.up.appimagem.Data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import androidx.room.Delete
import br.edu.up.appimagem.model.Foto

@Dao
interface FotoDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun inserir(foto: Foto)

    @Query("SELECT * FROM fotos")
    suspend fun listar(): List<Foto>

    @Update
    suspend fun atualizar(foto: Foto)

    @Delete
    suspend fun excluir(foto: Foto)
}
