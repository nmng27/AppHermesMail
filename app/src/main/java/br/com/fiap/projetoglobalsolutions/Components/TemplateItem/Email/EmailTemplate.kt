package br.com.fiap.projetoglobalsolutions.Components.TemplateItem.Email

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import br.com.fiap.projetoglobalsolutions.Model.Email

@Composable
fun EmailTemplate(email: Email,f1:()->Unit) {
    Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
        Column {
            Text(text = email.destinatario, color = Color(0xfffdaa520), fontWeight = FontWeight.Bold, fontSize = 25.sp)
            Text(text = email.assunto, color = Color(0xfffdaa520), fontSize = 18.sp)
        }
        IconButton(onClick = { f1 }) {
            Icon(imageVector = Icons.Filled.KeyboardArrowRight, contentDescription = "", tint = Color(0xfffdaa520))
        }
    }
}