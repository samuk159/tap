package solid.dip.antes;

public class PasswordReminder {

    private MySQLConnection connection;

    public PasswordReminder(MySQLConnection connection) {
        this.connection = connection;
    }
    
    public PasswordReminder() {
        this.connection = new MySQLConnection();
    }
    
}
