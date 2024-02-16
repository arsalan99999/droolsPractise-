package Practise;

public final class DatabaseConnection {


    //1. Static private instance
    //2. Constructor private
    //3. Public Method// Accessor
    //4. Class Final

    private static DatabaseConnection instance;
    private static String databaseURL;

    private DatabaseConnection(String databaseURL) {
        if (instance != null) {
            throw new IllegalStateException("Instance Already Created");

        }
        this.databaseURL = databaseURL;
    }

    public static DatabaseConnection getInstance() {
        if(instance==null){
            instance = new DatabaseConnection("jdbc:mysql://localhost:3306/mydatabase");
        }
        return instance;
    }

    // dummy implementation of executing a query
    public void executeQuery(String query) {
        System.out.println("Executing query on " + databaseURL + ": " + query);
    }

    // dummy implementation of closing the connection
    public void close() {
        System.out.println("Closing connection with: " + databaseURL);
    }
}
