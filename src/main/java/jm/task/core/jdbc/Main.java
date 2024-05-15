package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь

        UserService userService = new UserServiceImpl();
        UserDao userDao = new UserDaoJDBCImpl();


        userDao.createUsersTable();


        userDao.saveUser("John", "Doe", (byte) 30);
        System.out.println("User с именем – John добавлен в базу данных");
        userDao.saveUser("Jane", "Doe", (byte) 25);
        System.out.println("User с именем – Jane добавлен в базу данных");
        userDao.saveUser("Max", "Payne", (byte) 40);
        System.out.println("User с именем – Max добавлен в базу данных");
        userDao.saveUser("Lara", "Croft", (byte) 35);
        System.out.println("User с именем – Lara добавлен в базу данных");

        // Получение всех User из базы и вывод в консоль
        List<User> users = userDao.getAllUsers();
        for (User user : users) {
            System.out.println(user);
        }

        // Очистка таблицы User(ов)
        userDao.cleanUsersTable();

        // Удаление таблицы
        userDao.dropUsersTable();

    }
}
