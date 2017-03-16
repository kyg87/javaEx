
public class ClearScreen {
    static {
        System.loadLibrary("Clear");
    }
    
    public native static void clearScreen();

    public static void main(String[] args) {
        clearScreen();
    }
}
