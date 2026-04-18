import java.util.Arrays;

public class TrainManagement {

    public static void main(String[] args) {

        System.out.println("=== UC17: Sort Bogie Names Using Arrays.sort() ===");

        String[] bogieNames = {"Sleeper", "AC Chair", "First Class", "General", "Luxury"};

        System.out.println("Original Bogie Names:");
        System.out.println(Arrays.toString(bogieNames));

        Arrays.sort(bogieNames);

        System.out.println("Sorted Bogie Names:");
        System.out.println(Arrays.toString(bogieNames));

        System.out.println("UC17 sorting completed...");
    }
}