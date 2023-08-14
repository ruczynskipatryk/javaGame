package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ScoreManager {
        // Saving scores to file
        public void saveScoers(int brightSidePoints, int darkSidePoints) {
            try {
                FileWriter writer = new FileWriter("scores.txt");
                writer.write("Bright Side points: " + brightSidePoints + "\n");
                writer.write("Dark side points: " + darkSidePoints + "\n");
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        // Loading scores from file
        public void loadScoers() {
            try {
                BufferedReader reader = new BufferedReader(new FileReader("scores.txt"));
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
}
