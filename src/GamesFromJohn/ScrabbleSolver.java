package GamesFromJohn;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ScrabbleSolver {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your letters");
        String letters = scanner.nextLine();



        BufferedReader reader = new BufferedReader(new FileReader("/Users/avivashuman/Desktop/scrabbleDictionary.txt"));
        for(String currentWord = reader.readLine(); currentWord != null; currentWord = reader.readLine()){
            System.out.println(currentWord);
        }


    }
    private static Map<Character, Integer> getCharacterCountMap(String letters) {
        Map<Character, Integer> lettersCountMap = new HashMap<>();
        for(int i = 0; i < letters.length(); i++) {
            char currentChar = letters.charAt(i);

            int count = lettersCountMap.containsKey(currentChar) ?
                    lettersCountMap.get(currentChar) : 0;

            lettersCountMap.put(currentChar, count + 1);
        }
        return lettersCountMap;
    }
}
