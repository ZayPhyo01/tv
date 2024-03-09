package start.app

class AmazonPrime {

    fun openAmazonPrime() {
        showSplashScreen()
        showLatestMovies()
        showPopularMovieList()
    }

    private fun showSplashScreen() {
        println("Prime ... ")
    }

    private fun showLatestMovies() {
        val latestMovies = listOf(
            "The Last AIRBENDER",
            "Homicide , The New York"
        )
        println(latestMovies)
    }

    private fun showPopularMovieList() {
        val popularMovies = listOf(
            "The Lord Of the ring",
            "Walking dead",
            "WWZ",
            "The terminal list"
        )
        println(
            popularMovies.joinToString(
                separator = ": "
            ) {
                it
            }
        )
    }

    fun exit () {
        print("back to home")
    }
}