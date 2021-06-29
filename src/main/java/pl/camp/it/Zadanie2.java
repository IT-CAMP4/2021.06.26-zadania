package pl.camp.it;

public class Zadanie2 {
    public static void main(String[] args) {
        int[] tab = {1,2,3,4,4,3,2,1};

        boolean flag = false;
        for(int i = 0; i < tab.length/2; i++) {
            if(tab[i] != tab[tab.length - i - 1]) {
                flag = true;
                break;
            }
        }

        if (flag) {
            System.out.println("tablica niesymetryczna !!");
        } else {
            System.out.println("Tablica symetryczna !!");
        }
    }
}
