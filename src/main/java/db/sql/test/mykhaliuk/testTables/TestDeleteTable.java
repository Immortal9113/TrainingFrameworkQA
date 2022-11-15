package db.sql.test.mykhaliuk.testTables;

import db.sql.test.mykhaliuk.DBInit;
import lombok.SneakyThrows;
import org.testng.annotations.Test;

public class TestDeleteTable extends DBInit {

    @SneakyThrows
    @Test
    public void dropTable(){
        statement.executeUpdate("drop table product");
    }
}
