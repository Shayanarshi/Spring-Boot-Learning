package in.ashokit.app.runner;

import in.ashokit.app.model.Employee;
import in.ashokit.app.repository.EmployeeRepository;
import jakarta.persistence.Column;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class MyAppRunner implements ApplicationRunner {

    @Autowired
    EmployeeRepository repository;


    @Override
    public void run(ApplicationArguments args) throws Exception {

        saveEmployee();
//        updateEmployee();

    }
    private  void saveEmployee(){
        Employee employee = new Employee();
        employee.setId(7101L);
        employee.setName("John");
        employee.setSal(7000.0);
        employee.setDepartment("Accounting");
        repository.save(employee);
    }
}
