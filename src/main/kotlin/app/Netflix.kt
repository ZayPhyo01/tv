package app

class Netflix {

    fun openNetflix() {
        showSplashScreen()
        showLatestMovies()
        showPopularMovieList()
    }

    private fun showSplashScreen() {
        println("Netflix")
    }

    private fun showLatestMovies() {
        val latestMovies = listOf(
            "House of ninja",
            "Young Sheldon , Season 6",
            "The Last AIRBENDER",
            "PARASYTE , The Grey",
            "Homicide , The New York"
        )
        println(latestMovies)
    }

    private fun showPopularMovieList() {
        val popularMovies = listOf(
            "House of ninja",
            "Night Agent",
            "All of us are dead",
            "Captivating The King",
            "Young Sheldon"
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