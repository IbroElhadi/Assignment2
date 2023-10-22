import java.util.ArrayList;
import java.util.List;

public class Competition {
    static List<String[]> compettitors = new ArrayList<>(); // list which stores all competitors in array

    static void database(String name, double result) { // entry method with constructor
        String[] compettitor = { name, String.valueOf(result) }; // screating string array that holds result
        compettitors.add(compettitor);// add the compettitor to list
    }
}