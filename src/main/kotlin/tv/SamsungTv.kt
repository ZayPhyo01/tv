package tv

import screen.LcdScreen
import speaker.Speaker

class SamsungTv(private val lcdScreen: LcdScreen, private val speaker: Speaker) {

    fun showIntroLogo() {
        println("SAMSUNG ... ")
    }

    fun increaseBrightness() {
        lcdScreen.increaseBrightness()
    }

    fun reduceBrightness() {
        lcdScreen.reduceBrightness()
    }

    fun enableInternet() {
        println(
            "internet is connected"
        )
    }

    fun disableInternet() {
        println(
            "internet is disconnected"
        )
    }

    fun increaseVolume() {
        speaker.increaseVolume()
    }

    fun reduceVolume() {
        speaker.reduceVolume()
    }
}