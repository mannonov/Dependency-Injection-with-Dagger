package displays

import interfaces.Display

class OledDisplay: Display {
    override fun displayInfo() {
        println("Organic Light Emitting Diode")
    }
}