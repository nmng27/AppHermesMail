package br.com.fiap.projetoglobalsolutions.Components.TemplateItem.Calendario

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import br.com.fiap.projetoglobalsolutions.Model.Evento
import br.com.fiap.projetoglobalsolutions.ui.theme.ProjetoGlobalSolutionsTheme

@Composable
fun CalendarioTemplate(evento: Evento,f1:()->Unit) {
    Column(modifier = Modifier.fillMaxWidth()) {
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Absolute.SpaceBetween) {
            Text(text = evento.nome, color = Color(0xfffdaa520), fontWeight = FontWeight.Bold, fontSize = 30.sp)
            IconButton(onClick = { f1 }) {
                Icon(imageVector = Icons.Filled.Delete,
                    contentDescription = "", tint = Color(0xfffdaa520))
            }
        }
    }
}

