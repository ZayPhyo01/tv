package end.app

//code reusable
//polymorphism


class Netflix : MovieApp() {

    fun openNetflix() {
        showSplashScreen()
        showLatestMovies()
        showPopularMovieList()
    }

    override fun showSplashScreen() {
        println("Netflix")
    }

    override fun showLatestMovies() {
        val latestMovies = listOf(
            "House of ninja",
            "Young Sheldon , Season 6",
            "The Last AIRBENDER",
            "PARASYTE , The Grey",
            "Homicide , The New York"
        )
        println(latestMovies)
    }

    override fun showPopularMovieList() {
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