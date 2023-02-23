/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mongo;
import com.mongodb.*;
import java.net.UnknownHostException;
/**
 *
 * @author moadz
 */
public class Check_Conection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws UnknownHostException {
       MongoClientOptions.Builder builder = MongoClientOptions.builder();
// builder settings
ServerAddress ServerAddress = new ServerAddress("localhost", 27017);
MongoClient mongoClient = new MongoClient(ServerAddress, builder.build());

try {
    System.out.println("MongoDB Server is Up:- "+mongoClient.getAddress());
    System.out.println(mongoClient.getConnectPoint());
//    System.out.println(db.getStats());
} catch (Exception e) {
    System.out.println("MongoDB Server is Down");
} finally{
    mongoClient.close();
}
    }
    
}
