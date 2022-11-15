package db.sql.test.mykhaliuk.tablesData.testsData;

import db.sql.test.mykhaliuk.DBInit;
import lombok.SneakyThrows;
import org.testng.annotations.Test;

public class TestDeleteDataOnTable extends DBInit {

    @SneakyThrows
    @Test
    public void deleteData(){
       int delete = statement.executeUpdate("DELETE FROM Product WHERE ProductId = 3");
        System.out.printf("Data byId %d delete", delete);
    }
}
