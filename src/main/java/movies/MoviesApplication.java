package movies;

import util.Input;

import java.util.Arrays;

//
public class MoviesApplication {
    private static Input input = new Input();

    private static Movie [] movies;
    public static void main(String[] args) {
        //grab all movies
        movies = MoviesArray.findAll();

        input = new Input();

        // command loop
        // each iteration:
        // 1. print the menu
        // 2. wait for the user to enter a choice
        // 3. do whatever the choice is
        // until the user enters choice 0
        while(true) {
            // 1. print the menu
            printMenu();

            // 2. wait for the user to enter a choice
            //getInt does not break out
            int choice = input.getInt(0, 6, "Enter your choice: ");

            // 3. do whatever the choice is
            doChoice(choice);

            // until the user enters choice 0
            if(choice == 0) {
                break;
            }
        }

        System.out.println("Bye");

    }

    private static void printMenu() {
        System.out.println("""
                What would you like to do?
                                
                0 - exit
                1 - view all movies
                2 - view movies in the animated category
                3 - view movies in the drama category
                4 - view movies in the horror category
                5 - view movies in the scifi category
                6 - add movie
                                
                Enter your choice:
                """);
    }

    private static void doChoice(int choice) {
        switch (choice) {
            case 1:
                viewAllMovies();
            case 2:
                viewAMoviesByCategory("drama");
            case 3:
                viewAMoviesByCategory("musical");
            case 4:
                viewAMoviesByCategory("scifi");
            case 5:
                viewAMoviesByCategory("horror");
            case 6:
                input.getString();
                addMovie();
                break;
        }
    }

    private static void viewAllMovies() {
        for (Movie movie : movies) {
            System.out.println(movie);
        }
        System.out.println();
    }

    private static void viewAMoviesByCategory(String category) {
        for (Movie movie : movies) {
            if (movie.getCategory().equals(category)) {
                System.out.println(movie);
            }
        }
        System.out.println();
    }

    private static void addMovie() {
        String movieName = input.getString("Enter movie name: ");
        String movieCategory = input.getString("Enter movie category: ");

        Movie movie = new Movie(movieName, movieCategory);
            movies = Arrays.copyOf(movies, movies.length + 1);
            movies[movies.length -1] = movie;

    }
}
