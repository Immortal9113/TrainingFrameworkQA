package db.sql.test.mykhaliuk.tablesData;

import db.sql.test.mykhaliuk.DBInit;
import lombok.SneakyThrows;


public class DataInfo extends DBInit {

    @SneakyThrows
    public String setCity(String currentCity, String newcity){
        String.valueOf((statement
                .executeUpdate("UPDATE Product" + " SET City = " + currentCity + ", City = " + newcity + " WHERE ProductId = 1")));

        return String.valueOf(this);
    }

    @SneakyThrows
    public String setPrice(String currentPrice, String newPrice){
        String.valueOf(statement
                .executeUpdate("UPDATE Product" + " SET Price = " + currentPrice + ", Price = " + newPrice + " WHERE ProductId = 3"));

        return (String.valueOf(this));
    }
}
