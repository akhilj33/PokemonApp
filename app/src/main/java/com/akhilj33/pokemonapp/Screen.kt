package com.akhilj33.pokemonapp

sealed class Screen(val route: String) {
    object ListScreen : Screen("pokemon_listScreen")
    object DetailScreen : Screen("pokemon_detailScreen")

    // Use when all args are mandatory
    fun withMandatoryArgs(vararg args: String): String {
        return buildString {
            append(route)
            args.forEach { arg ->
                append("/$arg")
            }
        }
    }

    // Use when args are optional
    fun withArgs(vararg args: Pair<String, Boolean>): String {
        return buildString {
            append(route)
            args.forEach { (arg, isMandatory) ->
                if (isMandatory) append("/{$arg}")
                else append("?$arg={$arg}")
            }
        }
    }
}


