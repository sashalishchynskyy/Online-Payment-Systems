package utils;

import org.apache.log4j.Logger;

import java.util.Scanner;

public class ScannerTool {

    private static Scanner scanner;
    private static final Logger log = Logger.getLogger(ScannerTool.class);

    private static Scanner getScanner() {
        if (scanner == null) {
            scanner = new Scanner(System.in);
        }
        return scanner;
    }

    public static String getString() {
        return getScanner().nextLine();
    }

    public static int getInteger() {
        String string;
        while (true) {
            string = getScanner().nextLine();
            if (string.matches("\\d+")) {
                log.info("User input right data!");
                return Integer.parseInt(string);
            }
            System.out.println("Wrong input!");
            log.warn("User input wrong data!");
        }
    }
}

