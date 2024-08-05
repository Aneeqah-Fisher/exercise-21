import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the first list
        System.out.print("Enter the number of elements in the first list followed by the elements: ");
        int n1 = input.nextInt();
        int[] list1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            list1[i] = input.nextInt();
        }

        // Prompt the user to enter the second list
        System.out.print("Enter the number of elements in the second list followed by the elements: ");
        int n2 = input.nextInt();
        int[] list2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            list2[i] = input.nextInt();
        }

        // Check if the two lists are strictly identical
        boolean result = equals(list1, list2);

        // Display the result
        if (result) {
            System.out.println("The two lists are strictly identical.");
        } else {
            System.out.println("The two lists are not strictly identical.");
        }

        input.close();
    }

    public static boolean equals(int[] list1, int[] list2) {
        // Check if the lengths of the two arrays are the same
        if (list1.length != list2.length) {
            return false;
        }

        // Compare corresponding elements of the two arrays
        for (int i = 0; i < list1.length; i++) {
            if (list1[i] != list2[i]) {
                return false;
            }
        }

        return true;
    }
}
