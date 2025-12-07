package sprint01.JavaCollections.level01C;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.*;

public class CountryCapitalGame {
    private final String countriesFileName;
    private final String scoresFileName;
    private final Map<String, String> countryToCapital = new HashMap<>();
    private final Random random = new Random();
    private final int questionsCount = 10;

    public CountryCapitalGame(String countriesFileName, String scoresFileName) {
        this.countriesFileName = countriesFileName;
        this.scoresFileName = scoresFileName;

    }

    public void play(Scanner console) {
        try {
            loadCountries();
        } catch (IOException e) {
            System.out.println("Error loadig countries from file: " + e.getMessage());
            return;
        }

        if (countryToCapital.isEmpty()) {
            System.out.println("No countries were loaded. Game cannot be started");
            return;

        }

        String playerName = askPlayerName(console);
        int score = askQuestions(console, playerName);

        System.out.println("\n" + playerName + ", your final score is: " + score + " / " + questionsCount);

        try {
            saveScore(playerName, score);
        } catch (IOException e) {
            System.out.println("Error saving score to file: " + e. getMessage());
        }
    }

   private void loadCountries() throws IOException {
       Path filePath = Path.of(countriesFileName);

       try (BufferedReader reader = Files.newBufferedReader(filePath, StandardCharsets.UTF_8)) {
           String line;

           while ((line = reader.readLine()) != null) {
               if (line.isBlank()) {
                   continue;
               }

               String[] parts = line.split(",");
               if (parts.length != 2) {
                   System.out.println("Ignoring invalid line: " + line);
                   continue;

               }

               String country = parts[0].trim();
               String capital = parts[1].trim();

               countryToCapital.put(country, capital);
           }
       }

       System.out.println("Loaded " + countryToCapital.size() + " countries into the game.");

        }
   private String askPlayerName(Scanner console) {
        String name;

        do {
            System.out.println("\nPlease enter your name: ");
            name = console.nextLine().trim();
        } while (name.isEmpty());

        return name;
   }

private int askQuestions(Scanner console, String playerName) {
    List<String> selectedCountries = chooseRandomCountries();

    int score = 0;

    System.out.println("\nHello, " + playerName + "!");
    System.out.println("You will be asked about " + selectedCountries.size() + " capitals.");
    System.out.println("Type the capital of the shown country and press ENTER. \n");

    for (String country : selectedCountries) {
        String correctCapital = countryToCapital.get(country);

        System.out.println("What is the capital of " + country + "? ");
        String answer = console.nextLine().trim();

        if (answer.equalsIgnoreCase(correctCapital)) {
            System.out.println(" Corret!");
            score++;
        } else {
            System.out.println("Wrong. The correct answer is: " + correctCapital);

        }

        System.out.println();
    }

    return score;

}

private List<String> chooseRandomCountries() {
        List<String> countries = new ArrayList<>(countryToCapital.keySet());

        Collections.shuffle(countries, random);

        int count = Math.min(questionsCount, countries.size());

        return new ArrayList<>(countries.subList(0, count));
}

private void saveScore(String playerName, int score) throws IOException {
    Path scoresPath = Path.of(scoresFileName);

    try(BufferedWriter writer = Files.newBufferedWriter(scoresPath,
            StandardCharsets.UTF_8,
            StandardOpenOption.CREATE,
            StandardOpenOption.APPEND)
    ){

        writer.write(playerName + ";" + score);
        writer.newLine();
    }

    System.out.println("Score saved in file: " + scoresFileName);
    }
}

