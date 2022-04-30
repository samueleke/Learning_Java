import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        char letters = 'A';
        switch (letters) {
            case 'A':
                System.out.println("It was A");
                break;
            case 'B':
                System.out.println("It was B");
                break;
            case 'C':
                System.out.println("It was C");
                break;
            case 'D':
                System.out.println("It was D");
                break;
            default:
                System.out.println("Not found");
                break;
        }

        String month = "january";
        switch (month.toLowerCase()){
            case "january":
                System.out.println("January");
                break;
            case "june":
                System.out.println("June");
                break;
            default:
                System.out.println("Not sure");
        }

    }
}
