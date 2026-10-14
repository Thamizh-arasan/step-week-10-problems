import java.util.Scanner;

public class DutyRosterRotation {
    static String[] rotateRoster(String[] names, int k) {
        int n = names.length;
        String[] rotated = new String[n];
        k = k % n;

        for (int i = 0; i < n; i++)
            rotated[(i + k) % n] = names[i];

        return rotated;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] names = new String[n];

        for (int i = 0; i < n; i++)
            names[i] = sc.next();

        int k = sc.nextInt();
        String[] result = rotateRoster(names, k);

        System.out.print("[");
        for (int i = 0; i < n; i++) {
            if (i > 0) System.out.print(", ");
            System.out.print(result[i]);
        }
        System.out.println("]");
    }
}

// Time: O(n), Extra space: O(n).