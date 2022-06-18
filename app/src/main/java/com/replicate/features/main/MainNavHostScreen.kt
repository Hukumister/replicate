package com.replicate.features.main

import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.replicate.features.ReplicateDestination
import com.replicate.features.list.ListScreen
import com.replicate.features.search.SearchScreen

@Preview
@Composable
fun MainNavHostScreen(
    appNavHostController: NavHostController
) {
    val navController = rememberNavController()
    Scaffold(
        scaffoldState = rememberScaffoldState(),
        floatingActionButton = {
            FloatingActionButton(
                onClick = {
                    appNavHostController.navigate(ReplicateDestination.SOME_FEATURE_ROUTE)
                },
                elevation = FloatingActionButtonDefaults.elevation(8.dp)
            ) {
                Text("Feature")
            }
        },
        bottomBar = { BottomNavigationBar(navController) }
    ) {
        MainNavigation(navController)
    }
}


@Composable
fun MainNavigation(
    navController: NavHostController
) {
    NavHost(navController, startDestination = MainNavigationItem.MAIN.route) {
        composable(MainNavigationItem.MAIN.route) {
            MainScreen()
        }
        composable(MainNavigationItem.SEARCH.route) {
            SearchScreen()
        }
        composable(MainNavigationItem.LIST.route) {
            ListScreen()
        }
    }
}

@Preview
@Composable
fun BottomNavigationBar(
    navController: NavHostController
) {

    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route

    BottomNavigation(
        backgroundColor = MaterialTheme.colors.primary,
        contentColor = Color.White
    ) {
        MainNavigationItem.values().forEach { item ->
            BottomNavigationItem(
                icon = { Icon(painterResource(id = item.icon), contentDescription = item.title) },
                label = { Text(text = item.title) },
                selectedContentColor = Color.White,
                unselectedContentColor = Color.White.copy(0.4f),
                alwaysShowLabel = true,
                selected = currentRoute == item.route,
                onClick = {
                    navController.navigate(item.route) {
                        navController.graph.startDestinationRoute?.let { route ->
                            popUpTo(route) { saveState = true }
                        }
                        launchSingleTop = true
                        restoreState = true
                    }
                }
            )
        }
    }
}
