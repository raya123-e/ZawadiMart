package com.alian.zawadimart.ui.screens.form1

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.AbsoluteCutCornerShape
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.alian.zawadimart.R
import com.alian.zawadimart.navigation.ROUT_START
import com.alian.zawadimart.ui.theme.Igris
import com.alian.zawadimart.ui.theme.Mlue
import com.alian.zawadimart.ui.theme.whitew


@Preview(showBackground = true)
@Composable
fun Form1ScreenPreview(){
    Form1Screen(rememberNavController())

}


@Composable
fun Form1Screen(navController: NavController) {
    //box
    Box(
        modifier = Modifier
            .fillMaxSize()
        .clip(shape = RoundedCornerShape(40.dp))

    ) {
        //card
            Card(
                modifier = Modifier.fillMaxWidth().height(400.dp),
                colors = CardDefaults.cardColors(Mlue),


            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically

                ) {
                    Image(
                        painter = painterResource(R.drawable.img_30),
                        contentDescription = "Ecommerce",

                        )
                    Spacer(modifier = Modifier.width(20.dp))

                    Text(text = "ZawadiMart", fontSize = 30.sp)

                }
                Spacer(modifier = Modifier.height(20.dp))
                Column(
                    modifier = Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center
                ) {
                    Image(
                        painter = painterResource(R.drawable.img_31),
                        contentDescription = "Ecommerce",
                        modifier = Modifier.size(300.dp),
                    )
                }


            }
        //end of card




         //card -2
            Card(
                modifier = Modifier.fillMaxSize()
                    .offset( y = 360.dp)
                    .align(alignment = Alignment.BottomEnd)
                    .clip(shape = RoundedCornerShape(topStart = 40.dp, topEnd = 40.dp))





            ) {
                Column(
                    modifier = Modifier, horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center
                ) {
                    Spacer(modifier = Modifier.height(40.dp))


                    Text(
                        text = "The Most Worthy" +
                                "  App",
                        color = Igris,
                        fontSize = 30.sp,
                        fontWeight = FontWeight.ExtraBold


                        )
                    Spacer(modifier = Modifier.height(30.dp))

                    Button(
                        onClick = {
                        },
                        colors = ButtonDefaults.buttonColors(Color.Gray),
                        shape = RoundedCornerShape(50.dp),
                        modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp).size(50.dp)

                    ) {
                        Text(text = "Username", fontSize = 25.sp, color = Color.Black,)
                    }

                    Spacer(modifier = Modifier.height(30.dp))


                    Button(
                        onClick = {
                        },
                        colors = ButtonDefaults.buttonColors(Color.Gray),
                        shape = RoundedCornerShape(50.dp),
                        modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp).size(50.dp)

                    ) {
                        Text(text = "Password", fontSize = 25.sp, color = Color.Black,)
                    }

                    Spacer(modifier = Modifier.height(30.dp))




                    Button(
                        onClick = {
                        },
                        colors = ButtonDefaults.buttonColors(Igris),
                        shape = RoundedCornerShape(50.dp),
                        modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp).size(50.dp)

                    ) {
                        Text(text = "Sign Up", fontSize = 25.sp, color = Color.Black,)
                    }

                    Spacer(modifier = Modifier.height(30.dp))


                    Text(text = "Already a member? ", fontSize =25.sp )
                    Text(
                        text = "Log in",
                        color = Igris, // Blue-ish color for a link look
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.clickable { },
                        fontSize = 25.sp
                    )
                }
            }
        //end of card -3
            }



    }




