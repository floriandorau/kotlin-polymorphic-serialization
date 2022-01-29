import kotlinx.serialization.Serializable

@Serializable
data class Garage(val vehicles: List<Vehicle>)

@Serializable
sealed class Vehicle {
    abstract val brand: String
}

@Serializable
sealed class Engine {
    abstract val power: Int
}

@Serializable
data class Electric(override val power: Int) : Engine()

@Serializable
data class Gasoline(override val power: Int) : Engine()

@Serializable
data class Car(override val brand: String, val engine: Engine) : Vehicle()

@Serializable
data class Bicycle(override val brand: String) : Vehicle()
