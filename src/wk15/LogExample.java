package wk15;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.logging.XMLFormatter;

public class LogExample {
    public static void main(String[] args) {
        String loggerName = "ExampleLogger";
        configureLogger(loggerName, "log.txt", null);
        Logger log = Logger.getLogger(loggerName);
        log.severe("severe");
        log.warning("warning");
        log.info("info");
        log.config("config");
        log.fine("fine");
        log.finer("finer");
        log.finest("finest");
    }

    private static boolean configureLogger(String name, String filename, String format) {
        Logger logger = Logger.getLogger(name);
        try {
            FileHandler handler = new FileHandler(filename);
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
