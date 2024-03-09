package start.screen

import end.screen.Fluorescent

class LcdScreen(
    private val fluorescent: Fluorescent
) {
    private var brightnessLevel = 100

    fun reduceBrightness() {
        reduceEnergyUsage()
        fluorescent.reduceElectricCurrentSupply()

        if (brightnessLevel > 0)
            brightnessLevel--
    }

    fun increaseBrightness() {
        increaseEnergyUsage()
        fluorescent.increaseElectricCurrentSupply()

        if (brightnessLevel < 100) {
            brightnessLevel++
        }
    }

    fun getCurrentBrightnessLevel() = brightnessLevel

    private fun reduceEnergyUsage() {
        println("reducing energy usage ... ")
    }

    private fun increaseEnergyUsage() {
        println("increasing energy usage ...")
    }
}