package serzializer

import DataProvider
import ResourceLoader
import model.Garage
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class KtSerializerTest {

    companion object {
        val json = ResourceLoader.readText("./garage.json")
        val data = DataProvider.getData()
    }

    private val ktSerializer = KtSerializer()

    @Test
    internal fun `serialize -- it should serialize given object data to expected json string`() {
        val result = ktSerializer.serialize(data)

        assertThat(result)
            .isNotNull
            .isEqualToIgnoringWhitespace(json)
    }

    @Test
    internal fun `deserialize -- it should deserialize given json string to expected object data`() {
        val result = ktSerializer.deserialize<Garage>(json)

        assertThat(result)
            .isNotNull
            .usingRecursiveComparison()
            .isEqualTo(data)
    }
}
