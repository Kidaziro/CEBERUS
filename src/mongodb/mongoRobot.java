package mongodb;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;
import java.io.FileInputStream;
import java.security.KeyStore;
import java.util.Arrays;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManagerFactory;

public class mongoRobot {

    public mongoRobot(int op, String[] keys, String[] val, String db) {

        if (op == 1) {
            mongo_send(keys, val, db);
        }

    }

    public String isac(String email) {
        try {
            String user = "CER_User"; // the user name
            String database = "CEBERUS"; // the name of the database in which the user is defined
            char[] password = new char[12];
            password[0] = 'u';
            password[1] = 'y';
            password[2] = 'u';
            password[3] = 'X';
            password[4] = 'F';
            password[5] = 'B';
            password[6] = 'K';
            password[7] = '3';
            password[8] = '2';
            password[9] = 'V';
            password[10] = '7';
            password[11] = '8';
            KeyStore truststore = KeyStore.getInstance("jks");
            truststore.load(new FileInputStream("/ssl/mytruststore.jk"), "S806Kc_56NJu".toCharArray());
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            trustManagerFactory.init(truststore);
            SSLContext sslContext = SSLContext.getInstance("TLS");
            
            sslContext.init(null, trustManagerFactory.getTrustManagers(), null);
            
            MongoCredential credential = MongoCredential.createScramSha1Credential(user,
                    database,
                    password);
            MongoClient m = new MongoClient(new ServerAddress("localhost", 27017),
                    Arrays.asList(credential));
            DB db1 = m.getDB("CEBERUS");
            DBCollection coll = db1.getCollection("Users_data");

            BasicDBObject d1 = new BasicDBObject();

            d1.append("User_nam", email);

            DBCursor cur = coll.find(d1);

            return cur.toString();

        } catch (Exception e) {
            return "";
        }

    }

    public boolean mongo_check(String[] keys, String[] val, int db) {
        try {
            String user = "CER_User"; // the user name
            String database = "CEBERUS"; // the name of the database in which the user is defined
            char[] password = new char[12];
            password[0] = 'u';
            password[1] = 'y';
            password[2] = 'u';
            password[3] = 'X';
            password[4] = 'F';
            password[5] = 'B';
            password[6] = 'K';
            password[7] = '3';
            password[8] = '2';
            password[9] = 'V';
            password[10] = '7';
            password[11] = '8';

            MongoCredential credential = MongoCredential.createScramSha1Credential(user,
                    database,
                    password);
            MongoClient m = new MongoClient(new ServerAddress("localhost", 27017),
                    Arrays.asList(credential));
            DB db1 = m.getDB("CEBERUS");
            DBCollection coll = db1.getCollection("Users_data");
            DBCollection col2 = db1.getCollection("email_code");

            BasicDBObject d1 = new BasicDBObject();
            for (int i = 0; i < keys.length; i++) {
                d1.append(keys[i], val[i]);
            }
            DBCollection x[] = new DBCollection[2];
            x[0] = coll;
            x[1] = col2;

            DBCursor cur = x[db].find(d1);

            if (cur.hasNext()) {
                return true;
            } else {
                return false;
            }

        } catch (Exception e) {
            return false;
        }

    }

    public boolean mongo_update(String[] keys, String[] val, String[] update) {
        try {
            String user = "CER_User"; // the user name
            String database = "CEBERUS"; // the name of the database in which the user is defined
            char[] password = new char[12];
            password[0] = 'u';
            password[1] = 'y';
            password[2] = 'u';
            password[3] = 'X';
            password[4] = 'F';
            password[5] = 'B';
            password[6] = 'K';
            password[7] = '3';
            password[8] = '2';
            password[9] = 'V';
            password[10] = '7';
            password[11] = '8';

            MongoCredential credential = MongoCredential.createScramSha1Credential(user,
                    database,
                    password);
//          MongoClientOptions options = MongoClientOptions.builder().sslEnabled(true).build();
            MongoClient m = new MongoClient(new ServerAddress("localhost", 27017),
                    Arrays.asList(credential));
            DB db1 = m.getDB("CEBERUS");
            DBCollection coll = db1.getCollection("Users_data");
            // ->
            BasicDBObject d1 = new BasicDBObject();
            // ->------------values-------------------

            for (int i = 0; i < keys.length; i++) {
                d1.append(keys[i], val[i]);
            }
            // ->-----------update--------------------
            BasicDBObject d2 = new BasicDBObject();

            for (int i = 0; i < keys.length; i++) {
                d2.append(keys[i], update[i]);
            }

            coll.update(d1, d1);
            m.close();
            return true;

        } catch (Exception e) {
            return false;
        }

    }

    public void mongo_send(String[] keys, String[] val, String db) {

        try {
            String user = "CER_User"; // the user name
            String database = "CEBERUS"; // the name of the database in which the user is defined
            char[] password = new char[12];
            password[0] = 'u';
            password[1] = 'y';
            password[2] = 'u';
            password[3] = 'X';
            password[4] = 'F';
            password[5] = 'B';
            password[6] = 'K';
            password[7] = '3';
            password[8] = '2';
            password[9] = 'V';
            password[10] = '7';
            password[11] = '8';

            MongoCredential credential = MongoCredential.createScramSha1Credential(user,
                    database,
                    password);
//          MongoClientOptions options = MongoClientOptions.builder().sslEnabled(true).build();
            MongoClient m = new MongoClient(new ServerAddress("localhost", 27017),
                    Arrays.asList(credential));
            DB db1 = m.getDB("CEBERUS");
            DBCollection coll = db1.getCollection("Users_data");
            DBCollection col2 = db1.getCollection("email_code");

            BasicDBObject d1 = new BasicDBObject();

            for (int i = 0; i < keys.length; i++) {
                d1.append(keys[i], val[i]);
            }

            if (db == "Users_data") {
                coll.insert(d1);
            }
            if (db == "email_code") {
                col2.insert(d1);
            }
            m.close();
        } catch (Exception e) {

        }

    }

}
