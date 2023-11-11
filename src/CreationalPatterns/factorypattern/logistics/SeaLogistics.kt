package factorypattern.logistics

import factorypattern.transport.Ship
import factorypattern.transport.Transport

//concrete factory
class SeaLogistics : Logistics() {
    override fun createTransport(): Transport {
        return Ship()
    }
}