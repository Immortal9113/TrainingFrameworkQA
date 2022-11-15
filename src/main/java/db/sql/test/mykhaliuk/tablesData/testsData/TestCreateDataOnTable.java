package db.sql.test.mykhaliuk.tablesData.testsData;

import db.sql.test.mykhaliuk.DBInit;
import lombok.SneakyThrows;
import org.testng.annotations.Test;

public class TestCreateDataOnTable extends DBInit {

    @SneakyThrows
    @Test
    public void addNewProduct() {
        statement.executeUpdate("INSERT INTO product(ProductName, Price, Number, City) VALUES ('Tomatos', 118, 107, 'Lutsk')");
    }
}
