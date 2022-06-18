package com.replicate.features

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController

/**
 * Idea from https://habr.com/ru/company/moex/blog/586192/
 */
interface ComposeNavigationFactory {

    fun create(builder: NavGraphBuilder, controller: NavHostController)
}