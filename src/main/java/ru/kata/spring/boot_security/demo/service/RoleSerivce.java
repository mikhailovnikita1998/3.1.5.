package ru.kata.spring.boot_security.demo.service;

import ru.kata.spring.boot_security.demo.model.Role;

import java.util.List;
import java.util.Set;

public interface RoleSerivce {

    void addRole(Role role);

    List<Role> findAll();

    Set<Role> findByRoleNameIn(List<String> roles);

    Role getByName(String name);

}
