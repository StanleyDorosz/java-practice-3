import java.util.Scanner;

public class AverageScore {
    public static void main(String [] args) {


        Scanner sc = new Scanner(System.in);

        System.out.print("Enter score 1: ");
        int testScore1 = sc.nextInt();

        System.out.print("Enter score 2: ");
        int testScore2 = sc.nextInt();

        System.out.print("Enter score 3: ");
        int testScore3 = sc.nextInt();

        double testScoreAverage = (testScore1 + testScore2 + testScore3) / (double)3;

        System.out.println("Average Score: " + testScoreAverage);
    }
}

/* Requirements

        1. Ask the user to enter three test scores (integers).

        2. Use Scanner to read the three scores.

        3. Calculate the average as a double.

        4. Use casting to make sure the average includes the decimal part.

        5. Display the average.

        Example Output

Enter score 1: 80
Enter score 2: 85
Enter score 3: 90
Average score: 85.0

 */