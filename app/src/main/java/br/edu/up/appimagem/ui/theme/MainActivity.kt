package br.edu.up.appimagem.ui.theme

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import br.edu.up.appimagem.data.AppDatabase
import br.edu.up.appimagem.MainViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val db = AppDatabase.getDatabase(applicationContext)
        val viewModel = MainViewModel(db)

        setContent {
            MaterialTheme {
                Surface {
                    // Chame a função que renderiza a interface aqui
                    // Exemplo: FotoScreen(viewModel)
                }
            }
        }
    }
}
