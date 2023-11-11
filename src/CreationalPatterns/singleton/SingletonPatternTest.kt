package singleton

import org.junit.Test

class SingletonPatternTest {
    @Test
    fun createSettingsSingleton() {
        val settings = Settings.getInstance()
        settings.language = Language.ESTONIAN
        println(settings.language) // Estonian

        val settings2 = Settings.getInstance()
        println(settings2.language) // Estonian

    }

}