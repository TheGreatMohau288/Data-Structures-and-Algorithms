public abstract class Star {
    protected String name;
    protected String colour;
    protected String size;
    protected String age;
    
    public Star(String name, String colour, String size, String age) {
        this.name = name;
        this.colour = colour;
        this.size = size;
        this.age = age;
    }
    
    public abstract void displayInfo();
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getColour() {
        return colour;
    }
    
    public void setColour(String colour) {
        this.colour = colour;
    }
    
    public String getSize() {
        return size;
    }
    
    public void setSize(String size) {
        this.size = size;
    }
    
    public String getAge() {
        return age;
    }
    
    public void setAge(String age) {
        this.age = age;
    }
    
    @Override
    public String toString() {
        return "Name: " + name + ", Colour: " + colour + ", Size: " + size + ", Age: " + age;
    }
}