package in.ashokit.app.runner;

import in.ashokit.app.model.Employee;
import in.ashokit.app.repository.EmployeeRerpository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MyAppRunner implements ApplicationRunner {

    @Autowired
    EmployeeRerpository repository;
    @Override
    public void run(ApplicationArguments args) throws Exception {
           List<Employee> employeeList = repository.fetchEmployees();

           for (Employee e  : employeeList){
               System.out.println(e);
           }
    }
}
