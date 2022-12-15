import info.*;
import util.FileService;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        run();
    }
    public static void run() {
        FileService fileService = new FileService();
        List<Movie> movies = FileService.parseMovies();

        printCollection(movies);
        sortByYear(movies);

        System.out.println("+________________Searching a movie_____________________+");
        System.out.println("Enter a name of the movie: ");
        Scanner scanner = new Scanner(System.in);
        String searchMovie = scanner.nextLine();
        searchMoviesByName(movies, searchMovie);

        sortByDirector(movies);
        sortByName(movies);

    }

    private static void sortByName(List<Movie> movies) {
        Collections.sort(movies);
        System.out.println("+________________Sorting by the name_____________________+");
        for (var m : movies) {
            System.out.println(m.getName());
        }

    }

    private static void printCollection(List<Movie> movies) {
        System.out.println("+______________Movie Collection_____________________+");
        for (var m : movies){
            System.out.println(m);
        }
    }

    private static void sortByYear(List<Movie> movies) {
        Collections.sort(movies);
        System.out.println("+________________Sorting by year_____________________+");
        for (var m : movies) {
            System.out.println(m.getName() + " " + m.getYear());
        }
    }
    private static void searchMoviesByName(List<Movie> movies, String searchMovie) {
        for (Movie movie : movies) {
            String name = movie.getName();
            if (name.toLowerCase().contains(searchMovie.toLowerCase())) {
                System.out.printf("The %s movie is available\n", name);
            }
        }
    }
    private static void sortByDirector(List<Movie> movies) {
        Collections.sort(movies);
        System.out.println("+______________Sorting by Director_____________________+");
        for (var m : movies){
            System.out.println(m.getName() +" Director is: " + m.getDirector());
        }
    }
    }
