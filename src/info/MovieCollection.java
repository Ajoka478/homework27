package info;

import java.util.ArrayList;
import java.util.List;

public class MovieCollection {
    private List<Movie> movies = null;
    public List<Movie> getMovies(){
        return movies;
    }

    public void setMovies(ArrayList<Movie> movies){
        this.movies = (ArrayList<Movie>) movies;
    }
    @Override
    public String toString(){
        return "Movie collection{"+
                "movies=" + movies +
                "}\n";
    }
}
