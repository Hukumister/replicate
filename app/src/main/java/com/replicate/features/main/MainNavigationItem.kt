package com.replicate.features.main

import com.replicate.R

enum class MainNavigationItem(var route: String, var icon: Int, var title: String) {

    SEARCH("Route", R.drawable.ic_search_white_24, "Search"),
    MAIN("Home", R.drawable.ic_play_arrow_white_24, "Main"),
    LIST("List", R.drawable.ic_list_white_24, "List"),
}