package end.screen

import end.screen.BackLit

class LedScreen(private val backLit: BackLit) : Screen() {
    private var brightnessLevel = 100

    override fun reduceBrightness() {
        reduceEnergyUsage()
        backLit.reduceIntensity()

        if (brightnessLevel > 0)
            brightnessLevel--
    }

    override fun increaseBrightness() {
        increaseEnergyUsage()
        backLit.increaseIntensity()

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