package pl.camp.it;

public class Zadanie3 {
    public static void main(String[] args) {
        System.out.println(StringChallenge("Na"));
    }

    public static String StringChallenge(String str) {
        while (true) {
            int occ = str.indexOf("M");
            if(occ > 0) {
                char p = str.charAt(occ - 1);
                char[] array = str.toCharArray();
                array[occ] = p;
                str = String.copyValueOf(array);
            } else {
                break;
            }
        }

        while (true) {
            int occ = str.indexOf("N");
            if(occ > -1) {
                char[] array = str.toCharArray();
                array[occ] = ' ';
                array[occ+1] = ' ';
                str = String.copyValueOf(array).replace(" ", "");
            } else {
                break;
            }
        }

        return str;
    }
}
