package com.alian.zawadimart.ui.screens.item

import android.content.Intent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.net.toUri
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.alian.zawadimart.R
import com.alian.zawadimart.navigation.ROUT_INTENT
import com.alian.zawadimart.navigation.ROUT_START
import com.alian.zawadimart.ui.theme.Igris
import com.alian.zawadimart.ui.theme.white

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ItemScreen(navController: NavController){

    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        val mContext = LocalContext.current
        //TopAppBar
        TopAppBar(
            title ={ Text(text = "Anime Products") },
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = Igris,
                titleContentColor = white,
                navigationIconContentColor = white,
                actionIconContentColor = white,
            ),
            navigationIcon = {
                IconButton(
                    onClick = {
                    }) {
                    Icon(imageVector = Icons.Default.Menu, contentDescription = "")
                }
            },
            actions = {
                IconButton(
                    onClick = {}) {
                    Icon(imageVector = Icons.Default.ShoppingCart, contentDescription = "")
                }
                IconButton(
                    onClick = {}) {
                    Icon(imageVector = Icons.Default.Notifications, contentDescription = "")
                }

                IconButton(
                    onClick = {
                        navController.navigate(ROUT_INTENT)
                    }) {
                    Icon(imageVector = Icons.Default.ArrowForward, contentDescription = "")
                }
            }
        )
        //end TopAppBar
        Image(
            painter = painterResource(R.drawable.anime),
            contentDescription = "anime",
            modifier = Modifier.fillMaxWidth().height(200.dp),
            contentScale = ContentScale.FillWidth
        )
        Spacer(modifier = Modifier.height(20.dp))

        //searchbar
        var search by remember { mutableStateOf("") }
        OutlinedTextField(
            value = search,
            onValueChange = { search = it},
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Search, contentDescription = "") },
            placeholder = { Text(text = "Search......") },

        )

        //end of searchbar
        Spacer(modifier = Modifier.height(20.dp))

       Column (modifier = Modifier.verticalScroll(rememberScrollState())){
           //Row
           Row(modifier = Modifier.padding(start = 20.dp, end = 20.dp)) {

               Image(
                   painter = painterResource(R.drawable.anime2),
                   contentDescription = "",
                   modifier = Modifier.width(200.dp).height(200.dp).clip(shape = RoundedCornerShape(10.dp)),
                   contentScale = ContentScale.FillWidth,
               )
               Spacer(modifier = Modifier.width(20.dp))

               Column {
                   Text(
                       text = "Male Version",
                       fontSize = 20.sp,
                       fontWeight = FontWeight.Bold,
                   )
                   Text(
                       text = "Ksh.4000",
                       fontSize = 20.sp,
                       textDecoration = TextDecoration.LineThrough,

                       )
                   Text(
                       text = " NewPrice Ksh.5000",
                       fontSize = 20.sp,


                       )
                   Row {
                       Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = Igris)
                       Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = Igris)
                       Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = Igris)
                       Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = Color.Gray)
                       Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = Color.Gray)
                   }
                   Button(
                       onClick = {
                           val callIntent= Intent(Intent.ACTION_DIAL)
                           callIntent.data="tel:0720245837".toUri()
                           mContext.startActivity(callIntent)
                       },
                       colors = ButtonDefaults.buttonColors(Igris),
                       shape = RoundedCornerShape(10.dp),
                       modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp),
                   ) {
                       Text(text = "Contact us")
                   }

               }

           }
           //End of Row

           //row
           Row(modifier = Modifier.padding(start = 20.dp, end = 20.dp , top = 20.dp)) {

               Image(
                   painter = painterResource(R.drawable.horikita),
                   contentDescription = "",
                   modifier = Modifier.width(200.dp).height(200.dp).clip(shape = RoundedCornerShape(10.dp)),
                   contentScale = ContentScale.FillWidth,
               )
               Spacer(modifier = Modifier.width(20.dp))

               Column {
                   Text(
                       text = "Female Version",
                       fontSize = 20.sp,
                       fontWeight = FontWeight.Bold,
                   )
                   Text(
                       text = "Ksh.4000",
                       fontSize = 20.sp,
                       textDecoration = TextDecoration.LineThrough,

                       )
                   Text(
                       text = " NewPrice Ksh.5000",
                       fontSize = 20.sp,


                       )
                   Row {
                       Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = Igris)
                       Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = Igris)
                       Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = Igris)
                       Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = Igris)
                       Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = Color.Gray)
                   }
                   Button(
                       onClick = {
                           navController.navigate(ROUT_START)
                       },
                       colors = ButtonDefaults.buttonColors(Igris),
                       shape = RoundedCornerShape(10.dp),
                       modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp),
                   ) {
                       Text(text = "Add to Cart")
                   }

               }

           }
           //end of row

           Spacer(modifier = Modifier.height(20.dp))

           //Row
           Row(modifier = Modifier.padding(start = 20.dp, end = 20.dp)) {

               Image(
                   painter = painterResource(R.drawable.anime2),
                   contentDescription = "",
                   modifier = Modifier.width(200.dp).height(200.dp).clip(shape = RoundedCornerShape(10.dp)),
                   contentScale = ContentScale.FillWidth,
               )
               Spacer(modifier = Modifier.width(20.dp))

               Column {
                   Text(
                       text = "Male Version",
                       fontSize = 20.sp,
                       fontWeight = FontWeight.Bold,
                   )
                   Text(
                       text = "Ksh.4000",
                       fontSize = 20.sp,
                       textDecoration = TextDecoration.LineThrough,

                       )
                   Text(
                       text = " NewPrice Ksh.5000",
                       fontSize = 20.sp,


                       )
                   Row {
                       Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = Igris)
                       Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = Igris)
                       Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = Igris)
                       Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = Color.Gray)
                       Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = Color.Gray)
                   }
                   Button(
                       onClick = {
                           navController.navigate(ROUT_START)
                       },
                       colors = ButtonDefaults.buttonColors(Igris),
                       shape = RoundedCornerShape(10.dp),
                       modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp),
                   ) {
                       Text(text = "Add to Cart")
                   }

               }

           }
           //End of Row

           Spacer(modifier = Modifier.height(20.dp))

           //Row
           Row(modifier = Modifier.padding(start = 20.dp, end = 20.dp)) {

               Image(
                   painter = painterResource(R.drawable.anime2),
                   contentDescription = "",
                   modifier = Modifier.width(200.dp).height(200.dp).clip(shape = RoundedCornerShape(10.dp)),
                   contentScale = ContentScale.FillWidth,
               )
               Spacer(modifier = Modifier.width(20.dp))

               Column {
                   Text(
                       text = "Male Version",
                       fontSize = 20.sp,
                       fontWeight = FontWeight.Bold,
                   )
                   Text(
                       text = "Ksh.4000",
                       fontSize = 20.sp,
                       textDecoration = TextDecoration.LineThrough,

                       )
                   Text(
                       text = " NewPrice Ksh.5000",
                       fontSize = 20.sp,


                       )
                   Row {
                       Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = Igris)
                       Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = Igris)
                       Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = Igris)
                       Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = Color.Gray)
                       Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = Color.Gray)
                   }
                   Button(
                       onClick = {
                           navController.navigate(ROUT_START)
                       },
                       colors = ButtonDefaults.buttonColors(Igris),
                       shape = RoundedCornerShape(10.dp),
                       modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp),
                   ) {
                       Text(text = "Add to Cart")
                   }

               }

           }
           //End of Row






















       }
    }

}

@Preview(showBackground = true)
@Composable
fun ItemScreenPreview(){
    ItemScreen(rememberNavController())

}
