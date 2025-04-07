package com.alian.zawadimart.ui.screens.intent

import android.content.Intent
import android.provider.MediaStore
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.net.toUri
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.alian.zawadimart.navigation.ROUT_ITEM
import com.alian.zawadimart.ui.theme.Igris

import com.alian.zawadimart.ui.theme.white

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun IntentScreen(navController: NavController){
    Column(modifier = Modifier.fillMaxSize()) {

        val mContext = LocalContext.current

        //TopAppBar
        TopAppBar(
            title ={ Text(text = "Intents") },
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
                    Icon(imageVector = Icons.Default.Share, contentDescription = "")
                }
                IconButton(
                    onClick = {}) {
                    Icon(imageVector = Icons.Default.Settings, contentDescription = "")
                }
            }
        )
        //end TopAppBar


        Spacer(modifier = Modifier.height(20.dp))





        //Mpesa button
        Button(
            onClick = {
                val simToolKitLaunchIntent =
                    mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                simToolKitLaunchIntent?.let { mContext.startActivity(it) }
            },
            colors = ButtonDefaults.buttonColors(Color.Green),
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp),
        ) {
            Text(
                text = "M-PESA",
                color = Color.Black,
                fontSize = 20.sp,

                )
        }

        //end of button


        Spacer(modifier = Modifier.height(20.dp))





        //Call button
        Button(
            onClick = {
                val callIntent=Intent(Intent.ACTION_DIAL)
                callIntent.data="tel:0117434950".toUri()
                mContext.startActivity(callIntent)
            },
            colors = ButtonDefaults.buttonColors(Igris),
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp),
        ) {
            Text(
                text = "Call",
                color = Color.Black,
                fontSize = 20.sp,

            )
        }

        //end of Call button


        Spacer(modifier = Modifier.height(20.dp))





        // SMS  button
        Button(
            onClick = {
                val smsIntent=Intent(Intent.ACTION_SENDTO)
                smsIntent.data="smsto:0117434950".toUri()
                smsIntent.putExtra("sms_body","Hello Claire,how was your day?")
                mContext.startActivity(smsIntent)
            },
            colors = ButtonDefaults.buttonColors(Igris),
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp),
        ) {
            Text(
                text = "SMS",
                color = Color.Black,
                fontSize = 20.sp,

            )
        }

        //end of SMS button







        Spacer(modifier = Modifier.height(20.dp))





        //Share button
        Button(
            onClick = {
                val shareIntent=Intent(Intent.ACTION_SEND)
                shareIntent.type="text/plain"
                shareIntent.putExtra(Intent.EXTRA_TEXT, "Check out this is a cool content")
                mContext.startActivity(Intent.createChooser(shareIntent, "Anime Products"))
            },
            colors = ButtonDefaults.buttonColors(Igris),
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp),
        ) {
            Text(
                text = "Share",
                color = Color.Black,
                fontSize = 20.sp,

            )
        }

        //end of share button






        Spacer(modifier = Modifier.height(20.dp))





        //email button
        Button(
            onClick = {
                val shareIntent = Intent(Intent.ACTION_SEND)
                shareIntent.type = "text/plain"
                shareIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("githiiclaire@gmail.com"))
                shareIntent.putExtra(Intent.EXTRA_SUBJECT, "ZawadiMart")
                shareIntent.putExtra(Intent.EXTRA_TEXT, "Anime Products")
                mContext.startActivity(shareIntent)
            },
            colors = ButtonDefaults.buttonColors(Igris),
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp),
        ) {
            Text(
                text = "E-mail",
                color = Color.Black,
                fontSize = 20.sp,

            )
        }

        //end of email button






        Spacer(modifier = Modifier.height(20.dp))





        //camera button
        Button(
            onClick = {

                val cameraIntent=Intent(MediaStore.ACTION_IMAGE_CAPTURE)
                if (cameraIntent.resolveActivity(mContext.packageManager)!=null){
                    mContext.startActivity(cameraIntent)
                }else{
                    println("Camera app is not available")
                }
            },
            colors = ButtonDefaults.buttonColors(Igris),
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp),
        ) {
            Text(
                text = "Camera",
                color = Color.Black,
                fontSize = 20.sp,

            )
        }

        //end of camera button


































    }

















}

@Preview(showBackground = true)
@Composable
fun IntentScreenPreview(){
   IntentScreen(rememberNavController())

}