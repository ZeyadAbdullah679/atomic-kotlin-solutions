// Summary2/Task8.kt
package summaryIIExercise8

import atomictest.eq

val romanNumeralToIntMap: Map<String, Int> = mapOf(
    "I" to 1,
    "IV" to 4,
    "V" to 5,
    "IX" to 9,
    "X" to 10,
    "XL" to 40,
    "L" to 50,
    "XC" to 90,
    "C" to 100,
    "CD" to 400,
    "D" to 500,
    "CM" to 900,
    "M" to 1000
)

fun convertFromRoman(roman: String): Int {
    var count = 0
    var i = 0
    while (i < roman.length) {
        val currentValue = when {
            i < roman.lastIndex && romanNumeralToIntMap.containsKey(roman.substring(i, i + 2)) -> {
                romanNumeralToIntMap.getValue(roman.substring(i, i + 2)).also {
                    i++
                }
            }

            else -> romanNumeralToIntMap.getValue(roman.substring(i, i + 1))
        }
        count += currentValue
        i++
    }
    return count
}

fun main() {
    print(convertFromRoman("XXIII") eq 23)
    print(convertFromRoman("XLIV") eq 44)
    print(convertFromRoman("C") eq 100)
    print(convertFromRoman("MMXVIII") eq 2018)
}