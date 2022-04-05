import java.util.Scanner;

/**
 * Infinite array filling
 * @data 03.04.2022
 * @author Alex Krentik
 */

public class InfiniteArray {
    public static void main(String[] args) {
        String[] arrayOfWords = new String[4];
        Scanner inputWords = new Scanner(System.in);
        String words;
        int i = 0;
        while (true) {
            System.out.println("Enter the word: ");
            words = inputWords.nextLine();
            String firstLetter = String.valueOf(words.charAt(0));
            if (words.equalsIgnoreCase("Exit")) {
                System.out.println("Exiting the program is successful.");
                break;
            } else {
                switch (firstLetter) {
                    case ("A"):
                    case ("U"):
                    case ("V"):
                        arrayOfWords[i] = words;
                        i++;
                        if (i == arrayOfWords.length)
                            i = 0;
                        break;
                    default:
                        System.out.println("Incorrect word entered.");
                        break;
                }
            }
        }
            System.out.println("Array contents: ");
            for (i = 0; i < arrayOfWords.length; i++) {
                System.out.println(arrayOfWords[i]);
            }
        }
    }

