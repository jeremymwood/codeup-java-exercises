package movies;

import java.util.Arrays;

public class MoviesApplication {
    public static void printMovies() {
            System.out.println(Arrays.toString(MoviesArray.findAll()));
            //get name, get category
//        for (int i = 0; i < MoviesArray.findAll().length; i++) {
//        }
    }


    public static void main(String[] args) {

        printMovies();


//        Input input = new Input();
//
////         command loop
////         each iteration:
////         1. print the menu
////         2. wait for the user to enter a choice
////         3. do whatever the choice is
////         until the user enters choice 0
//        while(true) {
////             1. print the menu
//            printMenu();
//
////             2. wait for the user to enter a choice
//            int choice = input.getInt(0, 5, "Enter your choice: ");
//
////             3. do whatever the choice is
//            doChoice(choice);
//
////             until the user enters choice 0
//            if(choice == 0) {
//
//                break;
//            }
//        }
//        System.out.println("Bye");
    }
//    private static void printMenu() {
//        System.out.println("Menu goes here");
//    }
//    private static void doChoice(int choice) {
//        switch(choice) {
//            case 1:
//                // call function to view all movies
//                break;
//        }
//    }
}
