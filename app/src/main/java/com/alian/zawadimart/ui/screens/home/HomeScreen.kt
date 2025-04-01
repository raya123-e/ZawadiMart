package com.alian.zawadimart.ui.screens.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
fun HomeScreen(){
    Column (
        modifier = Modifier.fillMaxSize()
    ){
        Text(
            text = "ZawadiMart",
            fontSize = 30.sp,
            color = Color.Magenta,
            fontWeight = FontWeight.ExtraBold,
            fontFamily = FontFamily.SansSerif,
            textDecoration = TextDecoration.Underline,
        )

        Text(
            text = "Welcome to my EcommerceApp",
            fontSize = 18.sp,
            fontStyle = FontStyle.Italic,


        )
        Button(onClick = {}) { }

    }


}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview(){
    HomeScreen()


}
