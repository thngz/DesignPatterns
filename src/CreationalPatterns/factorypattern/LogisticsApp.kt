package factorypattern

import factorypattern.logistics.RailLogistics
import factorypattern.logistics.RoadLogistics
import factorypattern.logistics.SeaLogistics

class LogisticsApp {

    fun startLogistics(shippingType: ShippingType) : String {
        val logistics = when (shippingType) {
            ShippingType.SHIP -> SeaLogistics()
            ShippingType.TRAIN -> RailLogistics()
            ShippingType.TRUCK -> RoadLogistics()
        }

        return logistics.deliver()
    }
}