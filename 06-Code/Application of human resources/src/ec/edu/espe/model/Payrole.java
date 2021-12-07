package ec.edu.espe.model;

public class Payrole {

    private int salary;
    private int debts;

    public Payrole(int salary, int debts) {
        this.salary = salary;
        this.debts = debts;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setDebts(int debts) {
        this.debts = debts;
    }

    public int getSalary() {
        return salary;
    }

    public int getDebts() {
        return debts;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Payrole{salary=").append(salary);
        sb.append(", debts=").append(debts);
        sb.append('}');
        return sb.toString();
    }
    
public void payrole() {
       
    }
    
}
