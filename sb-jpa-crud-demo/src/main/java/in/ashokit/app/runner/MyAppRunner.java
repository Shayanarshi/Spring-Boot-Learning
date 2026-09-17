package in.ashokit.app.runner;

import in.ashokit.app.model.Employee;
import in.ashokit.app.repository.EmployeeRepository;
import jakarta.persistence.Column;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class MyAppRunner implements ApplicationRunner {

    @Autowired
    EmployeeRepository repository;


    @Override
    public void run(ApplicationArguments args) throws Exception {
//        saveEmployee();
//         updateEmployee();

      /*  Employee e = fetchEmployeeById(7788L);
        if(e !=null){
            System.out.println("empno : " +e.getId());
            System.out.println("Name  : " +e.getName());
            System.out.println("Sal   : " +e.getSal());
            System.out.println("Dept  : " +e.getDepartment());
        }*/

        deleteEmployee(7201L);

    }
    private  void deleteEmployee(Long id){
        repository.deleteById(id);
    }

    private  void saveEmployee(){
        Employee employee = new Employee();
        employee.setId(7943L);
        employee.setName("EMMA");
        employee.setSal(7000.0);
        employee.setDepartment("HR");
        repository.save(employee);
    }
    private  void updateEmployee(){

        Employee employee = new Employee();
        employee.setId(7943L);
        employee.setName("MARY");
        employee.setSal(4000.0);
        employee.setDepartment("HR");
        repository.save(employee);
    }

    private Employee fetchEmployeeById(Long id){
        Optional<Employee>opt =repository.findById(id);
        return opt.orElse(null);
    }
}
