package solid.dip.antes;

public class PasswordReminder {

    private MySQLConnection connection;

    public PasswordReminder() {
        this.connection = new MySQLConnection();
    }
    
    public PasswordReminder(MySQLConnection connection) {
        this.connection = connection;
    }
    
}
