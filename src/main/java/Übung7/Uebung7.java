package Übung7;

public class Uebung7 {

    public static void main(String[] args) {

        String test = "Simon";
        System.out.println(test);
        StringBuilder dest = new StringBuilder();
        for (int i = (test.length() - 1); i >= 0; i--) {
            dest.append(test.charAt(i));
        }
        System.out.println(dest);
    }
}
