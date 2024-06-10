package br.com.fiap.projetoglobalsolutions.Components.Input

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.fiap.projetoglobalsolutions.ui.theme.ProjetoGlobalSolutionsTheme

@Composable
fun Input(valor:String, funcao:(String)->Unit,txt_label:String,txt_placeholder:String, icone:ImageVector, visualTransformation: VisualTransformation, keyboardOptions: KeyboardOptions) {
    Column {
        TextField(value = valor,
            onValueChange = funcao,
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp),
            label = {
                Row {
                    Icon(imageVector = icone, contentDescription = "icone", tint = Color(0xfffdaa520))
                    Spacer(modifier = Modifier.width(15.dp))
                    Text(text = txt_label)
                }
            }, placeholder = {
                Text(text = txt_placeholder)
            }, keyboardOptions = keyboardOptions,
            visualTransformation = visualTransformation)
    }
}

