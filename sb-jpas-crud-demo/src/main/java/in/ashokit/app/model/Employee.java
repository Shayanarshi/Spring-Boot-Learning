package in.ashokit.app.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="emp")
public class Employee {
    @Id
    @Column(name = "empno")
    private  Long  id;


    @Column(name = "ename")
    private  String name;

    @Column (name = "sal")
    private Double sal;

    @Column (name = "department")
    private  String department;


    // setter and getters


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSal() {
        return sal;
    }

    public void setSal(Double sal) {
        this.sal = sal;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
