package com.alian.zawadimart.ui.screens.personal

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.alian.zawadimart.R
import com.alian.zawadimart.navigation.ROUT_CONTACT
import com.alian.zawadimart.navigation.ROUT_DASHBOARD
import com.alian.zawadimart.navigation.ROUT_HOME
import com.alian.zawadimart.navigation.ROUT_ITEM
import com.alian.zawadimart.ui.theme.Igris
import com.alian.zawadimart.ui.theme.Mlue
import com.alian.zawadimart.ui.theme.orange
import com.alian.zawadimart.ui.theme.white


@Preview(showBackground = true)
@Composable
fun PersonalScreenPreview(){
    PersonalScreen(rememberNavController())

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PersonalScreen(navController: NavController){
//Scaffold

    var selectedIndex by remember { mutableStateOf(0) }

    Scaffold(
        //TopBar
        topBar = {},

        //BottomBar
        bottomBar = {
            NavigationBar(
                containerColor = white
            ) {
                NavigationBarItem(
                    icon = { Icon(Icons.Default.Home, contentDescription = "Home", tint = Color.Magenta) },
                    label = { Text("") },
                    selected = selectedIndex == 0,
                    onClick = {
                        selectedIndex = 0
                        navController.navigate(ROUT_HOME)
                    }
                )
                NavigationBarItem(
                    icon = { Icon(Icons.Default.DateRange, contentDescription = "Favorites") },
                    label = { Text("") },
                    selected = selectedIndex == 1,
                    onClick = {
                        selectedIndex = 1
                        // navController.navigate(ROUT_HOME)
                    }
                )
                NavigationBarItem(
                    icon = { Icon(Icons.Default.Menu, contentDescription = "Profile", tint = Color.Black) },
                    label = { Text("") },
                    selected = selectedIndex == 2,
                    onClick = {
                        selectedIndex = 2
                        //  navController.navigate(ROUT_HOME)
                    }
                )

                NavigationBarItem(
                    icon = { Icon(Icons.Default.AccountCircle, contentDescription = "Profile", tint = Color.Black) },
                    label = { Text("") },
                    selected = selectedIndex == 2,
                    onClick = {
                        selectedIndex = 2
                        //  navController.navigate(ROUT_HOME)
                    }
                )

            }
        },

        //FloatingActionButton
        floatingActionButton = {

        },
        content = { paddingValues ->
            Column(
                modifier = Modifier
                    .padding(paddingValues)
                    .fillMaxSize()
                    .clip(shape = RoundedCornerShape(40.dp)),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center


            ) {


                //Main Contents of the page
                Spacer(modifier = Modifier.height(20.dp))
                Text(text = "Hi Claire", fontSize = 30.sp)
                Spacer(modifier = Modifier.height(8.dp))
                Text("Here are your projects.", fontSize = 20.sp)

                Spacer(modifier = Modifier.height(20.dp))


                //main box
                Box(
                    modifier = Modifier.horizontalScroll(rememberScrollState())
                ) {
                    //row
                    Row {
                        //Card-1
                        Card(
                            modifier = Modifier
                                .padding(start = 20.dp)
                                .background(color = Color.White)
                                .width(160.dp)
                                .height(300.dp),
                            shape = RoundedCornerShape(30.dp),
                            elevation = CardDefaults.cardElevation(8.dp),
                            colors = CardDefaults.cardColors(Mlue),


                            ) {


                            Column(
                                modifier = Modifier.fillMaxSize(),
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center,


                                ) {
                                Image(
                                    painter = painterResource(R.drawable.img_22),
                                    contentDescription = "Ecommerce",
                                    modifier = Modifier.size(100.dp),

                                    )

                                Text(text = "Pizza", fontSize = 20.sp, color = Color.White)
                            }


                        }
                        //end of card-1
                        Spacer(modifier = Modifier.width(10.dp))

                        //card-2

                        Card(
                            modifier = Modifier
                                .width(170.dp)
                                .height(300.dp)
                                .padding(start = 20.dp)
                                .background(color = Color.White)
                                .clip(shape = RoundedCornerShape(30.dp)),
                            colors = CardDefaults.cardColors(orange),


                            ) {

                            Column(
                                modifier = Modifier.fillMaxSize(),
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center

                            ) {
                                Image(
                                    painter = painterResource(R.drawable.img_25),
                                    contentDescription = "Ecommerce",
                                    modifier = Modifier.size(100.dp),

                                    )

                                Text(text = "Chicken", fontSize = 20.sp)
                            }


                        }
                        //end of card-2

                        Spacer(modifier = Modifier.width(10.dp))

                        //Card-3
                        Card(

                            modifier = Modifier
                                .width(170.dp)
                                .height(300.dp)
                                .padding(start = 20.dp)
                                .background(color = Color.White)
                                .clip(shape = RoundedCornerShape(30.dp)),
                            colors = CardDefaults.cardColors(Color.Green),


                            ) {

                            Column(
                                modifier = Modifier.fillMaxSize(),
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center,

                                ) {
                                Image(
                                    painter = painterResource(R.drawable.img_23),
                                    contentDescription = "Ecommerce",
                                    modifier = Modifier.size(100.dp),

                                    )

                                Text(text = "Duck", fontSize = 20.sp)
                            }


                        }


                        //End of Card-3


                    }
                    //end of row


                }
                //end of box
                Spacer(modifier = Modifier.height(30.dp))


                //card-4

                Card(
                    modifier = Modifier.fillMaxSize()
                ) {
                    Spacer(modifier = Modifier.height(20.dp))


                    Text(
                        text = "Personal Tasks",
                        Modifier.padding(start = 20.dp),
                        fontSize = 20.sp,
                        fontWeight = FontWeight.ExtraBold
                    )

                    Spacer(modifier = Modifier.height(40.dp))


                    //button-1
                    Button(
                        onClick = {

                        },
                        colors = ButtonDefaults.buttonColors(Color.White),
                        shape = RoundedCornerShape(10.dp),
                        modifier = Modifier.fillMaxWidth().padding(start = 15.dp, end = 15.dp)
                            .height(80.dp)

                    ) {
                        //button row
                        Row(
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            Image(
                                painter = painterResource(R.drawable.img_26),
                                contentDescription = "Ecommerce"
                            )

                            Spacer(modifier = Modifier.width(20.dp))

                            Column(
                                modifier = Modifier.fillMaxWidth()
                            ) {
                                Text(
                                    text = "NDA review for website project",
                                    color = Color.Black,
                                    fontWeight = FontWeight.Bold
                                )
                                Spacer(modifier = Modifier.height(10.dp))

                                Text(text = "Today at 10pm", color = Color.Black)


                            }
                        }
                        //end of button row


                    }
                    //button-1


                    Spacer(modifier = Modifier.height(40.dp))


                    //button-2
                    Button(

                        onClick = {

                        },
                        colors = ButtonDefaults.buttonColors(Color.White),
                        shape = RoundedCornerShape(10.dp),
                        modifier = Modifier.fillMaxWidth().padding(start = 15.dp, end = 15.dp)
                            .height(80.dp)

                    ) {
                        //button row-2
                        Row(modifier = Modifier.fillMaxWidth())
                        {
                            Image(
                                painter = painterResource(R.drawable.img_27),
                                contentDescription = "Ecommerce"
                            )
                            Spacer(modifier = Modifier.width(20.dp))

                            Column(modifier = Modifier.fillMaxWidth()) {
                                Text(text = "Email for projects", color = Color.Black)
                            }


                        }
                        //end of button row-2

                    }
                    //end of button-2

                }
                //end of card-4


            }

        }




            )
//End of scaffold

}
