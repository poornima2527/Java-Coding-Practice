class Movie {
    String title;
    String genre;
    double rating;

    Movie(String title, String genre, double rating) {
        this.title = title;
        this.genre = genre;
        this.rating = rating;
    }

    void displayDetails() {
        System.out.println("Title  : " + title);
        System.out.println("Genre  : " + genre);
        System.out.println("Rating : " + rating);

    }

    public static void main(String[] args) {
        Movie movie1 = new Movie("Inception", "Sci-Fi", 8.8);
        Movie movie2 = new Movie("The Dark Knight", "Action", 9.0);
        Movie movie3 = new Movie("Interstellar", "Adventure", 8.6);

        Movie[] movies = {movie1, movie2, movie3};

        for (Movie m : movies) {
            m.displayDetails();
        }
    }
}
