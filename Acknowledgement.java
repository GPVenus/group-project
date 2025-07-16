import java.io.Serializable;

public class Acknowledgement implements Serializable {
    private static final long serialVersionUID = 1L;
    private String message;
    //constructor for printing message
    public Acknowledgement(String msg) {
        message = msg;
    }

    @Override
    public String toString() {
        return message;
    }
}
