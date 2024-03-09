package start.tv

import end.screen.LedScreen
import end.speaker.Speaker
import end.tv.ToshibaButton

class Toshiba(
    private val ledScreen: LedScreen,
    private val toshibaButton: ToshibaButton,
    private val speaker: Speaker
) {

    fun showIntroLogo() {
        println("Toshiba")
    }

    fun increaseBrightness() {
        toshibaButton.clickIncreaseBrightness {
            ledScreen.increaseBrightness()
        }

    }

    fun reduceBrightness() {
        toshibaButton.clickReduceBrightness {
            ledScreen.reduceBrightness()
        }
    }

    fun increaseVolume() {
        toshibaButton.clickIncreaseVolume {
            speaker.increaseVolume()
        }
    }

    fun reduceVolume() {
        toshibaButton.clickReduceVolume {
            speaker.reduceVolume()
        }
    }

}

class ToshibaButton {
    fun clickIncreaseBrightness(
        onClick: () -> Unit
    ) {
        onClick()
    }

    fun clickReduceBrightness(
        onClick: () -> Unit
    ) {
        onClick()
    }

    fun clickIncreaseVolume(
        onClick: () -> Unit
    ) {
        onClick()
    }

    fun clickReduceVolume(
        onClick: () -> Unit
    ) {
        onClick()
    }


}