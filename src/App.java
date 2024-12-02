public class App {
    // Constants
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    // Private data fields
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    // Default values
    public App() {
        this.speed = SLOW;  
        this.on = false;    
        this.radius = 5;    
        this.color = "blue"; 
    }

    // Accessor and mutator methods
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // toString() method to return a string description of the fan
    @Override
    public String toString() {
        if (on) {
            return "Fan is on: Speed = " + speed + ", Color = " + color + ", Radius = " + radius;
        } else {
            return "Fan is off: Color = " + color + ", Radius = " + radius;
        }
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        
        App fan1 = new App();
        fan1.setSpeed(FAST);  
        fan1.setRadius(10);   
        fan1.setColor("yellow");  
        fan1.setOn(true);         

        App fan2 = new App();
        fan2.setSpeed(MEDIUM);  
        fan2.setRadius(5);      
        fan2.setColor("blue");  
        fan2.setOn(false);      

        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
}
