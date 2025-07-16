import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;


public class NodeA {

    static List<GraphicalObject> routingTable = new ArrayList<>();

    public static void main(String[] args) throws IOException {

        ServerSocket nodeA = new ServerSocket(8000);
        System.out.println("Node A started. Waiting for Node B...");

        Socket clientSocket = nodeA.accept();
        System.out.println("Node B connected.\n");

        ObjectOutputStream out = new ObjectOutputStream(clientSocket.getOutputStream());
        ObjectInputStream in = new ObjectInputStream(clientSocket.getInputStream());
        Utility.printRoutingTable("Node A Graphical Object List", routingTable);
        System.out.println();


            try {
                List<GraphicalObject> graphicalObjectList = (List<GraphicalObject>) in.readObject();
                Utility.printRoutingTable("Node A Graphical Object List, After Receiving Objects from Node B", graphicalObjectList );
                StringBuilder objectNames = new StringBuilder();
                for(GraphicalObject obj: graphicalObjectList) {
                    objectNames.append(obj.getType() + ", ");
                }
                out.writeObject(new Acknowledgement("%d Graphical objects received. Types:  %s"
                        .formatted(graphicalObjectList.stream().count(), objectNames.toString())));
                out.flush();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }


        clientSocket.close();
        nodeA.close();
    }


}
