import java.util.Scanner;

public class ClassInfo {
    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("        Example Output");

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        String spaceFix1 = sc.nextLine();

        System.out.print("Enter your full name: ");
        String fullName = sc.nextLine();

        System.out.print("Enter your favorite course: ");
        String favoriteCourse = sc.nextLine();

        System.out.println("----- Student Information -----");
        System.out.println("        1");
        System.out.println("IT 114L Programming Assignment");

        System.out.println("Name: " + fullName);
        System.out.println("Age: " + age);
        System.out.println("Favorite course: " + favoriteCourse);
    }
}

/*

Write a Java program that collects and displays a student’s course information.
        Requirements

        1. Ask the user to enter their age (an int).

        2. Ask the user to enter their full name (may contain spaces).

        3. Ask the user to enter their favorite course (may contain spaces).

        4. Use Scanner to read all three inputs.

5. Display the information.

        Example Output
Enter your age: 20
Enter your full name: Mary Ann Smith
Enter your favorite course: Introduction to Java
----- Student Information -----
        1
IT 114L Programming Assignment
Name: Mary Ann Smith
Age: 20
Favorite course: Introduction to Java

Hint: After nextInt(), you may need an extra nextLine() to consume the leftover newline before
reading the full name.

 */

