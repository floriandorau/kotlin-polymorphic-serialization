import model.Garage
import serzializer.KtSerializer

private val ktSerializer = KtSerializer()

fun main() {
    val data = DataProvider.getData()

    val string = ktSerializer.serialize(data)
    println(string)

    // Deserializing back into objects
    val obj = ktSerializer.deserialize<Garage>(string)
    println(obj)
}
