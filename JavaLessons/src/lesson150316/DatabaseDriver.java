package lesson150316;

public class DatabaseDriver {

    public static void main(String[] args) {

        DatabaseConnection connection = DatabaseConnection.create();
        DatabaseConnection connection2 = DatabaseConnection.create();
        DatabaseConnection connection3 = DatabaseConnection.create();
        DatabaseConnection connection4 = DatabaseConnection.create();

        if (connection4 == null) {
            // connection.free(); //I var (non static free)
            DatabaseConnection.free_any(); // II var (static free)

        }

        System.out.println(connection);
        System.out.println(connection2);
        System.out.println(connection3);
        System.out.println(connection4);

    }
}
