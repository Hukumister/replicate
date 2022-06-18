package com.replicate.di

import com.replicate.features.ComposeNavigationFactory
import com.replicate.features.main.MainNavigationFactory
import com.replicate.features.some_feature.SomeFeatureNavigationFactory
import com.replicate.features.some_feature.SomeFeatureViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.bind
import org.koin.dsl.module

val appModule = module {

    single { MainNavigationFactory() } bind ComposeNavigationFactory::class
    single { SomeFeatureNavigationFactory() } bind ComposeNavigationFactory::class

    viewModel { SomeFeatureViewModel() }
}
