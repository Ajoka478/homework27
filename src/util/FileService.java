package util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import info.Movie;
import info.MovieCollection;
import java.io.FileReader;
import java.util.List;

public class FileService <T>{


    public static List<Movie> parseMovies(){
        Gson gson = new  GsonBuilder().setPrettyPrinting().create();
        try(FileReader reader = new FileReader("task1/data/movies.json")){
            return gson.fromJson(reader, MovieCollection.class).getMovies();

        }catch (Exception e){
            System.out.println("Error " + e.toString());
        }
        return null;
    }
}