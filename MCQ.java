import java.util.Scanner;

public class Mensis_MCQ {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        //Declaration && Initialization
        String ans1, ans2, ans3, ans4, ans5, ans6, ans7, ans8, ans9, ans10, loop;
        int score = 0;
        loop = "y";
        
        //Quiz
        while (loop.equalsIgnoreCase("Y")){
        System.out.println("=== BASIC MATH QUIZ ===");
        System.out.println("Mutiple Choice Questions");
        System.out.println("Enter the letter of your answer on the space provided below");
        System.out.println("\n1.) What is the value of x of the following equation? 2x = 10");
        System.out.println("A) x = 5");
        System.out.println("B) x = 2");
        System.out.println("C) x = 10");
        System.out.println("D) x = 20");
        System.out.print("Answer: ");
        ans1 = scan.nextLine();
        if (ans1.equalsIgnoreCase("A")) {
            score++;
        }
        System.out.println("\n2.) What is the output of the following equation? 2 x 4 - 8 +17");
        System.out.println("A) 25");
        System.out.println("B) 8");
        System.out.println("C) 17");
        System.out.println("D) None of the above");
        System.out.print("Answer: ");
        ans2 = scan.nextLine();
        if (ans2.equalsIgnoreCase("C")) {
            score++;
        }
        System.out.println("\n3.) What is the square root of 81?");
        System.out.println("A) 8");
        System.out.println("B) 9");
        System.out.println("C) 10");
        System.out.println("D) 7.99");
        System.out.print("Answer: ");
        ans3 = scan.nextLine();
        if (ans3.equalsIgnoreCase("B")) {
            score++;
        }
        System.out.println("\n4.) What is the scientific notation of two million?");
        System.out.println("A) 2x10^8");
        System.out.println("B) 2x10^6");
        System.out.println("C) 2x10^5");
        System.out.println("D) 2x10^4");
        System.out.print("Answer: ");
        ans4 = scan.nextLine();
        if (ans4.equalsIgnoreCase("B")) {
            score++;
        }
        System.out.println("\n5.) What is the term used to describe the result of two numbers being multiplied together?");
        System.out.println("A) Sum");
        System.out.println("B) Difference");
        System.out.println("C) Product");
        System.out.println("D) Quotient");
        System.out.print("Answer: ");
        ans5 = scan.nextLine();
        if (ans5.equalsIgnoreCase("C")) {
            score++;
        }
        System.out.println("\n6.) What is the result of the equation (2x/x) = 5");
        System.out.println("A) 2.5");
        System.out.println("B) 5");
        System.out.println("C) 2");
        System.out.println("D) Cannot be determined");
        System.out.print("Answer: ");
        ans6 = scan.nextLine();
        if (ans6.equalsIgnoreCase("D")) {
            score++;
        }
        System.out.println("\n7.) What is the limit of 5x/2 as x approaches 1?");
        System.out.println("A) 2.5");
        System.out.println("B) 2");
        System.out.println("C) 5");
        System.out.println("D) 10");
        System.out.print("Answer: ");
        ans7 = scan.nextLine();
        if (ans7.equalsIgnoreCase("A")) {
            score++;
        }
        System.out.println("\n8.) What are the chances of drawing a red card in a standard deck of cards?");
        System.out.println("A) 1/26");
        System.out.println("B) 1/52");
        System.out.println("C) 1/8");
        System.out.println("D) 1/2");
        System.out.print("Answer: ");
        ans8 = scan.nextLine();
        if (ans8.equalsIgnoreCase("D")) {
            score++;
        }
        System.out.println("\n9.) What is the value of x of the following equation? 250x = 30");
        System.out.println("A) x = 8 (1/4)");
        System.out.println("B) x = 7 (2/3)");
        System.out.println("C) x = 8 (1/3)");
        System.out.println("D) x = 9");
        System.out.print("Answer: ");
        ans9 = scan.nextLine();
        if (ans9.equalsIgnoreCase("C")) {
            score++;
        }
        System.out.println("\n10.) What are the chances of drawing an ace from a standard deck of cards?");
        System.out.println("A) 1/4");
        System.out.println("B) 1/2");
        System.out.println("C) 1/8");
        System.out.println("D) 1/13");
        System.out.print("Answer: ");
        ans10 = scan.nextLine();
        if (ans10.equalsIgnoreCase("D")) {
            score++;
        }
        //Result && Loop prompt
        System.out.println("\nTotal score: " + score);
        System.out.println("Would you like to take the quiz again? [Y/N]");
        loop = scan.nextLine();
        }
       
    }
}
