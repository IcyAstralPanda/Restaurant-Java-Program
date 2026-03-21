public class Restaurant {
    // Properties
    private String name;
    private int waitTime;
    private double rating;
    private double avgPrice;
    private double distance;
    private String hoursOpen;

    // Constructor
    public Restaurant() {
    }

    public Restaurant(String name, int waitTime, double rating, double avgPrice, double distance, String hoursOpen) {
        this.name = name;
        this.waitTime = waitTime;
        this.rating = rating;
        this.avgPrice = avgPrice;
        this.distance = distance;
        this.hoursOpen = hoursOpen;
    }


    // Getters & Setters
    // Accessors & Mutators


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHoursOpen() {
        return hoursOpen;
    }

    public void setHoursOpen(String hoursOpen) {
        this.hoursOpen = hoursOpen;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getAvgPrice() {
        return avgPrice;
    }

    public void setAvgPrice(double avgPrice) {
        this.avgPrice = avgPrice;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getWaitTime() {
        return waitTime;
    }

    public void setWaitTime(int waitTime) {
        this.waitTime = waitTime;
    }

    public String toString() {
        String col1 = "%-17s ";
        String nameFormat = String.format(col1 + "%-30s%n", "Name:", name);
        String waitFormat = String.format(col1 + "%-5d%n", "Wait Time:", waitTime);
        String ratingFormat = String.format(col1 + "%-5.2f%n", "Rating:", rating);
        String avgFormat = String.format(col1 + "%-5.2f%n", "Average Price:", avgPrice);
        String distFormat = String.format(col1 + "%-5.2f%n", "Distance:", distance);
        String hoursFormat = String.format(col1 + "%-30s%n", "Open:", hoursOpen);

        return nameFormat + waitFormat + ratingFormat + avgFormat + distFormat + hoursFormat;

    }
}