package com.praj.solidp.DIP;


interface  Database {
    void save(String data);
}

class MySQLDatabases implements Database {
    @Override
    public void save(String data){
        System.out.println("Executing SQL query: INSERT INTO USER VALUES('" + data +"') ");
    }
}

class MongoDBDatabases implements Database {
    @Override
    public void save(String data) {
        System.out.println("Executing MongoDB function: db.users.insert ({name: '" + data+ "'}) ");
    }
}

class UserServices {
    private final Database db;

    public UserServices(Database database) {
        this.db = database;
    }
    public void storeUser(String user) {
        db.save(user);
    }
}
public class DIPFollowed {
    public static void main(String[] args) {
        MySQLDatabases mysql = new MySQLDatabases();
        MongoDBDatabases mongo = new MongoDBDatabases();

        UserServices service = new UserServices(mysql);
        service.storeUser("Prajwal");

        UserServices service1 = new UserServices(mongo);
        service.storeUser("Priya");
    }
}
