package model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonClassDiscriminator

@Serializable
@JsonClassDiscriminator("unit")
sealed class Unit {
    abstract val value: Int
}

@Serializable
sealed class Power : Unit()

@Serializable
sealed class Energy : Unit()

@Serializable
@SerialName("kw")
data class KW(override val value: Int) : Power()

@Serializable
@SerialName("hp")
data class HP(override val value: Int) : Power()

@Serializable
@SerialName("kwh")
data class KWh(override val value: Int) : Energy()
