package db.sql.test.mykhaliuk.tablesData.testsData;

import db.sql.test.mykhaliuk.DBInit;
import db.sql.test.mykhaliuk.tablesData.DataInfo;
import lombok.SneakyThrows;
import org.testng.annotations.Test;

public class TestUpdateDataOnTable extends DBInit {

    @SneakyThrows
    @Test
    public void updateProductDataString(){
       String resultString = String.valueOf((statement.executeUpdate("UPDATE Product SET StoreAddress = 'str.Cranch' WHERE ProductId = 6")));

       System.out.printf("UPDATE %s resultString", resultString);
    }

    @SneakyThrows
    @Test
    public void updateProductDataInt(){
        int resultInt = (statement.executeUpdate("UPDATE Product " +
                "SET Number = 31, Number = 70 " +
                "WHERE ProductId = 2"));

        System.out.printf("UPDATE %d resultInt", resultInt);
    }

    @Test
    @SneakyThrows
    public void updateCity() {
        DataInfo dataInfo = new DataInfo();
        dataInfo.setCity("LOST", "Lviv");
    }

    public void updatePrice(){

    }
}
