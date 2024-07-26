public class StarTest {
    public static void main(String [] args) {
        Star venus = new Venus("Venus", "Yellow-white", "12 104 km", "4.6 billion years old", "243 Earth days", "107.49 million km");
        System.out.println(venus);
        
        Star earth = new Earth("Earth", "Blue marble", "510.1 million km^2", "4.543 billion years old", "365 days", "152.04 million km");
        System.out.println(earth);
        
        Star[] stars = {venus, earth};
        for (Star star : stars) {
            star.displayInfo();
            System.out.println(star);
        }
    }
}