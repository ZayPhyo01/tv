package tv

import app.Netflix
import screen.LedScreen
import speaker.Speaker

class AndroidTv(
    private val ledScreen: LedScreen,
    private val netflix: Netflix,
    private val speaker: Speaker
) {

    fun showIntroLogo() {
        println("Hello Android ... ")
    }

    fun openNetflix() {
        netflix.openNetflix()
    }

    fun playBomberman() {
        println("Bomb! , Bomb!")
    }

    fun increaseBrightness() {
        ledScreen.increaseBrightness()
    }

    fun reduceBrightness() {
        ledScreen.reduceBrightness()
    }

    fun enableInternet() {
        println(
            "internet is connected"
        )
    }

    fun disableInternet() {
        println(
            "internet is disconnect"
        )
    }


    fun increaseVolume() {
        speaker.increaseVolume()
    }

    fun reduceVolume() {
        speaker.reduceVolume()
    }


    fun openSpotify() {
        println("Spotify not support current location!")
    }
}