package electricitybillingsystem;

import java.sql.*;

public class Conn {
    
    Connection c;
    Statement s;
    Conn() {
        try {
            c = DriverManager.getConnection("jdbc:mysql:///ebs", "root", "Harish@150799");
            s = c.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
