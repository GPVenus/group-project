import java.io.Serializable;

public class GraphicalObject implements Serializable {
    private static final long serialVersionUID = 1L;
    private String type; // e.g., "Circle", "Rectangle"
    private int x, y; // coordinates
    private String color;

    //custom constructor for initializing GraphicalObject
    public GraphicalObject(String type, int x, int y, String color) {
        this.type = type;
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public String getType() {
        return type;
    }
    // Getters and toString() for display
    public String toString() {
        return "Type: " + type + ", Position: (" + x + "," + y + "), Color: " + color;
    }
}
