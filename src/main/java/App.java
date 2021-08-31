import javax.sound.midi.Soundbank;
import java.sql.Array;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String str = "You Only Live Once. But if You do it right. once is Enough";
        System.out.println(str);
        // ý 1
        System.out.format("Chuoi %s co chua %d ki tu in hoa", str, countUpper(str));
        // ý 2
        String[] spaceParts = str.split("\\s");
        int i =0;
        String str2 = "";
        while ( i < spaceParts.length){
            str2 += (toUpperCase(spaceParts[i]) + " ");
            i++;
        }
        System.out.format("Chuoi viet lai la: \n%s \n", str2.trim());
        // ý 3
        String[] dotParts = str.split("\\.");
        int j =0;
        String str3 = "";
        while ( j < dotParts.length){
            str3 += (toUpperCaseFirstLetter(dotParts[j]) + ".");
            j++;
        }
        System.out.format("Chuoi viet lai la: \n%s \n", str3.trim());
        // ý 3

    }

    public static int countUpper(String str) {
        int count = 0;
        int contentLength = str.length();
        for (int i = 0; i < contentLength; i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                count += 1;
            }
        }
        return count;
    }

    public static String toUpperCase(String s1) {
        String firstLetter = s1.substring(0, 1);
        String remainingLetters = s1.substring(1, s1.length());
        firstLetter = firstLetter.toUpperCase();
        s1 = firstLetter + remainingLetters;
        return s1;
    }
    public static String toUpperCaseFirstLetter(String s1) {
        String s2 = s1.toLowerCase();
        char[] arrayChar = s2.toCharArray();
        for (int i = 0; i < arrayChar.length; i++) {
            if (Character.isAlphabetic(arrayChar[i])){
                arrayChar[i]= Character.toUpperCase(arrayChar[i]);
                break;
            }
        }
        String s3= String.valueOf(arrayChar);
        return s3;
    }

}
