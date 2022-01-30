import model.Automatic
import model.CombustionEngine
import model.ElectricEngine
import model.Fuel
import model.Garage
import model.Manual

class DataProvider {

    companion object {
        private val data = Garage(
            vehicles = listOf(
                Car(
                    brand = "VW",
                    model = "Käfer",
                    engine = CombustionEngine(power = 16, fuel = Fuel.GASOLINE, gearbox = Manual(4))
                ),
                Car(
                    brand = "Mercedes",
                    model = "C180",
                    engine = CombustionEngine(power = 55, fuel = Fuel.DIESEL, gearbox = Automatic(5))
                ),
                Car(
                    brand = "Tesla",
                    model = "Model 3",
                    engine = ElectricEngine(power = 239, battery = 60)
                ),
                Bicycle(
                    brand = "Gazelle",
                    model = "Van Stael"
                )
            )
        )

        fun getData(): Garage = data
    }
}
