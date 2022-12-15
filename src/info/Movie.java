package info;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Movie implements Comparable<Movie>{
    private String name;
    private Integer year;
    private String description;
    private Director director;
    private List<Cast> cast = null;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }
    public void setYear(Integer year) {
        this.year = year;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public Director getDirector() {
        return director;
    }
    public void setDirector(Director director) {
        this.director = director;
    }

    public List<Cast> getCast() {
        return cast;
    }
    public void setCast(List<Cast> cast) {
        this.cast = cast;
    }


    @Override
    public String toString() {
        return  String.format("\n %-45s | %-5s | %-12s | %-17s | %-20s", name, year, description, director, cast);
    }

    @Override
    public int compareTo(Movie o) {
        return this.getYear() - o.getYear();

    }
}
