package com.alian.zawadimart.ui.screens.start

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.alian.zawadimart.R
import com.alian.zawadimart.ui.theme.Igris

@Composable
fun StartScreen(){

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "ZawadiMart",
            fontSize = 30.sp,
            color = Igris,

        )
        Spacer(modifier = Modifier.height(20.dp))

        //Circular Image
        Image(
            painter = painterResource(R.drawable.sung),
            contentDescription = "",
            modifier = Modifier.size(400.dp).clip(shape = CircleShape),
            contentScale = ContentScale.Crop,
        )
        //End
        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "Find your date!!",
            fontSize = 30.sp,
            fontWeight = FontWeight.ExtraBold,
            fontFamily = FontFamily.Cursive,
            color = Igris,
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "Sung Jin-woo, the protagonist of the web novel and anime \"Solo Leveling,\" starts as a weak \"E-rank\" hunter but transforms into one of the strongest, driven by a desire to protect his family and a thirst for power, eventually becoming a powerful shadow monarch. \n",
            fontSize = 18.sp,
            textAlign = TextAlign.Center,
        )

        Spacer(modifier = Modifier.height(20.dp))

        Button(
            onClick = {},
            colors = ButtonDefaults.buttonColors(Igris),
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp),
        ) {
            Text(text = "GET STARTED!!!")
        }







    }

}

@Preview(showBackground = true)
@Composable
fun StartScreenPreview(){
    StartScreen()

}
