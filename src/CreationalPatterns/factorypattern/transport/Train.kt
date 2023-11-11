package factorypattern.transport

class Train : Transport {
    override fun deliver() : String {
       return "Delivered via train"
    }
}