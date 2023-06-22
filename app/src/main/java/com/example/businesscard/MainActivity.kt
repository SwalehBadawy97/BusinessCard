package com.example.businesscard

import android.os.Bundle
import android.util.Log.i
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BusinessCard(stringResource(id = R.string.name) ,
                        stringResource(id = R.string.title) , telephone = 254707714794 , stringResource(
                            id = R.string.social) , stringResource(id = R.string.email))
                }
            }
        }
    }
}

@Composable
fun BusinessCard(name: String, title: String, telephone: Long, social: String, email: String) {

    Column(modifier = Modifier
        .fillMaxWidth()
        .fillMaxHeight()
        .background(color = Color(0xFF37596D)),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        val image = painterResource(id = R.drawable.android_logo)
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .size(120.dp)

        )

        Text(
                text = name,
                fontSize = 40.sp,
                color = Color.White

            )
        Text(
            text = title,
            fontSize = 28.sp,
            color = Color(0xFF3ddc84)
        )

    }
    Column(modifier = Modifier
        .fillMaxWidth()
        .padding(top = 650.dp, bottom = 50.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {

        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(start = 35.dp)
                ){

            val icon = painterResource(id = R.drawable.ic_phone)
            Icon(painter = icon,
                contentDescription = null,
                modifier = Modifier.padding(start = 60.dp),
                Color(0xFF3ddc84))

            Text(
                text = stringResource(id = R.string.telephone),
                modifier = Modifier
                    .padding(start = 15.dp),
                color = Color.White)

        }

        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(start = 35.dp, top = 20.dp)
        ){
            val icon = painterResource(id = R.drawable.ic_social)
            Icon(painter = icon,
                contentDescription = null,
                modifier = Modifier.padding(start = 60.dp),
                Color(0xFF3ddc84))
            Text(
                text = stringResource(id = R.string.social),
                modifier = Modifier
                    .padding(start = 15.dp),
                color = Color.White)

        }

        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(start = 35.dp, top = 20.dp)
        ){
            val icon = painterResource(id = R.drawable.ic_email)
            Icon(painter = icon,
                contentDescription = null,
                modifier = Modifier.padding(start = 60.dp),
                Color(0xFF3ddc84))
            Text(
                text = stringResource(id = R.string.email),
                modifier = Modifier
                    .padding(start = 15.dp),
                color = Color.White)

        }




    }

}



@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BusinessCardTheme {
        BusinessCard(name = stringResource(R.string.name) , title = stringResource(R.string.title) , telephone = 254707714794 , social = stringResource(
                    R.string.social) , email = stringResource(R.string.email) )
    }
}