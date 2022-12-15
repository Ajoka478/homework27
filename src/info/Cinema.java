package info;

import com.google.gson.Gson;
import util.FileService;

import java.util.Iterator;
import java.util.List;

public class Cinema {

    public Cinema() {
    }

    public void run() {
        FileService<MovieCollection> parser = new FileService(MovieCollection.class);
        List<MovieCollection> collections = parser.readJson("data/movies.json");

        Iterator<MovieCollection> it = collections.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }

}
