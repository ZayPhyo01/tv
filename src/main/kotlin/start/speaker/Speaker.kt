package start.speaker

class Speaker {
    private var volumeLevel = 100

    fun increaseVolume() {
        if (volumeLevel in 0..100)
            println(
                "volume is increase"
            )
    }

    fun reduceVolume() {
        if (volumeLevel in 0..100) {
            println(
                "volume is decrease"
            )
        }
    }
}