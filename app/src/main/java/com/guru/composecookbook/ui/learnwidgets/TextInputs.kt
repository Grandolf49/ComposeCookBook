package com.guru.composecookbook.ui.learnwidgets

import androidx.compose.foundation.Icon
import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.preferredSize
import androidx.compose.foundation.text.CoreTextField
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.TextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Email
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview
import com.guru.composecookbook.theme.typography

@Composable
fun TextInputs() {
    Text(text = "Text Inputs", style = typography.h6, modifier = Modifier.padding(8.dp))

    var text by remember { mutableStateOf(TextFieldValue("")) }

    // TODO Explore CoreTextField
    CoreTextField(
        value = text,
        onValueChange = { newValue -> text = newValue },
        modifier = Modifier.padding(8.dp).preferredSize(0.dp),
        cursorColor = Color.Magenta
    )
    TextField(
        value = text,
        onValueChange = { newValue -> text = newValue },
        modifier = Modifier.padding(8.dp).fillMaxWidth(),
        label = { Text("label") },
        placeholder = { Text("placeholder") }
    )

    OutlinedTextField(
        value = text,
        modifier = Modifier.padding(8.dp).fillMaxWidth(),
        keyboardType = KeyboardType.Password,
        label = { Text(text = "Password") },
        placeholder = { Text(text = "12334444") },
        visualTransformation = PasswordVisualTransformation(),
        onValueChange = {
            text = it
        }
    )

    OutlinedTextField(
        value = text,
        leadingIcon = { Icon(asset = Icons.Default.Email) },
        modifier = Modifier.padding(8.dp).fillMaxWidth(),
        keyboardType = KeyboardType.Text,
        label = { Text(text = "Email address") },
        placeholder = { Text(text = "Your email") },
        onValueChange = {
            text = it
        }
    )
    OutlinedTextField(
        value = text,
        leadingIcon = { Icon(asset = Icons.Default.Email) },
        trailingIcon = { Icon(asset = Icons.Default.Edit) },
        modifier = Modifier.padding(8.dp).fillMaxWidth(),
        keyboardType = KeyboardType.Text,
        label = { Text(text = "Email address") },
        placeholder = { Text(text = "Your email") },
        onValueChange = {
            text = it
        }
    )

    var numberText by remember { mutableStateOf(TextFieldValue("")) }
    OutlinedTextField(value = numberText,
        modifier = Modifier.padding(8.dp).fillMaxWidth(),
        keyboardType = KeyboardType.Number,
        label = { Text(text = "Phone number") },
        placeholder = { Text(text = "88888888") },
        onValueChange = {
            numberText = it
        }
    )
}

@Preview
@Composable
fun PreviewInputs() {
    TextInputs()
}