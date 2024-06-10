package br.com.fiap.projetoglobalsolutions.Components.Footer

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Create
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Send
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun FooterEmail(f1:()->Unit,f2:()->Unit,f3:()->Unit,f4:()->Unit) {
    Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
       IconButton(onClick = { f1 }) {
           Icon(imageVector = Icons.Filled.Create, contentDescription = "Responder", tint = Color(0xfffdaa520))
       }
        IconButton(onClick = { f2 }) {
            Icon(imageVector = Icons.Filled.Send, contentDescription = "Encaminhar", tint = Color(0xfffdaa520))
        }
        IconButton(onClick = { f3 }) {
            Icon(imageVector = Icons.Filled.Star, contentDescription = "Favoritar", tint = Color(0xfffdaa520))
        }
        IconButton(onClick = { f4 }) {
            Icon(imageVector = Icons.Filled.Delete, contentDescription = "Excluir", tint = Color(0xfffdaa520))
        }

    }
}