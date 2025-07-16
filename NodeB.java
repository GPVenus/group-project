import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.List;


public class NodeB {
    static List<GraphicalObject> graphicalObjects = List.of(
            new GraphicalObject("Rectangle", 10, 5, "Red" ),
            new GraphicalObject("Square", 10, 10, "Green")
    );

    public static void main(String[] args) throws IOException {

        Socket nodeB = new Socket("localhost", 8000);
        ObjectOutputStream out = new ObjectOutputStream(nodeB.getOutputStream());
        ObjectInputStream in = new ObjectInputStream(nodeB.getInputStream());
        Utility.printRoutingTable("Node B Graphical Object List", graphicalObjects);
        System.out.println();

            out.writeObject(graphicalObjects);
            out.flush();
            try {
                //reads in Acknowledgment Object from A
                Acknowledgement serverTable = (Acknowledgement) in.readObject();

               Utility.printAcknowledgment("Acknowledgment Message Received From Node A", serverTable);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

        nodeB.close();
    }


}
