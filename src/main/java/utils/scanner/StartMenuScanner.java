package utils.scanner;

public class StartMenuScanner extends ScannerTool{
    public static int getStartMenuOption() {
        while(true){
            int n = getInteger();
            if(n <= 3 && n > 0) return n;
            else System.out.println("Wrong input!");
        }
    }
}
