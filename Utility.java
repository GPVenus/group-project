import java.util.List;
import java.util.Map;

public class Utility {
    static void printRoutingTable(String message, List<GraphicalObject> graphicalObjectList) {
        System.out.println(message);
        System.out.println("------------------------------------------------");
        if(graphicalObjectList.stream().count() == 0) {
            System.out.println("The list is empty");
        } else {
            for (GraphicalObject r : graphicalObjectList) {
                System.out.println(r);
            }
        }

        System.out.println("------------------------------------------------");
    }

    static  void printAcknowledgment(String heading, Acknowledgement message) {
        System.out.println(heading);
        System.out.println("------------------------------------------------");
        System.out.println(message);
        System.out.println("------------------------------------------------");
    }

    static void sleep(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
        }
    }
}
