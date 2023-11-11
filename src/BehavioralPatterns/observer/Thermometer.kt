package observer

class Thermometer {
    private val observers = ArrayList<Observer>()
    private var temperature = 0

    private fun notifyObservers(message: String) {
        observers.forEach { it.update(message) }
    }

    fun subscribe(o: Observer) {
        observers.add(o)
    }

    fun unsubscribe(o: Observer) {
        observers.remove(o)
    }

    fun updateTemperature(temperature: Int) {
       this.temperature = temperature
       notifyObservers("Temperature changed to $temperature")
    }
}