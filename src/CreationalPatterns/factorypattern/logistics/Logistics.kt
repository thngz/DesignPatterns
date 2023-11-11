package factorypattern.logistics

import factorypattern.transport.Transport

//the factory class
abstract class Logistics {

    fun deliver() : String {
        return createTransport().deliver()
    }

    protected abstract fun createTransport() : Transport
}