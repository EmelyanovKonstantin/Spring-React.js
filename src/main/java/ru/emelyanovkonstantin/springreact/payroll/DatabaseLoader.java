package ru.emelyanovkonstantin.springreact.payroll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import ru.emelyanovkonstantin.springreact.payroll.dao.EmployeeRepository;
import ru.emelyanovkonstantin.springreact.payroll.model.Employee;

@Component
public class DatabaseLoader implements CommandLineRunner {

    private final EmployeeRepository repository;

    @Autowired
    public DatabaseLoader(EmployeeRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... strings) throws Exception {
        //for(int i = 0; i < 100; i++)
        this.repository.save(new Employee("Ivanov", "Ivan", "manager"));
    }
}