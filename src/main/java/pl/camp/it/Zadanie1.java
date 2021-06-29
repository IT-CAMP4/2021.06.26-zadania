package pl.camp.it;

public class Zadanie1 {
    public static void main(String[] args) {
        int algorithmResult = StringChallenge("BBCAABCBAACCCCCC");

        System.out.println(algorithmResult);
    }

    public static int StringChallenge(String str) {
        System.out.println(str);

        String result = str
                .replace("AB", "C")
                .replace("BA", "C")
                .replace("AC", "B")
                .replace("CA", "B")
                .replace("BC", "A")
                .replace("CB", "A");

        if(str.equals(result)) {
            return result.length();
        } else {
            return StringChallenge(result);
        }
    }
}
