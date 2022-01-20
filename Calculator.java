public class Calculator {

    static {
        try {
            Runtime.getRuntime().exec("gnome-calculator").waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}