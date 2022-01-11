/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.model;

import javax.swing.JOptionPane;
import org.bson.Document;

/**
 *
 * @author andresmaldonado
 */
public abstract class Employee {
    
    private String name;
    private String Last_Name;
    private String id;
    
    private int hours_worked;
    private int hourly_pay;
    
    public Employee(){
        
        this.name = name;
        this.Last_Name = Last_Name;
        this.id = id;
        this.hours_worked = hours_worked;
        this.hourly_pay = hourly_pay;
    }

    public String getName() {
        return name;
    }

    public String getLast_Name() {
        return Last_Name;
    }

    public String getId() {
        return id;
    }

    public int getHours_worked() {
        return hours_worked;
    }

    public int getHourly_pay() {
        return hourly_pay;
    }

    
    
    public abstract double gross_salary ();
    public abstract int overtime ();
    public abstract double net_salary ();
    public abstract String print ();

    public void setName(String name) {
        this.name = name;
    }

    public void setLast_Name(String Last_Name) {
        this.Last_Name = Last_Name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setHours_worked(int hours_worked) {
        this.hours_worked = hours_worked;
    }

    public void setHourly_pay(int hourly_pay) {
        this.hourly_pay = hourly_pay;
    }
} 

    /*String sex;
        if(txtMasculine.isSelected()){
                sex = "Masculine";
            }else if (txtFeminine.isSelected()){
                sex = "Femenine";
            } else if(txtOthers.isSelected()){
                sex = "Other";
            } else {
                sex = "Ninguna";
            }
        try {
            Document data = new Document();
            
            data.put("id", Integer.parseInt(txtId.getText()));
            data.put("name", txtName.getText());
            data.put("hobby", txtHobby.getSelectedItem().toString());
            data.put("cellphone", txtCellPhone.getText());
            data.put("sex", txtMasculine.getUIClassID());
            data.put("group", txtGroup.getSelectedItem().toString());
            data.put("salary", Float.parseFloat(txtSalary.getText()));
            data.put("birthdate", txtBirthdate.getDate().toString());
            data.put("comments", txtComments.getText());

            Contact.insertOne(data);
            
            JOptionPane.showMessageDialog(this, "EXITO");
           
        } catch(Exception err){
            JOptionPane.showMessageDialog(this, "ERROR: "+err.getMessage());
        }
        
*/
