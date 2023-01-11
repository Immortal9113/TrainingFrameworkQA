package db.sql.test.mykhaliuk.testTables;

import db.sql.test.mykhaliuk.DBInit;
import lombok.SneakyThrows;
import org.testng.annotations.Test;

public class TestCreateTab extends DBInit {

    @Test
    @Override
    @SneakyThrows
    public void setup() {
        super.setup();

        statement.executeUpdate("CREATE TABLE Product (" +
                "ProductId INT PRIMARY KEY AUTO_INCREMENT, " +
                "ProductName VARCHAR(20), " +
                "Price INT, " +
                "Number INT, " +
                "City VARCHAR (10))");
    }
}
