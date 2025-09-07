package com.praj.solidp.DIP;


class MySQLDatabase { //Low-Level Model
    public void saveToSQL(String data) {
        System.out.println("Executing SQL query: INSERT INTO USER VALUES('" + data +"') ");
    }
}

class MongoDBDatabase { // Low-Level Model
    public void saveToMongo(String data) {
        System.out.println("Executing MongoDB function: db.users.insert ({name: '" + data+ "'}) ");
    }
}

class UserService { //High Level module (Tightly coupled)
    private final MySQLDatabase sqlDb = new MySQLDatabase();
    private final MongoDBDatabase mongoDb = new MongoDBDatabase();

    public void storeUserToSQL(String user) {
        //MySql specific code
        sqlDb.saveToSQL(user);
    }

    public void storeUserToMongo(String user) {
        //MongoDB specific code
        mongoDb.saveToMongo(user);
    }
}
public class DIPViolated {
    public static void main(String[] args) {
        UserService service = new UserService();
        service.storeUserToSQL("Priya");
        service.storeUserToMongo("Prajwal");
    }
}
