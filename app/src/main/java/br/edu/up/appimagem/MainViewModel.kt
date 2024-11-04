package br.edu.up.appimagem.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import br.edu.up.appimagem.data.AppDatabase
import br.edu.up.appimagem.model.Foto
import br.edu.up.appimagem.model.Categoria
import kotlinx.coroutines.launch

class MainViewModel(private val db: AppDatabase) : ViewModel() {
    val fotos = db.fotoDao().listar()
    val categorias = db.categoriaDao().listar()

    fun inserirFoto(foto: Foto) {
        viewModelScope.launch {
            db.fotoDao().inserir(foto)
        }
    }

    fun inserirCategoria(categoria: Categoria) {
        viewModelScope.launch {
            db.categoriaDao().inserir(categoria)
        }
    }

    // Métodos para atualizar e excluir também podem ser implementados
}
