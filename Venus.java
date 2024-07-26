public class Venus extends Star {
    private String numberOfDays;
    private String distanceFromStar;
    
    public Venus(String name, String colour, String size, String age, String numberOfDays, String distanceFromStar) {
        super(name, colour, size, age);
        this.numberOfDays = numberOfDays;
        this.distanceFromStar = distanceFromStar;
    }
    
    @Override
    public void displayInfo() {
        System.out.println("This is Venus, a planet named " + getName() + " with a colour of " + getColour() + ", a size of " + getSize() + ", an age of " + getAge() + " years, " + numberOfDays + " days, and a distance of " + distanceFromStar + " from the star.");
    }
    
    @Override
    public String toString() {
        return "Venus: " + super.toString() + ", Number of Days: " + numberOfDays + ", Distance from star: " + distanceFromStar;
    }
}