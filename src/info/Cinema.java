package info;

import com.google.gson.Gson;
import util.FileService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Cinema {
    private ArrayList<Movie> movies;

    public Cinema() {
    }

    public void run() {
        FileService fileService = new FileService();
        MovieCollection movieCollection = fileService.readFile();
        System.out.println(movieCollection.getMovies().toString());

        //int index = Collections.binarySearch(movieCollection, 5)
    }

}
