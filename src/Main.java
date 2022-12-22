import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {

        Menu menu = new Menu();
        Portata portata = new Portata();

        menu.createTable();
        portata.createPortata();

        portata.alterTableMenuId();
    }
}
