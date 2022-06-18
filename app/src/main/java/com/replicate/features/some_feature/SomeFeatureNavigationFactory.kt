package com.replicate.features.some_feature

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.replicate.features.ComposeNavigationFactory
import com.replicate.features.ReplicateDestination

class SomeFeatureNavigationFactory : ComposeNavigationFactory {

    override fun create(builder: NavGraphBuilder, controller: NavHostController) {
        builder.composable(
            route = ReplicateDestination.SOME_FEATURE_ROUTE,
            content = { SomeFeatureScreen() }
        )
    }
}
