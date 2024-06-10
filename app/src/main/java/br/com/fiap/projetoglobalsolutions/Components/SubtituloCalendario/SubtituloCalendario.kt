package br.com.fiap.projetoglobalsolutions.Components.SubtituloCalendario

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.capitalize
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.toUpperCase
import androidx.compose.ui.unit.sp
import java.time.LocalDate
import java.time.format.TextStyle
import java.util.Date
import java.util.Locale

@Composable
fun SubtituloCalendario() {
    val mes = LocalDate.now().month
    val mesTraduzido = mes.getDisplayName(TextStyle.FULL, Locale("pt", "BR"))
    Column(modifier = Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = "${mesTraduzido.capitalize()}", fontSize = 22.sp, color = Color(0xfffdaa520), fontWeight = FontWeight.Bold)
    }

}