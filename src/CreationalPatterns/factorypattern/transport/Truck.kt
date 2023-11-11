package factorypattern.transport

class Truck : Transport {
    override fun deliver() : String {
        return "Delivered via truck"
    }

}