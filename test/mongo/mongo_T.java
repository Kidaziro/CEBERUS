package mongo;

import com.mongodb.*;
public class mongo_T {

    public static void main(String[] args) {
        try {
            MongoClient m = new MongoClient("localhost", 27017);
            DB db1 = m.getDB("CEBERUS");
            
            DBCollection coll = db1.getCollection("Users_data");
            BasicDBObject d1 = new BasicDBObject("Name", "killer").append("Num1", "1");
            BasicDBObject d2 = new BasicDBObject("User_nam", "User_T@gmail.com").append("User_pass", "202cb962ac59075b964b07152d234b70");
            
//            coll.insert(d1);
//            coll.insert(d2);
            DBCursor cur = coll.find(d2);
            while (cur.hasNext()) {
                
                System.out.println(cur.next());

            }

        } catch (Exception e) {
            System.out.println("problem >>> \n" + e);
        }

    }

}
