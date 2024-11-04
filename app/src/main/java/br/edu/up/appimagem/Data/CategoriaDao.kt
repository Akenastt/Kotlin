package br.edu.up.appimagem.Data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import androidx.room.Delete
import br.edu.up.appimagem.model.Categoria

@Dao
interface CategoriaDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun inserir(categoria: Categoria)

    @Query("SELECT * FROM categorias")
    suspend fun listar(): List<Categoria>

    @Update
    suspend fun atualizar(categoria: Categoria)

    @Delete
    suspend fun excluir(categoria: Categoria)
}
