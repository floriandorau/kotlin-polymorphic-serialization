package model

import Vehicle
import kotlinx.serialization.Serializable

@Serializable
data class Garage(val vehicles: List<Vehicle>)
