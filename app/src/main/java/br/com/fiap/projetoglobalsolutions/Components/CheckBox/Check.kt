package br.com.fiap.projetoglobalsolutions.Components.CheckBox

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun Check(situacao:Boolean, txt:String, funcao:(Boolean)->Unit) {
    Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
        Checkbox(checked = situacao, onCheckedChange = funcao, colors = CheckboxDefaults.colors(
            Color(0xfffdaa520)
        ))
        Spacer(modifier = Modifier.width(15.dp))
        Text(text = txt)
    }
}