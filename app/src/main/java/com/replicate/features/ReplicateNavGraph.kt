package com.replicate.features

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import org.koin.core.context.GlobalContext

@Composable
fun ReplicateNavGraph() {
    val navController = rememberNavController()
    val factories = GlobalContext.get().getAll<ComposeNavigationFactory>()

    NavHost(navController, startDestination = ReplicateDestination.MAIN_ROUTE) {
        factories.forEach { factory -> factory.create(this, navController) }
    }
}
