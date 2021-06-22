import java.util.Scanner;

public class MovieDriver {
    public static void  main(String[] args){
        Scanner scanner = new Scanner(System.in);

        Movie movieObj = new Movie();

        System.out.println("Enter the title of a movie");

        String movieTitle = scanner.nextLine();

        movieObj.setTitle(movieTitle);


        System.out.println("Enter the movie's rating");

        String movieRating = scanner.nextLine();

        movieObj.setRating(movieRating);

        System.out.println("How many tickets?");

        int soldTickets = scanner.nextInt();

        movieObj.setSoldTickets(soldTickets);

        System.out.println(movieObj.toString());
    }
}
