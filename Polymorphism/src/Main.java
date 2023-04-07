import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        while(true) {
            System.out.println("Enter type (A for adventure, C for Comedy, S for Science Fiction, or Q to quit)");
            String type = s.nextLine();

            if (type.equalsIgnoreCase("Q")) {
                break;
            }

            //if ("qQ".contains(type)) {
            //  break } Verify if type is present in the original string "qQ".
            System.out.println("Enter Movie title");
            String title = s.nextLine();

            Movie movie = Movie.getMovie(type, title);
            movie.watchMovie();
        }
    }
}


/*        Movie theMovie = new Adventure("I'm a legend");
        theMovie.watchMovie();
        System.out.println("--".repeat(10));
        Movie theMovie1 = new Comedy("Big People");
        theMovie1.watchMovie();
        System.out.println("--".repeat(10));
        Movie theMovie2 = new ScienceFiction("Star Wars");
        theMovie2.watchMovie();*/

//        Movie theMovie = Movie.getMovie("Science", "Star Wars");
//        theMovie.watchMovie();
