package model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

enum class Fuel {
    DIESEL, GASOLINE
}

@Serializable
sealed class Engine {
    abstract val power: Int
}

@Serializable
@SerialName("electric")
data class ElectricEngine(
    override val power: Int,
    val battery: Int
) : Engine()

@Serializable
@SerialName("combustion")
data class CombustionEngine(
    override val power: Int,
    val fuel: Fuel,
    val gearbox: Gearbox
) : Engine()
