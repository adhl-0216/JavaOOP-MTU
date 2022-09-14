package Lab1;

import java.util.Scanner;
public class TextAnalyser {
    public static void main(String[] args) {
        try {
            final int loops = 3 ;
            int iter = 0;

            char[][] chArr = new char[loops][100];
            String[][] strArr = new String[loops][100];
            int totWord = 0;
            int shortestLen = 0;
            String shortestText = " ";

            do {
                Scanner lines = new Scanner(System.in);
                String[] Texts = new String[loops];
                String text;
                int i = 0;

                System.out.println("\n***Text Data***");
                System.out.printf("Please enter piece of text %d: ",(iter+1));
                text = lines.nextLine();
                Texts[iter] = text;
/*
            Programming in Java is an education
            He tried and tried but could not figure it out
            red, ted, fed, led, hed
*/
                int len = Texts[iter].length();

                char[] chItem = new char[len];
                int numLVowels = 0;
                int containsEd = 0;
                String[] strItem;

                text.getChars(0,len,chItem,0);
                chArr[iter] = chItem;

                while (i < len){
                    switch (chArr[iter][i]) {
                        case 'a', 'e', 'i', 'o', 'u' -> numLVowels++;
                    }
                    i++;
                }

                strItem = text.split(" ");
                strArr[iter]=strItem;
                i = 0;
                while (i < strItem.length){
                    boolean bool = strItem[i].contains("ed");
                    if(bool){
                        containsEd++;
                    }
                    i++;
                }

                totWord+=strItem.length;

                System.out.printf("Number of characters: %d%n",len);
                System.out.printf("Number of lowercase vowels: %d%n", numLVowels );
                System.out.printf("Number of words: %d%n", strItem.length);
                System.out.printf("Number of times \"ed\" appears in the text: %d%n", containsEd);

                if (shortestLen == 0){
                    shortestLen = len;
                    shortestText = text;
                }else if (len < shortestLen){
                    shortestLen = len;
                    shortestText = text;
                }

                iter++;
            } while (loops > iter);

            double avgWords = totWord/loops;

            System.out.println("\n ***Overall Results***");
            System.out.println("Shortest piece of text: " + shortestText);
            System.out.println("Average number of words: " + avgWords);
//hehexD
        } catch (Exception e) {
            throw new RuntimeException("Please insert relevant information.");
        }
    }
}