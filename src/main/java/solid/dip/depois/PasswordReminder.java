package solid.dip.depois;

public class PasswordReminder {

    private DBConnectionInterface connection;

    public PasswordReminder(DBConnectionInterface connection) {
        this.connection = connection;
    }
    
}
