package util;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class FileService <T>{
    private final Type type;
    private final Gson gson;

    public FileService(Class<T> Class) {
        this.gson = new Gson();
        this.type = new TypeToken<ArrayList<T>>(){}.getType();
    }

    public List<T> readJson(String fileName){
        try (Reader reader = new BufferedReader(new FileReader(fileName))){
            return gson.fromJson(reader, type);
        } catch (IOException e){
            throw new RuntimeException(e);
        }
    }

//    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();
//    private static final Path PATH = Paths.get("data/movies.json");
//
//    public MovieCollection readFile(){
//        Gson gson = new Gson();
//        try(FileReader reader = new FileReader("data/movies.json")){
//           MovieCollection movieCollection = gson.fromJson(reader, MovieCollection.class);
//        } catch (IOException e){
//            e.printStackTrace();
//        }
//        return null;
//    }

//    public MovieCollection writeFile(Movie movies){
//        String str = GSON.toJson(movies);
//        try{
//            Files.write(PATH, str.getBytes());
//        } catch (IOException e){
//            e.printStackTrace();
//        }
//        return null;
//    }

}