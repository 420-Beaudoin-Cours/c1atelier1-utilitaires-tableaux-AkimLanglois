import java.util.Arrays;

/**
 * @author France Beaudoin
 */
public class Tableaux {
    // test
    private static void permute(int[] tab, int i1, int i2) {
        int transit = tab[i1];
        tab[i1] = tab[i2];
        tab[i2] = transit;
    }

    private static void permute(String[] tab, int i1, int i2) {
        String transit = tab[i1];
        tab[i1] = tab[i2];
        tab[i2] = transit;
    }

    public static void trierCroissantSSS(int[] tab) {
        int imin;
        for (int i = 0; i < tab.length - 1; i++) {
            imin = i;
            for (int j = i + 1; j < tab.length; j++) {
                if (tab[j] < tab[imin])
                    imin = j;
            }
            if (imin != i)
                permute(tab, i, imin);
        }
    }

    public static void trierCroissantSSS(String[] tab) {
        int imin;
        for (int i = 0; i < tab.length - 1; i++) {
            imin = i;
            for (int j = i + 1; j < tab.length; j++) {
                if (Integer.parseInt(tab[j]) < Integer.parseInt(tab[imin]))
                    imin = j;
            }
            if (imin != i)
                permute(tab, i, imin);
        }
    }

    public static void trierDecroissantSSS(int[] tab) {
        int imin;
        for (int i = 0; i < tab.length - 1; i++) {
            imin = i;
            for (int j = i + 1; j < tab.length; j++) {
                if (tab[j] > tab[imin])
                    imin = j;
            }
            if (imin != i)
                permute(tab, i, imin);
        }
    }

    public static void print(int[] tab) {
        System.out.println(Arrays.toString(tab));
    }

    public static int maximum(int[] tab) {
        int imax = 0;
        for (int i = 0; i < tab.length - 1; i++) {
            imax = i;
            for (int j = i + 1; j < tab.length; j++) {
                if (tab[j] > tab[imax])
                    imax = j;
            }
        }
        return imax;
    }
    public static int minimum(int[] tab) {
        int imin = 0;
        for (int i = 0; i < tab.length - 1; i++) {
            imin = i;
            for (int j = i + 1; j < tab.length; j++) {
                if (tab[j] < tab[imin])
                    imin = j;
            }
        }
        return imin;
    }
    public static double moyenne (int [] tab){
        double moyenne = 0;
        int x = 0;
        int total = 0;
        while (x < tab.length){
            total =+ tab[x];
            x++;
        }
        moyenne = total/tab.length;
        return moyenne;
    }
    public static int fouilleSeq(int [] tab, int target){
        boolean found = false;
        int i = 0;
        while (i<tab.length && !found){
            if (tab[i] == target)
                found = true;
            else
                i++;
        }
        if (found)
        return i;
        else return -1;
    }
}