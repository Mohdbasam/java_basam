import java.util.*;

public class SortStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many strings do you want to enter? ");
        int n = Integer.parseInt(sc.nextLine());

        String[] strings = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter string " + (i + 1) + ": ");
            strings[i] = sc.nextLine();
        }

        System.out.println("\nSorted strings are:");
        for (String str : strings) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            System.out.println(new String(chars));
        }

        sc.close();
    }
}

