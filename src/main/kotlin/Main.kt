import kotlinx.serialization.decodeFromString
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

fun main() {
    // Serializing objects
    val data = Garage(
        vehicles = listOf(Car(brand = "VW"), Car(brand = "BMW"), Bicycle(brand = "Giant"))
    )

    val string = Json.encodeToString(data)
    println(string) // {"name":"kotlinx.serialization","language":"Kotlin"}
    // Deserializing back into objects
    val obj = Json.decodeFromString<Garage>(string)
    println(obj) // Project(name=kotlinx.serialization, language=Kotlin)
}
