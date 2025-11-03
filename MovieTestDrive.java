class Movie {
    String title;
    String genre;
    int rating;

    void playIt() {
        System.out.println("Playing The Movie");
    }
}

public class MovieTestDrive {
    public static void main (String[] args) {

        Movie one = new Movie();
        one.title = "gone with the stock";
        one.genre = "tragic";
        one.rating = 4;

        Movie two = new Movie();
        two.title = "bullshit";

        two.playIt();

    }
}