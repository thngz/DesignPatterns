package factorypattern.logistics

import factorypattern.transport.Train
import factorypattern.transport.Transport

//concrete factory
class RailLogistics : Logistics() {
    override fun createTransport(): Transport {
        return Train()
    }
}