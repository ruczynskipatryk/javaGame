package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

public class ScoreManager {
        private int brightSidePoints;
        private int darkSidePoints;
        private LocalDate lastResetDate;

        public ScoreManager() {
            loadScores();
        }

        // Saving scores to file
        public void saveScores() {
            try {
                FileWriter writer = new FileWriter("scores.txt");
                writer.write("Bright Side points: " + brightSidePoints + "\n");
                writer.write("Dark side points: " + darkSidePoints + "\n");
                writer.write("Last reset date: " + lastResetDate + "\n");
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        // Loading scores from file
        public void loadScores() {
            try {
                BufferedReader reader = new BufferedReader(new FileReader("scores.txt"));
                String line;
                while ((line = reader.readLine()) != null) {
                    if (line.startsWith("Bright Side points: ")) {
                        brightSidePoints = Integer.parseInt(line.substring("Bright Side points: ".length()));
                    } else if (line.startsWith("Dark side points: ")) {
                        darkSidePoints = Integer.parseInt(line.substring("Dark side points: ".length()));
                    } else if (line.startsWith("Last reset date: ")) {
                        lastResetDate = LocalDate.parse(line.substring("Last reset date: ".length()));
                    }
                }
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        // Reset scores if a new day has come
        public void resetScoresIfNeeded() {
            LocalDate currentDate = LocalDate.now();
            if (!currentDate.equals(lastResetDate)) {
                brightSidePoints = 0;
                darkSidePoints = 0;
                lastResetDate = currentDate;
                saveScores();
            }
        }

        // Increment Bright Side points
        public void incrementBrightSidePoints() {
            brightSidePoints++;
            saveScores();
        }

        // Increment Dark Side points
        public void incrementDarkSidePoints() {
            darkSidePoints++;
            saveScores();
        }

        public int getBrightSidePoints() {
            return brightSidePoints;
        }

        public int getDarkSidePoints() {
            return darkSidePoints;
        }
}
