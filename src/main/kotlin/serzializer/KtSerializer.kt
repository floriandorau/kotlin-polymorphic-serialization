package serzializer

import kotlinx.serialization.decodeFromString
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

class KtSerializer {

    companion object {
        val json = Json { ignoreUnknownKeys = true; prettyPrint = true }
    }

    inline fun <reified T> serialize(data: T): String = json.encodeToString(data)

    inline fun <reified T> deserialize(string: String) = json.decodeFromString<T>(string)
}
