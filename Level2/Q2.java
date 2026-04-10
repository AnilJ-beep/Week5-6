import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] ages = new int[3];
        double[] heights = new double[3];

        // Input
        for (int i = 0; i < 3; i++) {
            System.out.println("Friend " + (i + 1));

            System.out.print("Enter age: ");
            ages[i] = sc.nextInt();

            System.out.print("Enter height (in cm): ");
            heights[i] = sc.nextDouble();
        }

        // Find youngest
        int youngest = ages[0];
        for (int i = 1; i < 3; i++) {
            if (ages[i] < youngest) {
                youngest = ages[i];
            }
        }

        // Find tallest
        double tallest = heights[0];
        for (int i = 1; i < 3; i++) {
            if (heights[i] > tallest) {
                tallest = heights[i];
            }
        }

        // Output
        System.out.println("\nYoungest age: " + youngest);
        System.out.println("Tallest height: " + tallest + " cm");

        sc.close();
    }
}