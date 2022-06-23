package dao;

import entity.item;

import java.sql.SQLException;

class DataAccessCodeTest {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        new DataAccessCodeTest().saveItem();
    }

    void saveItem() throws SQLException, ClassNotFoundException {
        item i = new item("I002", "Suger", 240.00, 14);
        boolean isSaved = new DataAccessCode().saveItem(i);
        System.out.println(isSaved);
    }

    void updateItem() {
    }
}