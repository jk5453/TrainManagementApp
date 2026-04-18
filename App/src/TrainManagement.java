import java.util.ArrayList;
import java.util.List;

public class TrainManagement {

    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }
    }

    public static void main(String[] args) {

        System.out.println("=== UC10: Count Total Seats in Train ===");

        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("Sleeper", 70));

        System.out.println("Bogies in Train:");
        for (Bogie b : bogies) {
            System.out.println(b.name + " -> " + b.capacity);
        }

        int totalSeats = bogies.stream()
                .map(b -> b.capacity)
                .reduce(0, (a, b) -> a + b);

        System.out.println("Total Seating Capacity of Train: " + totalSeats);
        System.out.println("UC10 aggregation completed...");
    }
}