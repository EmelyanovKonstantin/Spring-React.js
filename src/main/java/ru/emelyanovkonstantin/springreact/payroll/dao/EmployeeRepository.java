package ru.emelyanovkonstantin.springreact.payroll.dao;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import ru.emelyanovkonstantin.springreact.payroll.model.Employee;

/**
 * EmployeeRepository
 */
@Repository
public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Long> {

}
