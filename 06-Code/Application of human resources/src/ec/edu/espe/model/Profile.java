package ec.edu.espe.model;

<<<<<<< HEAD
import java.util.ArrayList;

public abstract class Profile {
=======

public class Profile extends Company{

    /**
     *
     * @param name
     * @param id
     * @param areawork
     * @param password
     * @param hoursOfAttention
     * @param moneyEarned
     * @param location
     * @param Id
     * @param gender
     * @param age
     */
    public Profile(String name, int id, String areawork, int password, int hoursOfAttention, int moneyEarned, String location, String Id, String gender, int age) {
        super(hoursOfAttention, moneyEarned, location, name, Id, gender, age);
        this.name = name;
        this.id = id;
        this.areawork = areawork;
        this.password = password;
    }
    
>>>>>>> bc6d4439e0353351b083414cc1f87d0c0cd2e962

    private String name;
    private int id;
    private String areawork;
    private int password;
    private ArrayList<Profile> profile;
    
    public static void main(String[] args) {
        Profile profile1 = new Profile("",0,"",0){};
    }
    
    @Override
    public String toString() {
        return "Profile{" + "name=" + name + ", id=" + id + ", areawork=" + areawork + ", password=" + password + '}';
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getAreawork() {
        return areawork;
    }

    public int getPassword() {
        return password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAreawork(String areawork) {
        this.areawork = areawork;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public Profile(String name, int id, String areawork, int password) {
        this.name = name;
        this.id = id;
        this.areawork = areawork;
        this.password = password;
    }
    
public void profile () {
        
    }
    
}