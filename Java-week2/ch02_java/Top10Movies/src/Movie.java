public class Movie {

    int movieRank;
    String title, director;
    int rottenTomatoScore;
    public Movie(int movieRank, String title, String director, int rottenTomatoScore) {
        this.movieRank = movieRank;
        this.title = title;
        this.director = director;
        this.rottenTomatoScore = rottenTomatoScore;
    }
    public int getMovieRank() {
        return movieRank;
    }
    public void setMovieRank(int movieRank) {
        this.movieRank = movieRank;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public int getRottenTomatoScore() {
        return rottenTomatoScore;
    }
    public void setRottenTomatoScore(int rottenTomatoScore) {
        this.rottenTomatoScore = rottenTomatoScore;
    }
    @Override
    public String toString() {
        return "Movie [director=" + director + ", movieRank=" + movieRank + ", rottenTomatoScore=" + rottenTomatoScore +"%"
                + ", title=" + title + "]";
    }

    
    
}
