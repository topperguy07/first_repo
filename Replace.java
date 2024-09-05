import java.util.*;

class Replace {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String a = s.nextLine();
        char x = a.charAt(0);

        StringBuilder modifiedString = new StringBuilder(a);

        for (int i = 1; i < a.length(); i++) {
            if (a.charAt(i) == x) {
                modifiedString.setCharAt(i, '$');
            }
        }

        System.out.println(modifiedString.toString());
    }
}
