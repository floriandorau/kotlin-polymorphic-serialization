import kotlinx.serialization.Serializable

@Serializable
data class Garage(val vehicles: List<Vehicle>)

@Serializable
sealed class Vehicle {
    abstract val brand: String
}

@Serializable
data class Car(override val brand: String) : Vehicle()

@Serializable
data class Bicycle(override val brand: String) : Vehicle()
