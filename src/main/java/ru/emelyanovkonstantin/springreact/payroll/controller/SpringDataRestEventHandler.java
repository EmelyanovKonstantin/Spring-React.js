package ru.emelyanovkonstantin.springreact.payroll.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.core.annotation.HandleBeforeCreate;
import org.springframework.data.rest.core.annotation.HandleBeforeSave;
import org.springframework.data.rest.core.annotation.RepositoryEventHandler;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import ru.emelyanovkonstantin.springreact.payroll.dao.ManagerRepository;
import ru.emelyanovkonstantin.springreact.payroll.model.Employee;
import ru.emelyanovkonstantin.springreact.payroll.model.Manager;

/**
 * Controller for {@link Manager}
 *
 * @version 1.0
 */
@Component
@RepositoryEventHandler(Employee.class)
public class SpringDataRestEventHandler {

    private final ManagerRepository managerRepository;

    @Autowired
    public SpringDataRestEventHandler(ManagerRepository managerRepository) {
        this.managerRepository = managerRepository;
    }

    @HandleBeforeCreate
    @HandleBeforeSave
    public void applyUserInformationUsingSecurityContext(Employee employee) {

        String name = SecurityContextHolder.getContext().getAuthentication().getName();
        Manager manager = this.managerRepository.findByName(name);
        if (manager == null) {
            Manager newManager = new Manager();
            newManager.setName(name);
            newManager.setRoles(new String("ROLE_MANAGER"));
            manager = this.managerRepository.save(newManager);
        }
        employee.setManager(manager);
    }
}