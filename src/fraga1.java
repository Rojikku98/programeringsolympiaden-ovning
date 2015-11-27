import java.util.Scanner;

/**
 * Created by edvin.bergstrom on 2015-11-27.
 * kap_ Övning
 * Beskrivning
 * Filnamn:
 */
public class fraga1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String textIn = in.nextLine();
        String textUt =  "";
        int i = (textIn.charAt(0))-('a');
        textUt += textIn.charAt(0);
        /*while (i < textIn.length()){
            textUt = textUt + textIn.charAt(i);
            i = (textIn.charAt(i))-('a');
        }*/
        for (; i < textIn.length(); i += textIn.charAt(i)-'a') {
            textUt += textIn.charAt(i);
        }
        System.out.println(textUt);
    }
}
