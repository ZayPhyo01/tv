package start.tv

import end.app.Netflix
import end.screen.LedScreen
import end.speaker.Speaker
import start.app.AmazonPrime

class AndroidTv(
    private val ledScreen: LedScreen,
    private val netflix: Netflix,
    private val amazonPrime: AmazonPrime,
    private val speaker: Speaker
) {

    fun showIntroLogo() {
        println("Hello Android ... ")
    }

    fun openNetflix() {
        netflix.openNetflix()
    }

    fun openAmazonPrime() {
        amazonPrime.openAmazonPrime()
    }

    fun exitNetflix() {
        netflix.exit()
    }

    fun exitAmazonPrime() {
        amazonPrime.exit()
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