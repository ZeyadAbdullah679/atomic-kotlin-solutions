// Enumerations/Task2.kt
package enumerationsExercise2

import atomictest.eq
import enumerationsExercise2.Month.*
import enumerationsExercise2.Season.*

enum class Month {
    January, February, March, April,
    May, June, July, August,
    September, October, November, December
}

enum class Season {
    Winter, Spring, Summer, Autumn
}

fun Month.getAustralianSeason(): Season = when (this) {
    September, October, November -> Spring
    December, January, February -> Summer
    March, April, May -> Autumn
    June, July, August -> Winter
}

fun Month.getDays(leapYear: Boolean = false): Int = when (this) {
    February -> if (leapYear) 29 else 28
    April, June, September, November -> 30
    else -> 31
}

fun main() {
    January.getAustralianSeason() eq Summer
    May.getAustralianSeason() eq Autumn

    January.getDays() eq 31
    February.getDays(leapYear = false) eq 28
    February.getDays(leapYear = true) eq 29
}