public class App {
    public static void main() {
        
    }

    public static String returnString(int i) {
        if (i % 3 == 0 && i % 5 == 0) {
            return "ITClinical";
        } else if (i % 3 == 0) {
            return "IT";
        } else if (i % 5 == 0) {
            return "Clinical";
        }
        else {
            return String.valueOf(i);
        }
    }

}
