package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.util.Util;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class UserServiceImpl implements UserService {
    UserDaoJDBCImpl usDJ = new UserDaoJDBCImpl();
    public UserServiceImpl() {
    }

    public void createUsersTable() {
        usDJ.createUsersTable();
    }

    public void dropUsersTable() {
        usDJ.dropUsersTable();
    }

    public void saveUser(String name, String lastName, byte age) {
        usDJ.saveUser(name, lastName, age);
    }

    public void removeUserById(long id) {
        usDJ.removeUserById(id);
    }

    public List<User> getAllUsers() {
//        System.out.println(usDJ.getAllUsers());
        return usDJ.getAllUsers();
    }

    public void cleanUsersTable() {
        usDJ.cleanUsersTable();
    }
}
