package singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 *
 * @author Michael Brown (Michael.Brown@consensuscorp.com)
 * @since 11/21/17.
 * <p>
 * All rights reserved. (C) Consensus Corporation
 */
public class DbSingleton {

    private static DbSingleton instance =  null;

    private Connection conn = null;

    private DbSingleton() {
        try {
            DriverManager.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static DbSingleton getInstance() {
        if(null == instance) {
            synchronized(DbSingleton.class) { //this will only make it synchronized for the first access.
                if (null == instance) {
                    instance = new DbSingleton();
                }
            }
        }
        return instance;
    }

//    public Connection getConnection() {
//        if(null == conn) {
//            synchronized (DbSingleton.class) {
//                if( null == conn) {
//                    try {
//                        String dbUrl = "jdbc:derby://memory:codejava/webdb;create-true";
//                        conn = DriverManager.getConnection(dbUrl);
//                    } catch (SQLException e) {
//                        e.printStackTrace();
//                    }
//                }
//            }
//        }
//        return conn;
//    }
}
