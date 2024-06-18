package br.com.fiap.projetoglobalsolutions.Screens.ListaEventos

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import br.com.fiap.projetoglobalsolutions.Components.Botao.Botao
import br.com.fiap.projetoglobalsolutions.Components.Footer.FooterCalendario
import br.com.fiap.projetoglobalsolutions.Components.Header.Header
import br.com.fiap.projetoglobalsolutions.Components.SubtituloCalendario.SubtituloCalendario
import br.com.fiap.projetoglobalsolutions.Components.TemplateItem.Calendario.CalendarioTemplate
import br.com.fiap.projetoglobalsolutions.Database.repository.EventoRepository
import br.com.fiap.projetoglobalsolutions.ui.theme.ProjetoGlobalSolutionsTheme

@Composable
fun ListaEventos(navController: NavController) {
    val context = LocalContext.current
    val eventoRepository = EventoRepository(context)
    val lista = eventoRepository.listar()
    Column(modifier = Modifier.fillMaxSize(),verticalArrangement = Arrangement.SpaceBetween) {
        Header(txt = "Meus Eventos")
        SubtituloCalendario()
        for(i in lista){
            CalendarioTemplate(evento = i,{})
        }

        FooterCalendario({ navController.navigate("inbox") },funcao = { navController.navigate("novoEvento") }, txt = "Novo Evento")
        }
    }


