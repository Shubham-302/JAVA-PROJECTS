import java.util.Scanner;

public class task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please provide the total number of subjects: ");
        int totalnumOfSubjects = sc.nextInt();

        int totalMarksobtained = 0;
        int[] marks = new int[totalnumOfSubjects];

        for (int i = 0; i < totalnumOfSubjects; i++) {
            System.out.print("Enter marks obtained in subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
            totalMarksobtained += marks[i];
        }

        double averagePercentagerecorded = (double) totalMarksobtained / totalnumOfSubjects;

        String finalgrade;

        if (averagePercentagerecorded >= 90) {
            finalgrade = "Outstanding";
        } else if (averagePercentagerecorded >= 80) {
            finalgrade = "A+";
        } else if (averagePercentagerecorded >= 70) {
            finalgrade = "A";
        } else if (averagePercentagerecorded >= 60) {
            finalgrade = "B+";
        } else if (averagePercentagerecorded >= 50) {
            finalgrade = "B";
        } else {
            finalgrade = "C+";
        }

        System.out.println("Total Marks Obtained: " + totalMarksobtained);
        System.out.println("Average Percentage: " + averagePercentagerecorded + "%");
        System.out.println("Calculated Grade: " + finalgrade);
        sc.close();
    }
}