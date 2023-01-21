package com.example.splashscreenapi

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.navigation.compose.rememberNavController
import com.example.splashscreenapi.navigation.NavGraph
import com.example.splashscreenapi.ui.theme.SplashScreenAPITheme

class MainActivity : ComponentActivity() {

    var user: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        installSplashScreen()

        setContent {
            SplashScreenAPITheme {

                val user = "Ken"

                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                    NavGraph(navHostController = rememberNavController())

//                    if (user != null) {
//                        MainScreen(rememberNavController())
//                    } else {
//                        LoginScreen()
//                    }
                }
            }
        }
    }
}