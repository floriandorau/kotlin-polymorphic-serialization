package model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
sealed class Gearbox {
    abstract val gears: Int
}

@Serializable
@SerialName("automatic")
data class Automatic(
    override val gears: Int
) : Gearbox()

@Serializable
@SerialName("manual")
data class Manual(
    override val gears: Int
) : Gearbox()
