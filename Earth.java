public class Earth extends Star {
    private String numberOfDays;
    private String distanceFromStar;
    
    public Earth(String name, String colour, String size, String age, String numberOfDays, String distanceFromStar) {
        super(name, colour, size, age);
        this.numberOfDays = numberOfDays;
        this.distanceFromStar = distanceFromStar;
    }
    
    @Override
    public void displayInfo() {
        System.out.println("This is Earth, a planet named " + getName() + " with a colour of " + getColour() + ", a sie of " + getSize() + ", an age of " + getAge() + " years, " + numberOfDays + " days, and a distance of " + distanceFromStar + " from the star.");
    }
    
    @Override
    public String toString() {
        return " Earth: " + super.toString() + ", Number of Days: " + numberOfDays + ", Distance from Star: " + distanceFromStar;
    }
}