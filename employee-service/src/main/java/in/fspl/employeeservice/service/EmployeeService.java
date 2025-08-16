package in.fspl.employeeservice.service;

import java.util.List;

import in.fspl.employeeservice.model.Employee;

public interface EmployeeService {
	
	
    Employee saveEmployee(Employee employee);
    
    
    List<Employee> getAllEmployees();
    
    
    Employee getEmployeeById(Long id);
    
    
    void deleteEmployee(Long id);
    
    
    Employee updateEmployee(Long id, Employee employee);
    
    
}
