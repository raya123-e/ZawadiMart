package com.alian.zawadimart.ui.screens.dashboard

import android.icu.text.CaseMap
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.alian.zawadimart.R
import com.alian.zawadimart.navigation.ROUT_ABOUT
import com.alian.zawadimart.navigation.ROUT_CONTACT
import com.alian.zawadimart.navigation.ROUT_HOME
import com.alian.zawadimart.navigation.ROUT_INTENT
import com.alian.zawadimart.navigation.ROUT_ITEM
import com.alian.zawadimart.navigation.ROUT_SERVICE
import com.alian.zawadimart.ui.theme.Igris
import com.alian.zawadimart.ui.theme.Mlue
import com.alian.zawadimart.ui.theme.white

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DashboardScreen(navController: NavController){
    Column(modifier = Modifier
        .fillMaxSize().background(Igris)
    ) {

        //box
        Box(){
            //Card
            Card (
                modifier = Modifier.fillMaxWidth().height(300.dp),
                shape = RoundedCornerShape(bottomStart =60.dp, bottomEnd = 60.dp ),
                colors = CardDefaults.cardColors(Mlue)
            ){

                TopAppBar(
                    title = {Text(text = " Dashboard Section")},
                    navigationIcon = {
                        IconButton(
                            onClick = {
                            }) {
                            Icon(imageVector = Icons.Default.Menu, contentDescription = "")
                        }
                    },
                )

            }
            //end of Card

            Card (modifier = Modifier
                .fillMaxWidth()
                .height(180.dp)
                .align(alignment = Alignment.BottomCenter)
                .padding(start = 20.dp, end = 20.dp)
                .offset(y = 90.dp)

            ){
                Column(
                    modifier = Modifier.fillMaxSize().padding(start = 50.dp,end = 20.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,





                ) {

                    Text(
                        text = "Welcome to your Anime Character Platform!!!!",
                        fontSize = 30.sp,
                        fontFamily = FontFamily.Cursive,
                        fontWeight = FontWeight.Bold,




                    )
                }





            }








        }
        // End of Box


        Spacer(modifier = Modifier.height(120.dp))

        //Row-1
        Row (
            modifier = Modifier.padding(start = 20.dp)
        ){
            //Card-1
            Card(modifier = Modifier
                .width(150.dp)
                .height(180.dp)
                .padding(start = 20.dp)
                .clickable{navController.navigate(ROUT_HOME)}
            )

            {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,

                ) {
                    Image(
                        painter = painterResource(R.drawable.img),
                        contentDescription = "Ecommerce",
                        modifier = Modifier.size(100.dp),

                    )

                    Text(text ="Home", fontSize = 20.sp)
                }


            }
            //End of Card-1

            Spacer(modifier = Modifier.width(20.dp))

            //Card-2
            Card(modifier = Modifier
                .width(150.dp)
                .height(180.dp)
                .padding(start = 20.dp)
                .clickable{navController.navigate(ROUT_SERVICE)}
            ) {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center

                ) {
                    Image(
                        painter = painterResource(R.drawable.img_1),
                        contentDescription = "Ecommerce",
                        modifier = Modifier.size(100.dp),

                        )

                    Text(text ="About", fontSize = 20.sp)
                }


            }
            //End of Card-2
        }
        //End of Row-1

        Spacer(modifier = Modifier.height(20.dp))





        //Row-2
        Row (
            modifier = Modifier.padding(start = 20.dp)
        ){
            //Card-3
            Card(modifier = Modifier
                .width(150.dp)
                .height(180.dp)
                .padding(start = 20.dp)
                .clickable{navController.navigate(ROUT_CONTACT)}

            ) {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center

                ) {
                    Image(
                        painter = painterResource(R.drawable.img_2),
                        contentDescription = "Ecommerce",
                        modifier = Modifier.size(100.dp),

                        )

                    Text(text ="Contact Us", fontSize = 20.sp)
                }


            }
            //End of Card-3

            Spacer(modifier = Modifier.width(20.dp))

            //Card-4
            Card(modifier = Modifier
                .width(150.dp)
                .height(180.dp)
                .padding(start = 20.dp)
                .clickable{navController.navigate(ROUT_ITEM  )}
            ) {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center

                ) {
                    Image(
                        painter = painterResource(R.drawable.img_3),
                        contentDescription = "Ecommerce",
                        modifier = Modifier.size(100.dp),

                        )

                    Text(text ="Products", fontSize = 20.sp)
                }


            }
            //End of Card-4
        }
        //End of Row-2




























    }






}

@Preview(showBackground = true)
@Composable
fun DashboardScreenPreview(){
    DashboardScreen(rememberNavController())

}
