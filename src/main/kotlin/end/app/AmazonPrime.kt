package end.app

class AmazonPrime : MovieApp() {

    fun openAmazonPrime() {
        showSplashScreen()
        showLatestMovies()
        showPopularMovieList()
    }

    override fun showSplashScreen() {
        println("Prime ... ")
    }

    override fun showLatestMovies() {
        val latestMovies = listOf(
            "The Last AIRBENDER",
            "Homicide , The New York"
        )
        println(latestMovies)
    }

    override fun showPopularMovieList() {
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
}