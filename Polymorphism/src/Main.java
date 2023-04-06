public class Main {
    public static void main(String[] args) {

        Movie theMovie = new Adventure("I'm a legend");
        theMovie.watchMovie();
        System.out.println("--".repeat(10));
        Movie theMovie1 = new Comedy("Big People");
        theMovie1.watchMovie();
        System.out.println("--".repeat(10));
        Movie theMovie2 = new ScienceFiction("Star Wars");
        theMovie2.watchMovie();


    }
}

