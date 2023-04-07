public class Movie {
    private String title;

    public Movie(String title){
        this.title = title;
    }

    public void watchMovie(){
        String instaceType = this.getClass().getSimpleName();
        System.out.println(title + " is a " + instaceType + " film.");
    }
    // This is a Factory method!
    /*
    * The calling code does not need to know anything about movie's subclasses.
    * This method return a new instance object is known as Factory method in software programing design patterns
    * Allowed we to add new categories without changing the main method in calling code*/

    public static Movie getMovie (String type, String title){
        return switch(type.toUpperCase().charAt(0)){

            case 'A'-> new Adventure(title);
            case 'C'-> new Comedy(title);
            case 'S'-> new ScienceFiction(title);
            default -> new Movie(title);
        };
    }
}
