import kotlinx.serialization.Serializable
import model.Engine

@Serializable
sealed class Vehicle {
    abstract val brand: String
    abstract val model: String
}

@Serializable
data class Car(
    override val brand: String,
    override val model: String,
    val engine: Engine
) : Vehicle()

@Serializable
data class Bicycle(
    override val brand: String,
    override val model: String
) : Vehicle()
