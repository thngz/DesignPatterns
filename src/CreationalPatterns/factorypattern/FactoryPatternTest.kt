package factorypattern

import factorypattern.logistics.RailLogistics
import factorypattern.logistics.RoadLogistics
import factorypattern.transport.Train
import org.junit.Assert.assertEquals
import org.junit.Test

class FactoryPatternTest {

    @Test
    fun createsLogisticsForTruck () {
        val type = ShippingType.TRUCK
        val logisticsApp = LogisticsApp()
        val result = logisticsApp.startLogistics(type)

//        val truckLogistics = RoadLogistics()
//        truckLogistics.deliver()

        assertEquals(result, "Delivered via truck");
    }

    @Test
    fun createsLogisticsForTrain() {
        val type = ShippingType.TRAIN
        val logisticsApp = LogisticsApp()
        val result = logisticsApp.startLogistics(type)

        assertEquals(result, "Delivered via train");
    }

    @Test
    fun createsLogisticsForShip () {
        val type = ShippingType.SHIP
        val logisticsApp = LogisticsApp()
        val result = logisticsApp.startLogistics(type)

        assertEquals(result, "Delivered via ship");
    }
}
