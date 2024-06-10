package br.com.fiap.projetoglobalsolutions

import android.os.Bundle
import android.provider.Telephony.Mms.Inbox
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.com.fiap.projetoglobalsolutions.Screens.Cadastro.Cadastro
import br.com.fiap.projetoglobalsolutions.Screens.CaixaEntrada.CaixaEntrada
import br.com.fiap.projetoglobalsolutions.Screens.Enviados.Enviados
import br.com.fiap.projetoglobalsolutions.Screens.Excluidos.Excluidos
import br.com.fiap.projetoglobalsolutions.Screens.ListaEventos.ListaEventos
import br.com.fiap.projetoglobalsolutions.Screens.Login.Login
import br.com.fiap.projetoglobalsolutions.Screens.NovoEmail.NovoEmail
import br.com.fiap.projetoglobalsolutions.Screens.NovoEvento.NovoEvento
import br.com.fiap.projetoglobalsolutions.ui.theme.ProjetoGlobalSolutionsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ProjetoGlobalSolutionsTheme {
                Surface {
                    val navController = rememberNavController()
                    NavHost(navController = navController,
                        startDestination = "login"){
                        composable("login"){
                            Login(navController = navController)
                        }
                        composable("cadastro"){
                            Cadastro(navController = navController)
                        }
                        composable("inbox"){
                            CaixaEntrada(titulo = "Inbox", navController = navController)
                        }
                        composable("enviados"){
                            Enviados(titulo = "Enviados", navController = navController)
                        }
                        composable("excluidos"){
                            Excluidos(titulo = "Excluídos", navController = navController)
                        }
                        composable("novoEmail"){
                            NovoEmail(navController = navController)}
                        composable("eventos"){
                            ListaEventos(navController = navController)}
                        composable("novoEvento"){
                            NovoEvento(navController)}
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ProjetoGlobalSolutionsTheme {
        Greeting("Android")
    }
}