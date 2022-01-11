/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.model;

import com.mongodb.client.result.UpdateResult;
import javax.swing.JOptionPane;
import org.bson.Document;

/**
 *
 * @author andresmaldonado
 */
public class Payment {
    
}

    /*dataUpload.put("id", Integer.parseInt(txtId.getText()));
            dataUpload.put("name", txtName.getText());
            dataUpload.put("hobby", txtHobby.getSelectedItem().toString());
            dataUpload.put("cellphone", txtCellPhone.getText());
            dataUpload.put("sex", txtMasculine.getUIClassID());
            dataUpload.put("group", txtGroup.getSelectedItem().toString());
            dataUpload.put("salary", Float.parseFloat(txtSalary.getText()));
            dataUpload.put("birthdate", txtBirthdate.getDate().toString());
            dataUpload.put("comments", txtComments.getText());
        
        UpdateResult answer = Contact.updateOne(filter, new Document("$set",dataUpload));
        if(answer.getMatchedCount()==1){
            JOptionPane.showMessageDialog(this, "Success got Updated");
        } else {
            JOptionPane.showMessageDialog(this, "Error Could not Update");
}}}