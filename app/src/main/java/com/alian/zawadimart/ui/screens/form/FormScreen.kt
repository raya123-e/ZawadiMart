package com.alian.zawadimart.ui.screens.form

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.alian.zawadimart.R
import com.alian.zawadimart.navigation.ROUT_DASHBOARD
import com.alian.zawadimart.navigation.ROUT_START
import com.alian.zawadimart.ui.theme.Igris

@Composable
fun FormScreen(navController: NavController){
    Column (modifier = Modifier
        .fillMaxSize()
        .paint(painter = painterResource(R.drawable.img_29), contentScale = ContentScale.FillBounds),


    horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,


    )
    {
        Image(
            painter = painterResource(R.drawable.img_28),
            contentDescription = "Ecommerce",
            modifier = Modifier.size(100.dp)
        )
        Spacer(modifier = Modifier.height(20.dp))


        Text(
            text = "Create an Account ",
            fontSize = 40.sp,
            fontWeight = FontWeight.ExtraBold
        )

        Spacer(modifier = Modifier.height(20.dp))

        //Variables

        var fullname by remember { mutableStateOf("") }
        var username by remember { mutableStateOf("") }
        var email by remember { mutableStateOf("") }
        var password by remember { mutableStateOf("") }
        var confirmpassword by remember { mutableStateOf("") }


        //Fullname
        TextField(
            value = fullname,
            onValueChange = { fullname = it},
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Person, contentDescription = "", tint = Igris) },
            label = {Text(text ="Full Name")},
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedBorderColor = Igris,
                focusedBorderColor = Color.Gray,
            ),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)


        )


        //end fullname

        Spacer(modifier = Modifier.height(20.dp))


        //Username
        TextField(
            value = username,
            onValueChange = { username = it},
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Face, contentDescription = "", tint = Igris) },
            label = {Text(text ="User Name")},
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedBorderColor = Igris,
                focusedBorderColor = Color.Gray,
            ),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)


        )


        //end Username

        Spacer(modifier = Modifier.height(20.dp))



        //email
        TextField(
            value = email,
            onValueChange = { email = it},
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = "", tint = Igris) },
            label = {Text(text ="E-mail Address")},
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedBorderColor = Igris,
                focusedBorderColor = Color.Gray,
            ),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)


        )


        //end email

        Spacer(modifier = Modifier.height(20.dp))
//

        //password
        TextField(
            value = password,
            onValueChange = { password = it},
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "", tint = Igris) },
            label = {Text(text ="Password")},
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedBorderColor = Igris,
                focusedBorderColor = Color.Gray,
            ),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            visualTransformation = PasswordVisualTransformation()


        )


        //end password

        Spacer(modifier = Modifier.height(20.dp))


        //confirm password
        TextField(
            value = confirmpassword,
            onValueChange = { confirmpassword = it},
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "", tint = Igris) },
            label = {Text(text =" Confirm Password")},
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedBorderColor = Igris,
                focusedBorderColor = Color.Gray,
            ),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            visualTransformation = PasswordVisualTransformation()


        )


        //end confirm password

        Spacer(modifier = Modifier.height(20.dp))

        Button(
            onClick = {
            },
            colors = ButtonDefaults.buttonColors(Igris),
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp),
        ) {
            Text(text = "Register", fontSize = 30.sp)
        }




    }





}

@Preview(showBackground = true)
@Composable
fun FormScreenPreview(){
    FormScreen(rememberNavController())

}
