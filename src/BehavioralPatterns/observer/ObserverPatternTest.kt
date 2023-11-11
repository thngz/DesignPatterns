package observer

import org.junit.Test
import java.util.Random

class ObserverPatternTest {
    @Test
    fun allSubscribersGetNotified() {
        val o1 = EmailObserver()
        val o2 = SmsObserver()
        val o3 = EmailObserver()

        val thermometer = Thermometer()

        thermometer.subscribe(o1)
        thermometer.subscribe(o2)
        thermometer.subscribe(o3)

        for (i in 1..10) simulateChangeInTemperature(thermometer)
    }

    private fun simulateChangeInTemperature(thermometer: Thermometer) {
        val randomTemp = Random().nextInt(-40, 40)
        thermometer.updateTemperature(randomTemp)
    }
}