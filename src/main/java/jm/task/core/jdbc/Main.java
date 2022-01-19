package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {

    public static void main(String[] args) {
        UserServiceImpl UserService = new UserServiceImpl();
        UserService.createUsersTable();
        UserService.saveUser("Erich", "Gamma", (byte) 33);
        UserService.saveUser("Richard", "Helm", (byte) 35);
        UserService.saveUser("Ralph", "Johnson", (byte) 39);
        UserService.saveUser("John", "Vlissides", (byte) 33);
        UserService.getAllUsers();
        UserService.cleanUsersTable();
        UserService.dropUsersTable();
    }
}
