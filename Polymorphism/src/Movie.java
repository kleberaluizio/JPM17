public class Movie {
    private String title;

    public Movie(String title){
        this.title = title;
    }

    public void watchMovie(){
        String instaceType = this.getClass().getSimpleName();
        System.out.println(title + " is a " + instaceType + " film.");
    }
}
