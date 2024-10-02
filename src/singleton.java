class Logger {
    private static Logger instance;

    private Logger() {}

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message) {
        System.out.println("log: " + message);
    }
}
public class singleton {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        logger1.log("first message");

        Logger logger2 = Logger.getInstance();
        logger2.log("second message");

        System.out.println(logger1 == logger2);
    }
}
