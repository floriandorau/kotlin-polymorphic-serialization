package model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

enum class Fuel {
    DIESEL, GASOLINE
}

@Serializable
sealed class Engine {
    abstract val power: Power
}

@Serializable
@SerialName("electric")
data class ElectricEngine(
    override val power: Power,
    val battery: Energy
) : Engine()

@Serializable
@SerialName("combustion")
data class CombustionEngine(
    override val power: Power,
    val fuel: Fuel,
    val gearbox: Gearbox
) : Engine()
