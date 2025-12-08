import java.util.Random;
import java.util.Scanner;

public class simpleArithmeticApp {

public static void main(String[] args) {
arithmeticApp();
}

public static void arithmeticApp() {
   Scanner input = new Scanner(System.in);
   Random rand = new Random();

   int score = 0;
   long startTime = System.currentTimeMillis();

   for (int question = 1; question <= 10; question++) {
   if (arithmetic_askQuestion(input, rand)) {  
    score++;
}
   System.out.println("Score: " + score + "/" + question + "\n");
}

   long totalTime = (System.currentTimeMillis() - startTime) / 1000;
   arithmetic_showResults(score, totalTime);
}


public static boolean arithmetic_askQuestion(Scanner input, Random rand) {
   int firstDigit = rand.nextInt(100) + 1;
   int secondDigit = rand.nextInt(firstDigit) + 1;
   int answer = firstDigit - secondDigit;

   for (int attempt = 1; attempt <= 2; attempt++) {
System.out.print(firstDigit + " - " + secondDigit + " = ");

   if (input.hasNextInt()) {
    int guess = input.nextInt();
    input.nextLine(); 

    if (guess == answer) {
        System.out.println("Genius!");
        return true;
    }
} else {
    input.nextLine(); 
}

   System.out.println("Oops! Try again.");
}

   System.out.println("The answer was: " + answer);
return false;
}

public static void arithmetic_showResults(int score, long totalTime) {
   double percentage = (score / 10.0) * 100;

System.out.println("Final Score: " + score + "/10");
System.out.printf("Percentage: %.2f%%\n", percentage);
System.out.println("Total Time: " + totalTime + " seconds");
}
}

