package org.example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Random;

public class l3 {
    private static final String[] EVENT_TYPES = {"Login", "Logout", "Purchase", "ViewPage", "Error"};
    private static final int NUM_RECORDS = 1000000;
    public static void main(String[] args) {
        String filename = "events.txt";

        // Generate events file
        generateEventsFile(filename, NUM_RECORDS);

        // Read events from the file in 5 iterations
        readEventsFile(filename);
    }



    private static void generateEventsFile(String filename, int numRecords) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            Random random = new Random();

            for (int i = 0; i < numRecords; i++) {
                // Generate random timestamp
                long timestamp = System.currentTimeMillis() - random.nextInt(365 * 24 * 60 * 60 * 1000);

                // Randomly select event type
                String eventType = EVENT_TYPES[random.nextInt(EVENT_TYPES.length)];

                // Generate random user ID
                int userId = random.nextInt(1000);

                // Write event to the file
                writer.write(timestamp + "," + eventType + "," + userId);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }}
        private static void readEventsFile (String filename) {
            try {
                for (int iteration = 1; iteration <= 5; iteration++) {
                    System.out.println("Iteration " + iteration + ":");
                    Files.lines(Paths.get(filename))
                            .forEach(System.out::println);
                    System.out.println();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
