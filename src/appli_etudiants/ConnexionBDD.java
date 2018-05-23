/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appli_etudiants;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author g.parra
 */
public class ConnexionBDD {

    private static String connetionURL = "jdbc:mysql://127.0.0.1:3333/gsbperso?user=applietudiants&password=sio";
    private static Connection connect;

    public static Connection getInstance() {
        if (connect == null) {
            try {
                connect = (Connection) DriverManager.getConnection(connetionURL);

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return connect;
    }
}
