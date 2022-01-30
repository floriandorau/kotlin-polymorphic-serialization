class ResourceLoader {

    companion object {
        fun readText(path: String): String {
            val text = this::class.java.classLoader.getResource(path)?.readText(Charsets.UTF_8)
            return requireNotNull(text) { "file not found" }
        }
    }
}
