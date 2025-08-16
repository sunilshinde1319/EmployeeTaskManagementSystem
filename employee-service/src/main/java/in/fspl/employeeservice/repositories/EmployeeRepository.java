package in.fspl.employeeservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import in.fspl.employeeservice.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
