package com.alian.zawadimart.navigation

import AboutScreen
import android.content.Intent
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.alian.zawadimart.ui.screens.contact.ContactScreen
import com.alian.zawadimart.ui.screens.dashboard.DashboardScreen
import com.alian.zawadimart.ui.screens.form.FormScreen
import com.alian.zawadimart.ui.screens.home.HomeScreen
import com.alian.zawadimart.ui.screens.intent.IntentScreen
import com.alian.zawadimart.ui.screens.item.ItemScreen
import com.alian.zawadimart.ui.screens.personal.PersonalScreen
import com.alian.zawadimart.ui.screens.service.ServiceScreen
import com.alian.zawadimart.ui.screens.splash.SplashScreen
import com.alian.zawadimart.ui.screens.start.StartScreen

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = ROUT_SPLASH
) {

    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier
    ) {
        composable(ROUT_HOME) {
            HomeScreen(navController)
        }
        composable(ROUT_ABOUT) {
            AboutScreen(navController)
        }
        composable(ROUT_START) {
            StartScreen(navController)
        }
        composable(ROUT_ITEM) {
            ItemScreen(navController)
        }

        composable(ROUT_INTENT) {
            IntentScreen(navController)
        }

        composable(ROUT_DASHBOARD) {
            DashboardScreen(navController)
        }

        composable(ROUT_SERVICE) {
           ServiceScreen(navController)
        }

        composable(ROUT_CONTACT) {
            ContactScreen(navController)
        }

        composable(ROUT_SPLASH) {
            SplashScreen(navController)
        }

        composable(ROUT_PERSONAL) {
            PersonalScreen(navController)
        }

        composable(ROUT_FORM) {
            FormScreen(navController)
        }



    }
}