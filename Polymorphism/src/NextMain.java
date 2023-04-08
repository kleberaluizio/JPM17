public class NextMain {

    public static void main(String[] args) {
        Movie movie = Movie.getMovie("Adventure", "Jaws");
        movie.watchMovie();

        System.out.println("-".repeat(15));

        Adventure jaws = (Adventure) Movie.getMovie("A","Jaws");
        jaws.watchMovie();
        System.out.println("-".repeat(15));

        Object comedy = Movie.getMovie("C","Airplane");
        Comedy comedyMovie = (Comedy) comedy;
        comedyMovie.watchComedy();
        System.out.println("-".repeat(15));

        var airplane = Movie.getMovie("C","Airplane");
        airplane.watchMovie();
        System.out.println("-".repeat(15));

        var plane = new Comedy("Airplane");
        plane.watchComedy();
        System.out.println("-".repeat(15));

        Object unknownObject = Movie.getMovie("S","Airplane");
        System.out.println(unknownObject.getClass());
        if (unknownObject.getClass().getSimpleName() == "Comedy"){
            Comedy c = (Comedy) unknownObject;
            c.watchComedy();

        } else if (unknownObject instanceof Adventure) {
            ((Adventure) unknownObject).watchAdventure();
        } else if (unknownObject instanceof ScienceFiction syfy) {
            syfy.watchScience();
        }


    }
}
