package com.example.pingpals.ui.navigation

import androidx.navigation.NamedNavArgument

interface AppRoute {
    val arguments: List<NamedNavArgument>
    val path: String
}

object AppDestinations {
    val intro = object : AppRoute {
        override val arguments: List<NamedNavArgument> = emptyList()
        override val path: String = "intro"
    }

    val login = object : AppRoute {
        override val arguments: List<NamedNavArgument> = emptyList()
        override val path: String = "login"
    }

    val signIn = object : AppRoute {
        override val arguments: List<NamedNavArgument> = emptyList()
        override val path: String = "sign-in"
    }

    val home = object : AppRoute {
        override val arguments: List<NamedNavArgument> = emptyList()
        override val path: String = "home"
    }
}