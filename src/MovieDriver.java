import java.util.Scanner;

public class MovieDriver {
    public static void  main(String[] args){

        String answer = "y";
        Scanner scanner = new Scanner(System.in);

        Movie movieObj = new Movie();

        do {
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

            System.out.println();
            System.out.println();

            System.out.println("Would you like to add another movie?");
            System.out.println("type y for yes and n for no");
            scanner.nextLine();
            answer = scanner.nextLine();

            if(answer.equals("n")){
                System.out.println("Goodbye");
            }

        } while(answer.equals("y"));
    }
}
