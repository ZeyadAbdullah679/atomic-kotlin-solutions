// Visibility/Task1.kt
package constrainingVisibilityExercise1

class Alien(val name: String, val species: String, private var planet: String) {
    fun movePlanet(planet: String) {
        this.planet = planet
    }

    override fun toString(): String {
        return "Alien $name, $species: $planet"
    }

}

fun main() {
    val a1 = Alien("Arthricia", "Cat Person", "PurgePlanet")
    val a2 = Alien("Dale", "Giant", "Gearworld")
    println(a1.toString())
    println(a2.toString())
    a1.movePlanet("Earth C-137")
    a2.movePlanet("Parblesnops")
    println(a1.toString())
    println(a2.toString())
}
/* Expected output:
Alien Arthricia, Cat Person: PurgePlanet
Alien Arthricia, Cat Person: Earth C-137
Alien Dale, Giant: Gearworld
Alien Dale, Giant: Parblesnops
*/