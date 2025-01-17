package br.com.fiap.projetoglobalsolutions.Components.TextArea

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp

@Composable
fun TextArea(
    valor: String,
    funcao: (String) -> Unit,
    icone: ImageVector,
    txt_label: String,
    txt_placeholder: String,
    keyboardOptions: KeyboardOptions,
    visualTransformation: VisualTransformation
) {
    Column {
        TextField(value = valor,
            onValueChange = funcao,
            modifier = Modifier.height(200.dp) .fillMaxWidth() .padding(12.dp),
            label = {
                Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
                    Icon(imageVector = icone, contentDescription = "", tint = Color(0xfffdaa520))
                    Spacer(modifier = Modifier.width(10.dp))
                    Text(text = txt_label)
                }
            }, placeholder = {
                Text(text = txt_placeholder)
            },
            keyboardOptions = keyboardOptions,
            visualTransformation = visualTransformation)
    }
}