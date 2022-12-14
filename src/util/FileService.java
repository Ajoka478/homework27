package util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import info.Movie;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileService {
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();
    private static final Path PATH = Paths.get("data/tracks.json");

    public static Movie[] readFile(){
        String read = "";
        try{
            read = Files.readString(PATH);
        } catch (IOException e){
            e.printStackTrace();
        }
        return GSON.fromJson(read, Movie[].class);
    }

    public static void writeFile(Movie[] movies){
        String str = GSON.toJson(movies);
        try{
            Files.write(PATH, str.getBytes());
        } catch (IOException e){
            e.printStackTrace();
        }
    }

}