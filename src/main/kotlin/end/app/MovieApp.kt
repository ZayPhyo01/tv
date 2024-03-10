package end.app


// object should not create if class represent abstract concept


abstract class MovieApp {

    abstract fun showSplashScreen()

    fun exit() {
        print("back to home")
    }

    abstract fun showLatestMovies()

    abstract fun showPopularMovieList()
}

//

