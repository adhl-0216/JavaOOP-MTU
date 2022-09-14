package Lab1;

import java.util.Scanner;


public class TextAnalyser {
    public static void main(String[] args) {
        try {
            Scanner obj = new Scanner(System.in);
            String text1;


            System.out.println("Please enter piece of text: " );
            //Programming in Java is an education
            text1 = obj.nextLine();

            System.out.printf("Number of characters: %d%n",text1.length());

            char[] chArr = new char[text1.length()];
            text1.getChars(0,text1.length(),chArr,0);
            int i = 0;
            int numLVowels = 0;
            while (i <text1.length()){
                switch (chArr[i]) {
                    case 'a', 'e', 'i', 'o', 'u' -> numLVowels++;
                }
                i++;
            }
            System.out.printf("Number of lowercase vowels: %d%n", numLVowels );

            String[] strArr1 = text1.split(" ");
            i = 0;
            int containsEd = 0;

            while (i < strArr1.length){
                boolean bool = strArr1[i].contains("ed");
                if(bool){
                    containsEd++;
                }

                i++;
            }
            /*System.out.println(bool);*/

            System.out.printf("Number of words: %d%n", strArr1.length);
            System.out.printf("Number of times \"ed\" appears in the text: %d%n", containsEd);




        } catch (Exception e) {
            throw new RuntimeException("Please insert relevant information.");
        }
    }
}
