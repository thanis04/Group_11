package dao;

import dataBase.DBconnection;
import entity.item;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DataAccessCode {
    public boolean saveItem(item i) throws SQLException, ClassNotFoundException {
        String sql = "INSERT INTO item VALUES (?,?,?,?)";
        PreparedStatement stm = DBconnection.getInstance().getConnection().prepareStatement(sql);
        stm.setObject(1, i.getItem_code());
        stm.setObject(2, i.getDescription());
        stm.setObject(3, i.getUnit_price());
        stm.setObject(4, i.getQty());
        return stm.executeUpdate()>0;
    }

    public boolean updateItem(item i) throws ClassNotFoundException, SQLException {
        String sql = "UPDATE item SET description=?, unit_price=?, qty=? WHERE item_code=?";
        PreparedStatement stm = DBconnection.getInstance().getConnection().prepareStatement(sql);
        stm.setObject(1, i.getItem_code());
        stm.setObject(2, i.getDescription());
        stm.setObject(3, i.getUnit_price());
        stm.setObject(4, i.getQty());
        return stm.executeUpdate()>0;
    }
}
