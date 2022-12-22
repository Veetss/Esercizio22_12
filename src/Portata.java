import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Portata {

    private final String db_url = "jdbc:mysql://localhost:3306/newdb";
    private final String user = "developer";
    private final String password = "Password!";

    public void createPortata() throws SQLException {
        Connection con =  DriverManager.getConnection(db_url, user, password);
        Statement statement = con.createStatement();

        String queryPortata = ""
                + "CREATE TABLE IF NOT EXISTS `portata` ( "
                + "  `portata_id` int NOT NULL AUTO_INCREMENT, "
                + "  `name` varchar(30) DEFAULT NULL, "
                + "  `price` int DEFAULT NULL, "
                + "  PRIMARY KEY (`portata_id`) "
                + ")";

        statement.executeUpdate(queryPortata);

        con.close();
    }

    public void alterTableMenuId() throws SQLException {
        Connection con =  DriverManager.getConnection(db_url, user, password);
        Statement statement = con.createStatement();

        String alterTableQuery = ""
                + "ALTER TABLE newdb.portata ADD menu_id INT NULL;";


        String varname11 = ""
                + "ALTER TABLE newdb.portata ADD CONSTRAINT portata_FK FOREIGN KEY (menu_id) REFERENCES newdb.menu(menu_id);";

        statement.executeUpdate(alterTableQuery);
        statement.executeUpdate(varname11);

        con.close();
    }
}
