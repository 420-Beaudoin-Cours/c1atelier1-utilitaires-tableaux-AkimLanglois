import javafx.scene.control.Tab;

import java.util.Arrays;

public class Main {
    public static void main (String [] args){
        int [] tableau1 = {1, 2, 6, 5, 4, 3, 9, 8, 7};
        String [] tableau2 = {"11", "12", "16", "15", "14", "13", "19", "18", "17"};
        int max = 0;
        int min = 0;
        double moyenne = 0;
        int found = 0;
        Tableaux.trierCroissantSSS(tableau1);
        Tableaux.print(tableau1);
        Tableaux.trierDecroissantSSS(tableau1);
        Tableaux.print(tableau1);
        max = Tableaux.maximum(tableau1);
        System.out.println(max);
        min = Tableaux.minimum(tableau1);
        System.out.println(min);
        moyenne = Tableaux.moyenne(tableau1);
        System.out.println(moyenne);
        found = Tableaux.fouilleSeq(tableau1, 10);
        System.out.println("nombre 10 présent : " + found);
        found = Tableaux.fouilleSeq(tableau1, 9);
        System.out.println("nombre 9 présent : " + found);
        Tableaux.trierDecroissantSSS(tableau2);
        Tableaux.print(tableau2);


    }
}
