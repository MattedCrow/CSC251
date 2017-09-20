/*
 * The RoomDimension class determines the dimensions of the room
 */

package m2_p1_frankswalshwitter;

public class RoomDimension {
    // Initalizes Length & Width & Area
    double length = 0;
    double width = 0;
    
    double finalArea = 0;
    
    public RoomDimension(double len, double w) {
        // Setting length & width to user given input
        length = len;
        width = w;
    }
    
    // Method to determine area based on prior input from user
    public double getArea() {
        double area = length * width;
        
        finalArea = area;
        return area;
    }
    
    // Converts area returned to user to string and returns it
    public String toString(double area) {
        String str = Double.toString(area);
        
        return str;
    }
    
    // Empty constructor method for toString that takes area pre-existing in
    // the class to convert it to string and returns that
    public String toString() {
        String str = Double.toString(finalArea);
        
        return str;
    }
}
