package com.projects;

import java.io.FileWriter;
import java.io.IOException;

public interface Persistence {
    void save(String data);
}

//FileStorage implementation
class FileStorage implements Persistence {
    @Override
    public void save(String data) {
        try{
            FileWriter outFile = new FileWriter("documnet.txt");
            outFile.write(data);
            outFile.close();
            System.out.println("Document Saved Successfully!");
        } catch (IOException ex) {
            System.out.println("Error: Unable to open file for writing!");
        }
    }
}

//Place holder for DB Storage
class DBStorage implements Persistence {
    @Override
    public void save(String data) {
        System.out.println("Save Data into DB!");
    }
}
