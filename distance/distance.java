
class Distance {
    double inch, foot;
    
    // Default constructor to initialize inch and foot to 0
    Distance() {
        inch = 0;
        foot = 0;
    }
    
    // Parameterized constructor to set inch and foot with given values
    Distance(double inch, double foot) {
        this.inch = inch;
        this.foot = foot;
    }
    
    // Method to set the distance with new inch and foot values
    void setDistance(double inch, double foot) {
        this.inch = inch;
        this.foot = foot;
    }
    
    // Method to display the distance in inches and feet
    void displayDistance() {
        System.out.println("Inch: " + inch);
        System.out.println("Foot: " + foot);
    }
    
    // Method to convert the distance to different units
    void convertDistance() {
        System.out.println(inch + " inches = " + (inch * 2.54) + " cm");
        System.out.println(foot + " foot = " + (foot * 12) + " inches");
    }
}

class DistanceMain {
    public static void main(String[] args) {
        Distance d1 = new Distance();
        Distance d2 = new Distance(5, 7);
        
        d1.displayDistance();
        d2.displayDistance();
        
        d1.setDistance(7, 5);
        d1.convertDistance();
        d2.convertDistance();
    }
}
