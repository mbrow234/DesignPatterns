package singleton;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 *
 * @author Michael Brown (Michael.Brown@consensuscorp.com)
 * @since 11/21/17.
 * <p>
 * All rights reserved. (C) Consensus Corporation
 */
public class DbSingletonDemo {

    public static void main(String[] args) {

        long timeBefore = 0;
        long timeAfter = 0;

        DbSingleton instance =  DbSingleton.getInstance();

        System.out.println(instance);

        DbSingleton anotherInstance = DbSingleton.getInstance();

        System.out.println(anotherInstance);

//        timeBefore = System.currentTimeMillis();
//        Connection conn = instance.getConnection();
//        timeAfter = System.currentTimeMillis();
//
//        System.out.println(timeAfter - timeBefore);
//
//        Statement sta;
//        try {
//            sta = conn.createStatement();
//            int count = sta.executeUpdate("create table Address (id int, StreetName varchar(20), City varchar(20))");
//            System.out.println("Table Created.");
//            sta.close();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//        timeBefore = System.currentTimeMillis();
//        conn = instance.getConnection();
//        timeAfter = System.currentTimeMillis();
//
//        System.out.println(timeAfter - timeBefore);
    }
}
