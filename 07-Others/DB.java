package ec.edu.espe.model;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author LM
 */
public class DB {
    
public DB db;

ConnectionString connectionString = new ConnectionString("mongodb+srv://dspalacios:dspalacios@cluster0.8plsi.mongodb.net/myFirstDatabase?retryWrites=true&w=majority");
MongoClientSettings settings = MongoClientSettings.builder()
        .applyConnectionString(connectionString)
        .build();
MongoClient mongoClient = MongoClients.create(settings);
MongoDatabase database = mongoClient.getDatabase("Project");

    
    public MongoDatabase obtenerDB(){
        return database;
    }
}