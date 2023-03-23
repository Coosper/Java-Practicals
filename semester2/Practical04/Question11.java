import java.util.Scanner;

public class Question11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter the age of student:");
            ages[i] = sc.nextInt();
        }

        System.out.println("The average age of 3 students is: " + averageAge(ages));
    }

    public static int averageAge(int[] ages) {
        int total = 0;
        for (int i = 0; i < 3; i++) {
            total += ages[i];
        }

        return total/3;
    }
}