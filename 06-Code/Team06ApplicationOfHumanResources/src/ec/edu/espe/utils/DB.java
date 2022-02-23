package ec.edu.espe.utils;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author Team06
 */
public class DB {
    

<<<<<<< HEAD:06-Code/Team06ApplicationOfHumanResources/src/ec/edu/espe/utils/DB.java
ConnectionString connectionString = new ConnectionString("mongodb+srv://TheTue:Thetrue_18@cluster0.tanum.mongodb.net/myFirstDatabase?retryWrites=true&w=majority");
=======
<<<<<<< HEAD
ConnectionString connectionString = new ConnectionString("mongodb+srv://ramaisincho1:ramaisincho1@clusteroop.hjw4g.mongodb.net/myFirstDatabase?retryWrites=true&w=majority");
=======
ConnectionString connectionString = new ConnectionString("mongodb+srv://cmteca:1750288969@cluster0.bl97r.mongodb.net/myFirstDatabase?retryWrites=true&w=majority");
>>>>>>> f431856a6096b509bedfc8e5f8473aff44f05790
>>>>>>> c425969d13352018992ffdc32e131a3c5cc79822:06-Code/Team06ApplicationOfHumanResources/src/ec/edu/espe/model/DB.java
MongoClientSettings settings = MongoClientSettings.builder()
        .applyConnectionString(connectionString)
        .build();
MongoClient mongoClient = MongoClients.create(settings);
MongoDatabase database = mongoClient.getDatabase("Project");

    
    public MongoDatabase obtenerDB(){
        return database;
    }
}