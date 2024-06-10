package br.com.fiap.projetoglobalsolutions.Components.Footer

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Send
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun Footer(f1:()->Unit,f2:()->Unit,f3:()->Unit,f4:()->Unit,f5:()->Unit) {
    Column {
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceAround) {
            IconButton(onClick = { f1 }) {
                Icon(imageVector = Icons.Filled.Email, contentDescription = "Caixa de entrada", tint = Color(0xfffdaa520))
            }
            IconButton(onClick = { f2 }) {
                Icon(imageVector = Icons.Filled.Add, contentDescription = "Favoritos", tint = Color(0xfffdaa520))
            }
            IconButton(onClick = { f3 }) {
                Icon(imageVector = Icons.Filled.Star, contentDescription = "Enviados", tint = Color(0xfffdaa520))

            }
            IconButton(onClick = { f4 }) {
                Icon(imageVector = Icons.Filled.Send, contentDescription = "excluidos", tint = Color(0xfffdaa520))
            }
            IconButton(onClick = { f5 }) {
                Icon(imageVector = Icons.Filled.Delete, contentDescription = "excluidos", tint = Color(0xfffdaa520))
            }

        }
    }
}