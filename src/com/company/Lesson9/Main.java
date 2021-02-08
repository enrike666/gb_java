package com.company.Lesson9;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static Connection connection;
    private static Statement statement;
    private static PreparedStatement ps;
    private static String createTable = "CREATE TABLE if not exists Cats(CatID INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, Name TEXT NOT NULL, Gender TEXT NOT NULL, Weight INTEGER NOT NULL);";
    private static String insertCat = "insert into Cats(Name, Gender, Weight) values (?, ?, ?)";
    private static String updateCat = "UPDATE Cats SET Weight = ? WHERE CatID = ?";
    private static String deleteCat = "DELETE FROM Cats WHERE CatID = ?";

    public static void main(String[] args) throws SQLException {
        connect();
        statement = connection.createStatement();
        statement.execute(createTable);

        List<Cat> catsList = getAllCats();
        updateWeight(catsList.get(0), 2);


        for (int i = 0; i < catsList.size(); i++){
            catsList.get(i).print();
            System.out.println();
        }

        close();
    }

    private static void connect() {
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:lesson.db");
        } catch (ClassNotFoundException e) {
            System.out.println("Напиши нормально имя класса!!!!");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    private static void close() throws SQLException {
        connection.close();
    }

    private static void insertCatsTable(Cat cat) throws SQLException {
        ps = connection.prepareStatement(insertCat);
        ps.setString(1,cat.name);
        ps.setString(2,cat.gender);
        ps.setInt(3,cat.weight);
        ps.executeUpdate();
    }

    private static List<Cat> getAllCats() throws SQLException {
        List<Cat> cats = new ArrayList<Cat>();

        ResultSet rs = statement.executeQuery("select * from Cats");
        while (rs.next()) {
            Cat cat = new Cat(
                    rs.getString(2),
                    rs.getString(3),
                    rs.getInt(4)
            );
            cat.ID = rs.getInt(1);
            cats.add(cat);
        }

        return cats;
    }

    private static void updateWeight(Cat cat, int newWeight) throws SQLException {
        ps = connection.prepareStatement(updateCat);
        ps.setInt(1,newWeight);
        ps.setInt(2, cat.ID);
        ps.executeUpdate();
    }

    private static void deleteCat(int catID) throws SQLException {
        ps = connection.prepareStatement(deleteCat);
        ps.setInt(1,catID);
        ps.executeUpdate();
    }
}
