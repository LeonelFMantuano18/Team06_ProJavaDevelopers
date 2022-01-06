
package ec.edu.espe.model;


public class Worker {
    
    public Worker(String name, String Id, String gender, int age){
        
        this.name=name;
        
        this.Id=Id;
        
        this.gender=gender;
        
        this.age=age;
    }

    @Override
    public String toString() {
        return "Worker{" + "name=" + name + ", Id=" + Id + ", gender=" + gender + ", age=" + age + '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return Id;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }
    
    String name;
    String Id;
    String gender;
    int age;
    
    }  

