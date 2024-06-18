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
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.com.fiap.projetoglobalsolutions.Database.dao.UsuarioDAO
import br.com.fiap.projetoglobalsolutions.Database.repository.EmailRepository
import br.com.fiap.projetoglobalsolutions.Database.repository.UsuarioRepository
import br.com.fiap.projetoglobalsolutions.Screens.Cadastro.Cadastro
import br.com.fiap.projetoglobalsolutions.Screens.CaixaEntrada.CaixaEntrada
import br.com.fiap.projetoglobalsolutions.Screens.Enviados.Enviados
import br.com.fiap.projetoglobalsolutions.Screens.Excluidos.Excluidos
import br.com.fiap.projetoglobalsolutions.Screens.InformacoesEmail.InformacoesEmail
import br.com.fiap.projetoglobalsolutions.Screens.ListaEventos.ListaEventos
import br.com.fiap.projetoglobalsolutions.Screens.Login.Login
import br.com.fiap.projetoglobalsolutions.Screens.NovoEmail.NovoEmail
import br.com.fiap.projetoglobalsolutions.Screens.NovoEvento.NovoEvento
import br.com.fiap.projetoglobalsolutions.ViewModel.LoginViewModel
import br.com.fiap.projetoglobalsolutions.ui.theme.ProjetoGlobalSolutionsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ProjetoGlobalSolutionsTheme {
                Surface {
                    val context = LocalContext.current
                    val usuarioRepository = UsuarioRepository(context)
                    val emailRepository = EmailRepository(context)
                    val navController = rememberNavController()



                    NavHost(navController = navController, startDestination = "/cadastro") {
                        composable("/login") {
                            Login(navController = navController)
                        }
                        composable("/cadastro") {
                            Cadastro(navController = navController)
                        }
                        composable("/inbox") {
                            CaixaEntrada(titulo = "Inbox", navController = navController)
                        }
                        composable("/enviados") {
                            Enviados(titulo = "Enviados", navController = navController)
                        }
                        composable("/excluidos") {
                            Excluidos(navController = navController)
                        }
                        composable("/novoEmail") {
                            NovoEmail(navController = navController)
                        }
                        composable("/eventos") {
                            ListaEventos(navController = navController)
                        }
                        composable("/novoEvento") {
                            NovoEvento(navController = navController)
                        }
                        composable("/infos/{destinatario}/{remetente}/{assunto}/{corpo}") { navBackStackEntry ->
                            val destinatario = navBackStackEntry.arguments?.getString("destinatario")
                            val remetente = navBackStackEntry.arguments?.getString("remetente")
                            val assunto = navBackStackEntry.arguments?.getString("assunto")
                            val corpo = navBackStackEntry.arguments?.getString("corpo")
                            InformacoesEmail(
                                destinatario = destinatario.orEmpty(),
                                remetente = remetente.orEmpty(),
                                assunto = assunto.orEmpty(),
                                corpo = corpo.orEmpty(),
                                navController = navController
                            )
                        }
                    }



                }
                }
            }
        }
    }


