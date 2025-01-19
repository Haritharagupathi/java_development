public class Movie {
    private String name;
    private String format;
    private double rating;

    // Constructor
    public Movie(String name, String format, double rating) {
        this.name = name;
        this.format = format;
        this.rating = rating;
    }

    // Copy Constructor
    public Movie(Movie source) {
        this.name = source.name;
        this.format = source.format;
        this.rating = source.rating;
    }

    // Getter and Setter for 'name'
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for 'format'
    public String getFormat() {
        return this.format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    // Getter and Setter for 'rating'
    public double getRating() {
        return this.rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    // toString Method
    public String toString() {
        return this.rating + "\t" + this.format + "\t\t" + this.name;
    }
}