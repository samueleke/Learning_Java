import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Player samuel = new Player("Samuel",100,100);
        System.out.println(samuel.toString());
        saveObjects(samuel);


    }

    public static List<String> readValues(){
        List<String> values = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        boolean quit = false;
        int index = 0;

        System.out.println("Chose\n" +
                "1 to enter a string\n" +
                "0 to quit");

        while (!quit){
            System.out.println("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0 -> {
                    quit = true;
                }
                case 1 -> {
                    System.out.println("Enter your choice: ");
                    String input = scanner.nextLine();
                    values.add(index, input);
                    index ++;
                }
            }
        }
        return values;
    }

    public static void saveObjects(ISaveable objectsToSave){
        int i = 0;
        for(; i < objectsToSave.write().size(); i++){
            //System.out.println("i = " + i);

            System.out.println("Saving " + objectsToSave.write().get(i) + " to storage.");

        }
        //System.out.println("i = " + i);
    }

    public static void loadObject(ISaveable objectToLoad) {
        List<String> values = readValues();
        objectToLoad.read(values);
    }
}
