package sprint01.JavaCollections.level01C;

import java.util.Scanner;

public class CountryCapitalGameMain {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String countriesFileName = "countries.txt";
        String scoresFileName = "classification.txt";

        CountryCapitalGame game = new CountryCapitalGame(countriesFileName, scoresFileName);

        game.play(console);

    }
}
