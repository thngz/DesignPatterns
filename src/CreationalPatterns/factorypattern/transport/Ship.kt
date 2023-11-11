package factorypattern.transport

class Ship : Transport {
    override fun deliver() : String {
       return "Delivered via ship"
    }
}