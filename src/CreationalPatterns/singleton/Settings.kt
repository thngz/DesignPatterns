package singleton

class Settings private constructor() {
    lateinit var language: Language
    companion object {
        private var instance: Settings? = null

        fun getInstance(): Settings {
            if (instance == null) {
                instance = Settings()
            }
            return instance!!
        }

    }
}