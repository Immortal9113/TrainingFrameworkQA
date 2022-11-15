package db.sql.test.mykhaliuk.testSelect;

import db.sql.test.mykhaliuk.DBInit;
import lombok.SneakyThrows;
import org.testng.annotations.Test;

import java.sql.ResultSet;

public class TestSelectAllFromProduct extends DBInit {

    @SneakyThrows
    @Test
    public void selectFromProduct() {
        ResultSet resultSet = statement.executeQuery("SELECT * FROM product");
        while (resultSet.next()){

            int ProductId = resultSet.getInt(1);
            String ProductName = resultSet.getString(2);
            int Price = resultSet.getInt(3);
            int Number = resultSet.getInt(4);
            String City = resultSet.getString(5);

            System.out.printf("%d. %s - %d, %d, - '%s' \n", ProductId, ProductName, Price, Number, City);
        }
    }
}
