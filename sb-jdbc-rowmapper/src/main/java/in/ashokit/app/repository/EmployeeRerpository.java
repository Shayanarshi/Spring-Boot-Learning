package in.ashokit.app.repository;

import in.ashokit.app.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeRerpository  {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Employee> fetchEmployees(){
       RowMapper<Employee> mapper =(rs,index)->{
                                        Employee e = new Employee();
                                        e.setEmpno(rs.getInt("EMPNO"));
                                        e.setEname(rs.getString("ENAME"));
                                        e.setSal(rs.getDouble("SAL"));
                                        e.setDepartment(rs.getString("DEPARTMENT"));
                                        return  e ;
                                         };

       String sql = "SELECT * FROM EMP";
       return jdbcTemplate.query(sql,mapper);
    }
}
