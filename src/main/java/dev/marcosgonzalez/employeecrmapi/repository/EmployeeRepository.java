package dev.marcosgonzalez.employeecrmapi.repository;

import dev.marcosgonzalez.employeecrmapi.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, String> {

    List<Employee> findEmployeesByUserId(String userId);
}
