package wk15;

import wk12.TextFile;

import java.io.IOException;
import java.util.logging.*;

public class LogExample {
    public static void main(String[] args) {
        String loggerName = "ExampleLogger";
        configureLogger(loggerName, "log.txt", "XML");
        Logger log = Logger.getLogger(loggerName);
        log.severe("severe");
        log.warning("warning");
        log.info("info");
        log.config("config");
        log.fine("fine");
        log.finer("finer");
        log.finest("finest");
        TextFile tf = new TextFile("funny.txt");
        tf.open();
    }

    private static boolean configureLogger(String name, String filename, String format) {
        Logger logger = Logger.getLogger(name);
        try {
            FileHandler handler = new FileHandler(filename, true);
            logger.addHandler(handler);
            switch (format == null ? "" : format) {
                case "XML" -> handler.setFormatter(new XMLFormatter());
                default -> handler.setFormatter(new SimpleFormatter());
            }
            logger.setUseParentHandlers(false);
            logger.info("Log file initialized");
        } catch (IOException e) {
            System.err.println("Warning: error initializing log file. Logging disabled.");
            logger = null;
        }
        return logger != null;
    }
}
