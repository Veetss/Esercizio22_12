import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Menu {

    private final String db_url = "jdbc:mysql://localhost:3306/newdb";
    private final String user = "developer";
    private final String password = "Password!";

    public void createTable() throws SQLException {
        Connection con =  DriverManager.getConnection(db_url, user, password);
        Statement statement = con.createStatement();

        String queryTable = ""
                + "CREATE TABLE IF NOT EXISTS `menu` ( "
                + "  `menu_id` int NOT NULL AUTO_INCREMENT, "
                + "  `name` varchar(30) DEFAULT NULL, "
                + "  `tipo` varchar(30) DEFAULT NULL, "
                + "  PRIMARY KEY (`menu_id`) "
                + ")";

        statement.executeUpdate(queryTable);

        con.close();
    }
}
