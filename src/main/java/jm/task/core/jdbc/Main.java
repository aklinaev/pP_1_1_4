package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserServiceImpl us = new UserServiceImpl();
        us.createUsersTable();
        us.saveUser("arletta", "penrose", (byte) 30);
        us.saveUser("liza", "besporiadok", (byte) 9);
        us.saveUser("liza", "vporiadke", (byte) 15);
        us.saveUser("liza", "pipiska", (byte) 17);
        List<User> select = us.getAllUsers();
        select.stream().forEach(System.out::println);
        us.cleanUsersTable();
        us.dropUsersTable();
    }
}
