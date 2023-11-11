package factorypattern.logistics

import factorypattern.transport.Transport
import factorypattern.transport.Truck

//concrete factory
class RoadLogistics : Logistics() {
    override fun createTransport(): Transport {
        return Truck()
    }
}