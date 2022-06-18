package com.replicate.features.main

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.replicate.features.ComposeNavigationFactory
import com.replicate.features.ReplicateDestination

class MainNavigationFactory : ComposeNavigationFactory {

    override fun create(builder: NavGraphBuilder, controller: NavHostController) {
        builder.composable(
            route = ReplicateDestination.MAIN_ROUTE,
            content = { MainNavHostScreen(controller) }
        )
    }
}
