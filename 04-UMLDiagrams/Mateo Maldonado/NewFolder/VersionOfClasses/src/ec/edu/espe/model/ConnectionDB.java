/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.model;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author andresmaldonado
 */
public class ConnectionDB {
    
    public class Connection {
    
        ConnectionString connectionString = new ConnectionString("mongodb+srv://msmaldonado3:sancayo12@clusteroop.x3i1d.mongodb.net/myFirstDatabase?retryWrites=true&w=majority");
        MongoClientSettings settings = MongoClientSettings.builder()
         .applyConnectionString(connectionString)
          .build();
        MongoClient mongoClient = MongoClients.create(settings);
        MongoDatabase database = mongoClient.getDatabase("Project");

    
    
    public MongoDatabase obtenerDB(){
        return database;
    }

}

    /*dataUpload.put("id", Integer.parseInt(txtId.getText()));
    dataUpload.put("name", txtName.getText());
    dataUpload.put("hobby", txtHobby.getSelectedItem().toString());
    dataUpload.put("cellphone", txtCellPhone.getText());
    dataUpload.put("sex", txtMasculine.getUIClassID());
    dataUpload.put("group", txtGroup.getSelectedItem().toString());
    dataUpload.put("salary", Float.parseFloat(txtSalary.getText()));
    dataUpload.put("birthdate", txtBirthdate.getDate().toString());
    dataUpload.put("comments", txtComments.getText());*/
    
}
