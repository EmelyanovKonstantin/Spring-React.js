package ru.emelyanovkonstantin.springreact.payroll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import ru.emelyanovkonstantin.springreact.payroll.dao.EmployeeRepository;
import ru.emelyanovkonstantin.springreact.payroll.dao.ManagerRepository;
import ru.emelyanovkonstantin.springreact.payroll.model.Employee;
import ru.emelyanovkonstantin.springreact.payroll.model.Manager;

@Component
public class DatabaseLoader implements CommandLineRunner {

    private final EmployeeRepository employees;
    private final ManagerRepository managers;

    @Autowired
    public DatabaseLoader(EmployeeRepository employeeRepository,
                          ManagerRepository managerRepository) {

        this.employees = employeeRepository;
        this.managers = managerRepository;
    }

    @Override
    public void run(String... strings) throws Exception {
/*
        Manager sergey = this.managers.save(new Manager("Sergey", "jktyu*2",
                "ROLE_MANAGER"));
        Manager vitaliy = this.managers.save(new Manager("Vitaly", "roeyOd",
                "ROLE_MANAGER"));

        SecurityContextHolder.getContext().setAuthentication(
                new UsernamePasswordAuthenticationToken("Sergey", "doesn't matter",
                        AuthorityUtils.createAuthorityList("ROLE_MANAGER")));

        this.employees.save(new Employee("Mary", "Vice", "worker", sergey));
        this.employees.save(new Employee("Darya", "Volkova", "tax", sergey));
        this.employees.save(new Employee("Fedor", "Ignatiev", "security", sergey));

        SecurityContextHolder.getContext().setAuthentication(
                new UsernamePasswordAuthenticationToken("Vitaly", "doesn't matter",
                        AuthorityUtils.createAuthorityList("ROLE_MANAGER")));

        this.employees.save(new Employee("Fedor", "Demidov", "driver", vitaliy));
        this.employees.save(new Employee("Anna", "Grach", "tax", vitaliy));
        this.employees.save(new Employee("Andrey", "Volkov", "security", vitaliy));

        SecurityContextHolder.clearContext();
 */
    }
}