package OOP15;

import java.io.Serializable;

public class Employee implements Serializable { // 기말 시험문제 이거! implements Serializable 적을 수 있어야함.
    private int id;
    private String name;
    private String department;
    private  double expLevel;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public double getExpLevel() {
        return expLevel;
    }
    public void setExpLevel(double expLevel) {
        this.expLevel = expLevel;
    }
}
