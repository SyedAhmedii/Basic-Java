// import java.util.*;
// public class Practice {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter your age:");
//         int age = sc.nextInt();
//         sc.nextLine();
//         System.out.println("Enter membership type");
//         String memberShip = sc.nextLine();
//         if(age < 18 || memberShip.equals("premium")){
//             System.out.println("You are not eligible ");
//         }
//         else{
//             System.out.println("You are eligible");
//         }
//     }
// }

// import java.util.*;
// public class Practice {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter your Password");
//         String password = sc.nextLine();
//         if(password.length() < 8){
//             System.out.println("Weak Password");
//         }
//         else if(password.matches(".*\\d.*") && password.matches(".*[!@#$%^&*()_\\-+=<>?/{}~|].*")){
//             System.out.println("Strong Password");
//         }
//         else if (password.matches(".*\\d.*")){
//             System.out.println("Moderate Password");
//         }
//         else{
//             System.out.println("Weak Password");
//         }
//     }
// }

// import java.util.*;
// public class Practice {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter Amount for Discounts");
//         double amount = sc.nextDouble();
//         if(amount > 5000){
//             System.out.println("You got 20% discount");
//         }
//         else if(amount < 5000 && amount > 2000){
//             System.out.println("You got 10% discount");
//         }
//         else{
//             System.out.println("Sorry you don't have any discounts");
//         }
//     }
// }

// import java.util.*;
// public class Practice {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a year");
//         int year = sc.nextInt();
//         if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
//             System.out.println(year + " is a leap year");
//         }
//         else{
//             System.out.println(year + " is not leap year");
//         }
//     }
// }

// public class Practice {

//     public static void main(String[] args) {
//         System.out.println("Prime numbers between 1 to 100 are");
//         for(int num = 2; num <= 100; num++){
//             boolean isPrime = true;
//             for(int i = 2; i <= num/2; i++){
//                 if(num % i == 0){
//                     isPrime = false;
//                     break;
//                 }
//             }
//             if(isPrime){
//                 System.out.print(num+ " ");
//             }
//         }
//     }
// }

// import java.util.*;
// public class Practice {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter rows and coloum of matrix A");
//         int rowsA = sc.nextInt();
//         int colsA = sc.nextInt();
//         System.out.println("Enter rows & coloums of matrix B");
//         int rowsB = sc.nextInt();
//         int colsB = sc.nextInt();
//         if(colsA != rowsB){
//             System.out.println("Matrices cannot be multiplied");
//             return;
//         }
//         int[][] A = new int[rowsA][colsA];
//         int[][] B = new int[rowsB][colsB];
//         int[][] C = new int[rowsA][colsB];
//         System.out.println("Enter elements of Matrix A");
//         for(int i = 0; i < rowsA; i++){
//             for(int j = 0; j < colsA; j++){
//                 A[i][j] = sc.nextInt();
//             }
//         }
//         System.out.println("Enter elements of Matrix B");
//         for(int i = 0; i < rowsB; i++){
//             for(int j = 0; j < colsB; j++){
//                 B[i][j] = sc.nextInt();
//             }
//         }
//         for(int i = 0; i < rowsA; i++){
//             for(int j = 0; j < colsB; j++){
//                 for(int k = 0; k < colsA; k++){
//                     C[i][j] = A[i][k] * B[k][j];
//                 }
//             }
//         }
//         System.out.println("Resultant Matrices");
//         for(int i = 0; i < rowsA; i++){
//             for(int j = 0; j < colsB; j++){
//                 System.out.print(C[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }

// public class Practice {
//   public static void main(String[] args) {
//       // Obtain the total milliseconds since midnight, Jan 1, 1970
//       long totalMilliseconds = System.currentTimeMillis();

//       // Obtain the total seconds since midnight, Jan 1, 1970
//       long totalSeconds = totalMilliseconds / 1000;

//       // Compute the current second in the minute
//       long currentSecond = totalSeconds % 60;

//       // Obtain the total minutes
//       long totalMinutes = totalSeconds / 60;

//       // Compute the current minute in the hour
//       long currentMinute = totalMinutes % 60;

//       // Obtain the total hours
//       long totalHours = totalMinutes / 60;

//       // Compute the current hour
//       long currentHour = totalHours % 24;

//       // Display results
//       System.out.println("Current time is " + currentHour + ":"
//           + currentMinute + ":" + currentSecond + " GMT");
//   }
// }

// import java.util.Scanner;

// public class Practice {
//   public static void main(String[] args) {   
//     // Create a Scanner
//     Scanner input = new Scanner(System.in);

//     // Receive the amount 
//     System.out.print(
//       "Enter an amount in double, for example 11.56: ");
//     double amount = input.nextDouble();

//     int remainingAmount = (int)(amount * 100);

//     // Find the number of one dollars
//     int numberOfOneDollars = remainingAmount / 100;
//     remainingAmount = remainingAmount % 100;

//     // Find the number of quarters in the remaining amount
//     int numberOfQuarters = remainingAmount / 25;
//     remainingAmount = remainingAmount % 25;

//     // Find the number of dimes in the remaining amount
//     int numberOfDimes = remainingAmount / 10;
//     remainingAmount = remainingAmount % 10;

//     // Find the number of nickels in the remaining amount
//     int numberOfNickels = remainingAmount / 5;
//     remainingAmount = remainingAmount % 5;

//     // Find the number of pennies in the remaining amount
//     int numberOfPennies = remainingAmount;

//     // Display results
//     System.out.println("Your amount " + amount + " consists of"); 
//     System.out.println("    " + numberOfOneDollars + " dollars");
//     System.out.println("    " + numberOfQuarters + " quarters");
//     System.out.println("    " + numberOfDimes + " dimes"); 
//     System.out.println("    " + numberOfNickels + " nickels");
//     System.out.println("    " + numberOfPennies + " pennies");
//   }
// }

// Write a Java program to convert a given amount in rupees to the equivalent number of 100, 50, 20, 10, 5, 2, and 1 rupee notes

// import java.util.*;
// public class Practice {

//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter Amount in rupees");
//     int amount = sc.nextInt();
//     int hundredNotes = amount / 100;
//     amount = amount % 100;
//     int fiftyNotes = amount / 50;
//     amount = amount % 50;
//     int twentyNotes = amount / 20;
//     amount = amount % 20;
//     int tenNotes = amount / 10;
//     amount = amount % 10;
//     int fiveCoins = amount / 5;
//     amount = amount % 5;
//     int twoCoin = amount / 2;
//     amount = amount % 2;
//     int oneCoin = amount;
//     System.out.println("Your amount " + amount + " consist of:");
//     System.out.println("    " + hundredNotes + " Hundred notes");
//     System.out.println("    " + fiftyNotes + " Fifty notes");
//     System.out.println("    " + twentyNotes + " Twenty notes");
//     System.out.println("    " + tenNotes + " Ten notes");
//     System.out.println("    " + fiveCoins + " Five Coins");
//     System.out.println("    " + twoCoin + " Two Coins");
//     System.out.println("    " + oneCoin + " One Coins");
//   }
// }

// Problem: An Improved Math Learning Tool
// This example creates a program to teach a
// first grade child how to learn subtractions.
// The program randomly generates two singledigit integers number1 and number2 with
// number1 >= number2 and displays a question
// such as “What is 9 – 2?” to the student. After
// the student types the answer, the program
// displays whether the answer is correct

// import java.util.*;
// public class Practice {

//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int number1 =(int) (Math.random() * 10);
//     int number2 =(int) (Math.random() * 10);
//     if(number1 < number2){
//       int temp = number1;
//       number1 = number2;
//       number2 = temp;
//     }
//     System.out.println("What is " + number1 + " - " + number2 + " ?");
//     int answer = sc.nextInt();
//     if(answer == (number1 - number2)){
//       System.out.println("Correct Welldone!");
//     }
//     else{
//       System.out.println("Sorry! The correct answer is: " + (number1 - number2));
//     }
//   }
// }

// write a program that checks whether a number is divisible by 2 
// and 3, whether a number is divisible by 2 or 3, and whether a
// number is divisible by 2 or 3 but not both:

// import java.util.*;
// public class Practice {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number:");
//         int number = sc.nextInt();
//         if (number % 2 == 0 && number % 3 == 0){
//             System.out.println(number + " is divisible by 2 and 3");
//         }
//         else{
//             System.out.println(number + " is not divisible by 2 and 3");
//         }
//         if (number % 2 == 0 || number % 3 == 0){
//             System.out.println(number + " is divisible by 2 or 3");
//         }
//         else{
//             System.out.println(number + " is not divisible by 2 or 3");
//         }
//         if((number % 2 == 0) ^ (number % 3 == 0)){
//             System.out.println(number + " is divisible by 2 or 3, but not both");
//         }
//         else{
//             System.out.println(number + " is not divisible by 2 or 3, exclusively");
//         }         
//     }
// }

// Write a program that randomly generates a lottery of a twodigit number, prompts the user to enter a two-digit number,
// and determines whether the user wins according to the
// following rule:
// • If the user input matches the lottery in exact order, the
// award is $10,000.
// • If the user input matches the lottery, the award is
// $3,000.
// • If one digit in the user input matches a digit in the
// lottery, the award is $1,000.

// import java.util.*;
// public class Practice {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         Random random = new Random();
//         random.nextInt(90);
// // The random.nextInt(90) method generates a random integer between 0 and 89 (inclusive). This means it can generate values starting from 0 up to 89.
// // + 10:

// // After generating a number between 0 and 89, the + 10 adds 10 to the result.
// // This shifts the range of possible values from 0-89 to 10-99. So, now the number will always be between 10 and 99, which are valid two-digit numbers.
// // Example:
// // If random.nextInt(90) returns 45, then adding 10 will give 45 + 10 = 55.
// // If random.nextInt(90) returns 2, then adding 10 will give 2 + 10 = 12.
//         int lottery = random.nextInt(90) + 10;
//         System.out.println("Enter a two digit number: " );
//         int number = sc.nextInt();
//         // Extract digits from lottery and user pick
//         int lotteryDigit1 = lottery / 10;
//         int lotteryDigit2 = lottery % 10;
//         int userDigit1 = number / 10;
//         int userDigit2 = number % 10;
//         if(number == lottery){
//             System.out.println("Exact Match! You won $10,000");
//         }
//         else if((userDigit1 == lotteryDigit1 && userDigit2 == lotteryDigit2) || (userDigit1 == lotteryDigit2 && userDigit2 == lotteryDigit1)){
//             System.out.println("Match all digit! You won $3000");
//         }
//         else if((userDigit1 == lotteryDigit1 || userDigit2 == lotteryDigit2)||(userDigit1 == lotteryDigit2|| userDigit2 == lotteryDigit1)){
//             System.out.println("Match one digit! You won $1000");
//         }
//         else{
//             System.out.println("No Match! Better Luck Next Time");
//         }
//     }
// }

// Recall that Listing 3.1 AdditionQuiz.java gives a
// program that prompts the user to enter an answer
// for a question on addition of two single digits.
// Using a loop, you can now rewrite the program to
// let the user enter a new answer until it is correct

// import java.util.*;
// public class Practice {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int number1 = (int) (Math.random() * 10);
//         int number2 = (int) (Math.random() * 10);
//         System.out.println("What is " + number1 + " + " + number2 + " = ?");
//         int answer = sc.nextInt();
//         while (answer != number1 + number2) {
//             System.out.println("Wrong answer! Try again");
//             System.out.println("What is " + number1 + " + " + number2 + " = ?");
//             answer = sc.nextInt();
//         }
//         System.out.println("Correct! The answer is " + (number1 + number2) + " .");
//     }
// }

// import java.util.*;
// public class Practice {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int number1 = (int)(Math.random() * 10);
//         int number2 = (int)(Math.random() * 10);
//         int tries = 0; // Attempt counter

//         System.out.println("What is " + number1 + " + " + number2 + " = ?");

//         int answer = sc.nextInt();
//         tries++; // Increment tries

//         while (answer != number1 + number2) {
//             if (tries >= 10) { // Check if attempts exceed 10
//                 System.out.println("Too many tries! The correct answer was " + (number1 + number2) + ".");
//                 break; // Exit the loop
//             }
//             System.out.println("Wrong answer! Try again.");
//             System.out.println("What is " + number1 + " + " + number2 + " = ?");
//             answer = sc.nextInt();
//             tries++; // Increment tries
//         }

//         if (answer == number1 + number2 && tries <= 10) {
//             System.out.println("Correct! The answer is " + (number1 + number2) + ".");
//         }
//     }
// }

// Write a program that randomly generates an
// integer between 0 and 100, inclusive. The program
// prompts the user to enter a number continuously
// until the number matches the randomly generated
// number. For each user input, the program tells the
// user whether the input is too low or too high, so
// the user can choose the next input intelligently.
// Here is a sample run

// import java.util.*;
// public class Practice {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int number = (int) (Math.random() * 101);
//         System.out.println("Guess the magic number between 1 to 100 ");
//         int guess = 1;
//         while (guess != number) {
//             guess = sc.nextInt();
//             if (guess == number) {
//                 System.out.println("Yes, the number is " + number);
//             } else if (guess > number) {
//                 System.out.println("The number is too high, Try again");
//             } else {
//                 System.out.println("The number is too low, Try again");
//             }
//         }
//     }
// }

// Problem: An Advanced Math Learning Tool
// The Math subtraction learning tool program
// generates just one question for each run. You can
// use a loop to generate questions repeatedly. This
// example gives a program that generates five
// questions and reports the number of the correct
// answers after a student answers all five questions.

// import java.util.*;
// public class Practice {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int correct = 0;
//         int totalQuestion = 5;
//         for (int i = 1; i <= totalQuestion; i++){
//             int num1 = (int)(Math.random() * 101);
//             int num2 = (int)(Math.random() * 101);
//             if(num1 < num2){
//                 int temp = num1;
//                 num1 = num2;
//                 num2 = temp;
//             }
//             System.out.println("Question" + i + " : What is " + num1 + " - " + num2 + " ?" );
//             int answer = sc.nextInt();
//             if(answer == num1 - num2){
//                 System.out.println("Correct!");
//                 correct++;
//             }
//             else{
//                 System.out.println("Wrong! The correct answer is: " + (num1 - num2) + " .");
//             }
//         }
//         System.out.println("You got " + correct + " out of " + totalQuestion + " questions correct");
//     }
// }

// Ending a Loop with a Sentinel Value
// Often the number of times a loop is executed is not
// predetermined. You may use an input value to
// signify the end of the loop. Such a value is known
// as a sentinel value.
// Write a program that reads and calculates the sum
// of an unspecified number of integers. The input 0
// signifies the end of the input.

// import java.util.*;
// public class Practice {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int sum = 0;
//         int number;
//         System.out.println("Enter integer to sum (enter 0 to stop)");
//         while (true) {
//             number = sc.nextInt();
//             if(number == 0){
//                 break;
//             }
//             sum += number;
//         }
//         String sumum;
//         System.out.println("The total sum is: " + sum);
//     }
// }

// import java.util.Scanner;

// public class Practice {
//     public static void main(String[] args) {
//         // Array of animals in the Chinese Zodiac cycle
//         String[] animals = {"Rat", "Ox", "Tiger", "Rabbit", "Dragon", "Snake", "Horse", "Goat", "Monkey", "Rooster", "Dog", "Pig"};

//         // Create Scanner object to get input from the user
//         Scanner sc = new Scanner(System.in);

//         // Prompt the user to enter a year
//         System.out.print("Enter a year: ");
//         int year = sc.nextInt();

//         // Calculate the index for the animal (year % 12)
//         int animalIndex = (year - 4) % 12;

//         // Print the corresponding animal
//         System.out.println("The animal for the year " + year + " is: " + animals[animalIndex]);
//     }
// }

// Problem: Write a program that uses nested for
// loops to print a multiplication table

// public class Practice {

//     public static void main(String[] args) {
//         int size  = 10;
//         for (int i = 1; i <= size; i++){
//             for(int j = 1; j <= size; j++){
//                 System.out.print(i * j + " ");
//             }
//             System.out.println();
//         }
//     }
// }

// Numeric errors involving floating-point
// numbers are inevitable. This section discusses
// how to minimize such errors through an
// example.
// Here is an example that sums a series that
// starts with 0.01 and ends with 1.0. The
// numbers in the series will increment by 0.01,
// as follows: 0.01 + 0.02 + 0.03 and so on.

// public class Practice {

//     public static void main(String[] args) {
//         double sum = 0.0;
//         for(double i = 0.01; i <= 1.0; i += 0.01){
//             sum += i;
//         }
//         System.out.println("So the sum is: " + sum);
//     }
// }

// Problem: Suppose that the tuition for a university is $10,000 this year
// and tuition increases 7% every year. In how many years will the
// tuition be doubled?

// public class Practice {

//     public static void main(String[] args) {
//         double tuition = 10000.0;
//         double targetTuition = 20000.0;
//         int years = 0;
//         while(tuition < targetTuition){
//             tuition = tuition * 1.07;
//             years++;
//         }
//         System.out.println("The tuition will be doubled in " + years + " years.");
//         System.out.printf("The tuition will be $%.2f in %d years.%n", tuition, years);
//     }
// }

// The Monte Carlo simulation refers to a technique that uses random
// numbers and probability to solve problems. This method has a wide
// range of applications in computational mathematics, physics,
// chemistry, and finance. This section gives an example of using the
// Monto Carlo simulation for estimating .
// circleArea / squareArea =  / 4.
//  can be approximated as 4 *
// numberOfHits / numberOfTrials

// import java.util.*;
// public class Practice {

//     public static void main(String[] args) {
//         int numberOfTrials = 1000000;
//         int numberOfHits = 0;
//         Random random = new Random();
//         for (int i = 0; i < numberOfTrials; i++) {
//             double x = random.nextDouble();
//             double y = random.nextDouble();
//             if (x * x + y * y <= 1) {
//                 numberOfHits++;
//             }
//         }
//         double piEstimate = 4.0 * numberOfHits / numberOfTrials;
//         System.out.println("Estimated value of π: " + piEstimate);
//     }
// }

// Read one hundred numbers, compute their
// average, and find out how many numbers are
// above the average

// import java.util.*;
// public class Practice {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int[] numbers = new int[10];
//         int sum = 0;
//         for (int i = 0; i < 10; i++){
//             System.out.println("Enter number: " + i);
//             numbers[i] = sc.nextInt();
//             sum += numbers[i];
//         }
//         double average = sum / 10.0;
//         int count = 0;
//         for (int i = 0; i < 10; i++){
//             if (numbers[i] > average){
//                 count++;
//             }
//         }
//         System.out.println("Average: " + average);
//         System.out.println("Numbers above average: " + count);
//     }
// }

// The problem is to write a program that picks four cards
// randomly from a deck of 52 cards. All the cards can be
// represented using an array named deck, filled with initial
// values 0 to 51, as follows:

// import java.util.*;
// public class Practice {

//     public static void main(String[] args) {
//         int[] deck = new int[52];
//         String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
//         String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
//         for (int i = 0; i < deck.length; i++){
//             deck[i] = i;
//         }
//         for (int i = 0; i < deck.length; i++){
//             int randomIndex = (int) (Math.random() * deck.length);
//             int temp = deck[i];
//             deck[i] = deck[randomIndex];
//             deck[randomIndex] = temp;
//         }
//         for (int i = 0; i < 4; i++){
//             int card = deck[i];
//             String suit = suits[card / 13];
//             String rank = ranks[card % 13];
//             System.out.println(rank + " of " + suit);
//         }
//     }
// }

// Objective: Demonstrate differences of
// passing primitive data type variables
// and array variables

// public class Practice {
//     public static void modifyPrimitive(int x){
//         x = 20;
//     }
//     public static void modifyingArray(int[] y){
//         y[0] = 10;
//     }
//     public static void main(String[] args) {
//         int x = 10;
//         int[] y = {1, 2, 3};
//         System.out.println("Before Modifying: " + x);
//         modifyPrimitive(x);
//         System.out.println("After Modifying: " + x);
//         System.out.println("Before Modifying: " + y[0]);
//         modifyingArray(y);
//         System.out.println("After Modifying: " + y[0]);
//     }
// }

//-----------------------Sir Syed University Paper-------------------------//

// Primitive Data Types in Java
// Java has 8 primitive data types, categorized as follows:

// Numeric Types:

// Byte: Stores whole numbers from -128 to 127.
// Size: 1 byte (8 bits)
// Short: Stores whole numbers from -32,768 to 32,767.
// Size: 2 bytes (16 bits)
// Int: Stores whole numbers from -2,147,483,648 to 2,147,483,647.
// Size: 4 bytes (32 bits)
// Long: Stores large whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807.
// Size: 8 bytes (64 bits)
// Float: Stores fractional numbers with a precision of about 7 decimal digits.
// Size: 4 bytes (32 bits)
// Double: Stores fractional numbers with higher precision (about 15 decimal digits).
// Size: 8 bytes (64 bits)
// Character Type:

// Char: Stores a single 16-bit Unicode character.
// Size: 2 bytes (16 bits)
// Boolean Type:

// Boolean: Represents one of two values: true or false.
// Size: 1 bit (size may vary based on JVM)
// Non-Primitive Data Types in Java
// Non-primitive data types include:

// Classes (e.g., String, Scanner)
// Interfaces (e.g., Runnable, Serializable)
// Arrays (e.g., int[], String[])
// Enums (e.g., enum Direction {NORTH, SOUTH, EAST, WEST})
// Unlike primitive types, non-primitive types:

// Are created by the programmer.
// Can store multiple values or complex objects.
// Are references to memory locations where the data is stored.
// Summary Table of Primitive Data Types
// Data Type	Size	Range or Precision
// byte	1 byte	-128 to 127
// short	2 bytes	-32,768 to 32,767
// int	4 bytes	-2^31 to 2^31-1
// long	8 bytes	-2^63 to 2^63-1
// float	4 bytes	Approx. 7 decimal digits precision
// double	8 bytes	Approx. 15 decimal digits precision
// char	2 bytes	0 to 65,535 (Unicode)
// boolean	1 bit*	true or false
// *Actual size of boolean may depend on JVM implementation.

// Key Differences:
// Primitive types store values directly in memory.
// Non-primitive types store references to objects in memory.

// In Java, Strings are immutable, just like in Python. This means that once a String object is created, its value cannot be changed. 
// Any operation that modifies a String (e.g., concatenation, substring, replacement) will result in the creation of a new String object, leaving the original string unchanged.

// Why Are Strings Immutable in Java?
// Security: Strings are often used in security-sensitive contexts, like class loading, configuration, and database connections. Immutable strings prevent unauthorized changes.
// Thread Safety: Immutability ensures that strings are safe to use in multithreaded environments without synchronization.
// Caching and Performance: String literals are pooled in the String Constant Pool. Immutable strings allow sharing without the risk of accidental changes.
// Functions Demonstrating Immutability in Java Strings
// Here are 3-4 commonly used methods that demonstrate the immutability of Java strings:

// 1. concat()
// The concat() method joins two strings and returns a new string. The original strings remain unchanged.

// java
// Copy code
// public class Main {
//     public static void main(String[] args) {
//         String s1 = "Hello";
//         String s2 = s1.concat(" World");

//         System.out.println("Original String: " + s1);  // Hello
//         System.out.println("Concatenated String: " + s2);  // Hello World
//     }
// }
// 2. substring()
// The substring() method extracts a portion of a string and returns a new string. The original string remains unaltered.

// java
// Copy code
// public class Main {
//     public static void main(String[] args) {
//         String s1 = "Immutable";
//         String s2 = s1.substring(0, 5);

//         System.out.println("Original String: " + s1);  // Immutable
//         System.out.println("Substring: " + s2);  // Immut
//     }
// }
// 3. replace()
// The replace() method replaces occurrences of a character or substring with another and returns a new string.

// java
// Copy code
// public class Main {
//     public static void main(String[] args) {
//         String s1 = "Java";
//         String s2 = s1.replace('a', 'o');

//         System.out.println("Original String: " + s1);  // Java
//         System.out.println("Replaced String: " + s2);  // Jovo
//     }
// }
// 4. toUpperCase() / toLowerCase()
// These methods return a new string with all characters converted to uppercase or lowercase, respectively.

// java
// Copy code
// public class Main {
//     public static void main(String[] args) {
//         String s1 = "immutable";
//         String s2 = s1.toUpperCase();

//         System.out.println("Original String: " + s1);  // immutable
//         System.out.println("Uppercase String: " + s2);  // IMMUTABLE
//     }
// }

// ### **Concept of Arrays in Java**

// An **array** in Java is a collection of elements of the same data type, stored in contiguous memory locations. Arrays allow efficient storage and manipulation of large amounts of data. 

// - Arrays in Java are **zero-indexed**, meaning the first element is accessed with index `0`.
// - Arrays are objects in Java, meaning they are reference types and can be dynamically allocated.

// ### **Features of Arrays in Java:**
// 1. **Fixed Size:** Once declared, the size of the array cannot be changed.
// 2. **Homogeneous Elements:** All elements in an array must be of the same type.
// 3. **Random Access:** You can access any element directly using its index.

// ---

// ### **Ways to Initialize Arrays in Java**

// Java provides multiple ways to initialize arrays. Here are three common methods:

// #### **1. Using Direct Initialization**
// You can declare and initialize an array in a single line.

// ```java
// public class Main {
//     public static void main(String[] args) {
//         int[] arr = {10, 20, 30, 40, 50};
//         for (int i : arr) {
//             System.out.print(i + " ");
//         }
//     }
// }
// ```

// ---

// #### **2. Using `new` Keyword with Explicit Initialization**
// Declare the array and allocate memory using the `new` keyword, then assign values.

// ```java
// public class Main {
//     public static void main(String[] args) {
//         int[] arr = new int[5];  // Array of size 5
//         arr[0] = 10;
//         arr[1] = 20;
//         arr[2] = 30;
//         arr[3] = 40;
//         arr[4] = 50;

//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }
// }
// ```

// ---

// #### **3. Using `new` Keyword with Anonymous Array**
// You can initialize an array using an anonymous array without explicitly declaring its size.

// ```java
// public class Main {
//     public static void main(String[] args) {
//         int[] arr = new int[]{10, 20, 30, 40, 50};
//         for (int i : arr) {
//             System.out.print(i + " ");
//         }
//     }
// }
// ```

// ---

// ### **Effective Looping Mechanisms for Arrays**

// There are several ways to loop through an array in Java. The choice of loop depends on the specific use case:

// #### **1. `for` Loop**
// The `for` loop is effective when you need to access elements by their indices or modify specific elements.

// ```java
// public class Main {
//     public static void main(String[] args) {
//         int[] arr = {10, 20, 30, 40, 50};
//         for (int i = 0; i < arr.length; i++) {
//             System.out.println("Element at index " + i + ": " + arr[i]);
//         }
//     }
// }
// ```

// #### **2. `for-each` Loop (Enhanced `for` Loop)**
// This loop is ideal for iterating over arrays without needing to know the index.

// ```java
// public class Main {
//     public static void main(String[] args) {
//         int[] arr = {10, 20, 30, 40, 50};
//         for (int num : arr) {
//             System.out.println("Value: " + num);
//         }
//     }
// }
// ```

// **Advantages of `for-each`:**
// - Cleaner and more readable.
// - Prevents `IndexOutOfBoundsException` since no index is used.

// #### **3. `while` Loop**
// A `while` loop is effective when the loop termination condition isn't based solely on the array's length.

// ```java
// public class Main {
//     public static void main(String[] args) {
//         int[] arr = {10, 20, 30, 40, 50};
//         int i = 0;
//         while (i < arr.length) {
//             System.out.println("Element at index " + i + ": " + arr[i]);
//             i++;
//         }
//     }
// }
// ```

// ---

// ### **Which Loop is the Most Effective?**

// - Use the **`for` loop** if:
//   - You need access to the array indices.
//   - You want to modify elements at specific indices.

// - Use the **`for-each` loop** if:
//   - You only need to read the array elements.
//   - You prioritize code readability and simplicity.

// - Use the **`while` loop** if:
//   - You need a loop with a condition that may depend on additional factors, not just array length.

// ---

// ### **Example Combining Initialization and Loops**

// ```java
// public class Main {
//     public static void main(String[] args) {
//         // Initializing array using direct method
//         int[] numbers = {1, 2, 3, 4, 5};

//         // Using for loop
//         System.out.println("Using for loop:");
//         for (int i = 0; i < numbers.length; i++) {
//             System.out.println("Index " + i + ": " + numbers[i]);
//         }

//         // Using for-each loop
//         System.out.println("\nUsing for-each loop:");
//         for (int num : numbers) {
//             System.out.println("Value: " + num);
//         }

//         // Using while loop
//         System.out.println("\nUsing while loop:");
//         int i = 0;
//         while (i < numbers.length) {
//             System.out.println("Index " + i + ": " + numbers[i]);
//             i++;
//         }
//     }
// }

// Construct a Java program featuring a menu-driven interface utilizing a switch-case structure. 
// Initially, users are prompted to input either 'a' or 't'. If 'a' is chosen, 
// the program requests the radius of a circle from the user. 
// Upon receiving the radius, if it is 0 or greater, the program computes the area of the circle and 
// presents the result; otherwise, it issues a message indicating that the area cannot be calculated. 
// In the case of 't' being entered, the program solicits three inputs from the user: the number, 
// the starting value for the table, and the ending value where the table should conclude. Subsequently, 
// it exhibits the table based on the provided inputs.

// import java.util.*;
// public class Practice {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a for radius of t for multiplication:");
//         char choice = sc.next().charAt(0);
//         switch (choice) {
//             case 'a':
//                 System.out.println("Enter the radius");
//                 double radius = sc.nextDouble();
//                 if (radius >= 0) {
//                     double area = Math.PI * radius * radius;
//                     System.out.println("The area of circle is: " + area);
//                 } else {
//                     System.out.println("Area Can't Calculated");
//                 }
//                 break;
//             case 't':
//                 System.out.println("Enter the number");
//                 int num = sc.nextInt();
//                 System.out.println("Enter the starting value");
//                 int start = sc.nextInt();
//                 System.out.println("Enter the ending value");
//                 int end = sc.nextInt();
//                 if (start <= end) {
//                     for (int i = start; i <= end; i++) {
//                         System.out.println(num + " * " + i + " = " + (num * i));
//                     }
//                 } else {
//                     System.out.println("Starting value less than ending value");
//                 }
//                 break;
//             default:
//                 System.out.println("Invalid choice");
//         }
//     }
// }

// Wrong code:
// public class Practice {
//     int calculateSum(int numbers){
//         int sum = 0;
//         for (int number : numbers){
//             sum += number;
//         }
//         return sum;
//     }
//     public static void main(String[] args) {
//         System.out.println(" " + calculateSum(1,2,2,3));
//     }
// }

// Correct code:
// public class Practice {
//     static int calculateSum(int... numbers){
//         int sum = 0;
//         for (int number : numbers){
//             sum += number;
//         }
//         return sum;
//     }
//     public static void main(String[] args) {
//         System.out.println(" " + calculateSum(1,2,2,3));
//     }
// }

// public class Practice {
//     public static void main(String[] args) {
//         int x = 1; // x represents an int value
//         int[] y = new int[10]; // y represents an array of int values
//         m(x, y); // Invoke m with arguments x and y
//         System.out.println("x is " + x);
//         System.out.println("y[0] is " + y[0]);
//     }

//     public static void m(int number, int[] numbers) {
//         number = 1001; // Assign a new value to number
//         numbers[0] = 5555; // Assign a new value to numbers[0]
//     }
// }

// public class Practice {
//     public static void main(String[] args) {
//         int number = 5;  // Factorial of 5 is 120
//         int factorial = 1 (0);  // Error here

//         for (int i = 1; i <= number; i++) {
//             factorial *= i;  // Error here
//         }

//         System.out.println("Factorial of " + number + " is: " + factorial);
//     }
// }

// public class Practice {
//     public static void main(String[] args) {
//         String str = "hello";
//         String reversed = "";

//         for (int i = str.length() - 1; i >= 0; i--) {  // <-- Error here ye line aese aye gii 
//             reversed += str.charAt(i);
//         }

//         System.out.println("Reversed String: " + reversed);
//     }
// }

// public class Practice {
//     public static void main(String[] args) {
//         int[] numbers = {12, 35, 1, 10, 34, 1};
//         int largest = 1;  // Error here

//         for (int i = 0; i < numbers.length; i++) {
//             if (numbers[i] > largest) {
//                 largest = numbers[i];
//             }
//         }

//         System.out.println("Largest Number: " + largest);
//     }
// }

// public class Practice {
//     public static void main(String[] args) {
//         int[] numbers = {12, 35, 1, 10, 34, 1};
//         int largest = numbers[0];
//         int secondLargest = numbers[0];

//         for (int i = 0; i < numbers.length; i++) {
//             if (numbers[i] > largest) {
//                 secondLargest = largest;
//                 largest = numbers[i];
//             } else if (numbers[i] > secondLargest && numbers[i] != largest) {
//                 secondLargest = numbers[i];
//             }
//         }

//         System.out.println("Second Largest Number: " + secondLargest);
//     }
// }

// public class Practice {
//     public static void main(String[] args) {
//         int[] numbers = {2, 3, 4, 5, 6, 7, 8, 9, 10};
//         int sum = 0;
//         for (int i = 0; i < numbers.length; i++) {
//             if (isPrime(numbers[i])) {  // Error here, checking for even numbers if (numbers[i] % 2 == 0) iski jagah
//                 sum += numbers[i];
//             }
//         }
//         System.out.println("Sum of prime numbers: " + sum);
//     }
//     public static boolean isPrime(int n) {
//         if (n <= 1) {
//             return false;
//         }
//         for (int i = 2; i <= n / 2; i++) {
//             if (n % i == 0) {
//                 return false;
//             }
//         }
//         return true;
//     }
// }

// Develop a program for the Karachi Meteorological Department to manage rainfall data for predetermined districts. 
// The district comprises 34 areas. The program should be able to input rainfall data in millimeters and provide the following statistics:
// • Identify the area with the highest rainfall.
// • Identify the area with the lowest rainfall in millimeters.
// Calculate the average daily rainfall.
// Additionally, the program should display the rainfall statistics in terms of millimeters for each area in descending order.

// import java.util.Scanner;
// public class Practice {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int totalAreas = 3;
//         String[] areas = new String[totalAreas];
//         double[] rainfall = new double[totalAreas];
//         for(int i = 0; i < totalAreas; i++){
//             System.out.println("Enter Area " + (i + 1) + " name:");
//             areas[i] = sc.nextLine();
//             System.out.println(areas[i] + " have rainfall in mm:");
//             rainfall[i] = sc.nextDouble();
//             sc.nextLine();
//         }
//         double totalRainfall = 0;
//         int maxRainfall = 0;
//         int minRainfall = 0;
//         for(int i = 0; i < totalAreas; i++){
//             totalRainfall += rainfall[i];
//             if (rainfall[i] > rainfall[maxRainfall]) {
//                 maxRainfall = i;
//             }
//             if (rainfall[i] < rainfall[minRainfall]) {
//                 minRainfall = i;
//             }          
//         }
//         double averageRainfall = totalRainfall / totalAreas;
//         for(int i = 0; i < totalAreas - 1; i++){
//             for (int j = i + 1; j < totalAreas; j++) {
//                 if(rainfall[i] < rainfall[j]){
//                     double temp = rainfall[i];
//                     rainfall[i] = rainfall[j];
//                     rainfall[j] = temp;
//                     String tempArea = areas[i];
//                     areas[i] = areas[j];
//                     areas[j] = tempArea;
//                 }
//             }
//         }
//         System.out.println("Areas with highest rainfall is: " + areas[maxRainfall]);
//         System.out.println("Areas with lowest rainfall is: " + areas[minRainfall]);
//         System.out.println("Average rainfall is: " + averageRainfall);       
//         System.out.println("\nAreas in descending order: ");
//         for(int i = 0; i < totalAreas; i++){
//             System.out.println(areas[i] + ": " + rainfall[i] + " mm");
//         }
//     }
// }

// You are developing a student management system for a school. 
// The school wants you to implement a feature where you store the marks of students in five subjects 
// and calculate the following for each student:

// import java.util.Scanner;
// public class Practice {

//     public static void main(String[] args) {
//         Scanner sc  = new Scanner(System.in);
//         int [] marks = new int[5];
//         int totalMarks = 0;
//         boolean isFailed = false;
//         System.out.println("Enter Marks of 5 subjects");
//         for (int i = 0; i < 5; i++){
//             System.out.println("Subject" + " " + (i + 1) + ":");
//             marks[i] = sc.nextInt();
//         }
//         for (int i = 0; i < 5; i++){
//             totalMarks += marks[i];
//         }
//         double average = totalMarks / 5.0;
//         if(average < 40){
//             isFailed = true;
//         }
//         System.out.println("Total Marks: " + totalMarks);
//         System.out.println("Average Marks: " + average);
//         if(isFailed){
//             System.out.println("Student Failed");
//         }
//         else{
//             System.out.println("Student Passed");
//         }
//     }
// }

// Quick revision of Arrays:

// import java.util.*;
// public class Practice{
//     public static void main(String[] args) {
//         int[] marks = new int[5];
//         for (int i = 0; i < marks.length; i++){
//             marks[i] = (int)(Math.random() * 100) + 1;           
//         }
//         System.out.println("Random Marks: ");
//         for (int i = 0; i < marks.length; i++) {
//             System.out.println("Subject " + (i + 1) + ": " + marks[i]);
//         }
//     }
// }

// reverse array:

// import java.util.*;
// public class Practice {

//     public static void main(String[] args) {
//         int num[] = new int[5];
//         for (int i = 0; i < num.length; i++){
//             num[i] = (int)(Math.random() * 100) + 1;
//         }
//         System.out.println("Original Array: ");
//         for (int i = 0; i < num.length; i++){
//             System.out.println("Index " + i + " = " + num[i]);
//         }
//         System.out.println("Reverse Array: ");
//         for (int i = num.length - 1; i >= 0; i--){ // ye step sabse kaam ka hai
//             System.out.println("Index " + i + " = " + num[i]);
//         }
//     }
// }

// Linear Searching ka concept:

// import java.util.*;
// public class Practice {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter size of Array: ");
//         int size = sc.nextInt();
//         sc.nextLine();
//         boolean found = false;
//         String names[] = new String[size];
//         for (int i = 0; i < names.length; i++) {
//             System.out.println("Enter Name " + (i + 1) + ":");
//             names[i] = sc.nextLine();
//         }
//         System.out.println("\n Enter Name to Search: ");
//         String search = sc.nextLine();
//         for (int i = 0; i < names.length; i++) {
//             if (names[i].equals(search)) {
//                 System.out.println(search + " found at Index: " + i);
//                 found = true;
//                 break;
//             }
//         }
//         if (!found) {
//             System.out.println(search + " not found");
//         }
//     }
// }

// Print ascending order in array:

// import java.util.*;
// public class Practice {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int[] a = new int[5];
//         System.out.println("Enter 5 numbers: ");
//         for (int i = 0; i < a.length; i++){
//             a[i] = sc.nextInt();
//         }
//         for(int i = 0; i < a.length; i++){
//             for(int j = 0; j < a.length; j++){
//                 if(a[i] < a[j]){
//                     int temp = a[i];
//                     a[i] = a[j];
//                     a[j] = temp;
//                 }
//             }
//         }
//         for(int i = 0; i < a.length; i++){
//             System.out.print(a[i] + " ");
//         }
//     }
// }

// Print descending order in array:

// import java.util.*;
// public class Practice {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int[] a = new int[5];
//         System.out.println("Enter 5 numbers: ");
//         for (int i = 0; i < a.length; i++){
//             a[i] = sc.nextInt();
//         }
//         for(int i = 0; i < a.length; i++){
//             for(int j = i + 1; j < a.length; j++){
//                 if(a[i] < a[j]){ // bss iss ko less than karna hai agla element greater hoga tou woh pehle ajaye ga
//                     int temp = a[i];
//                     a[i] = a[j];
//                     a[j] = temp;
//                 }
//             }
//         }
//         for(int i = 0; i < a.length; i++){
//             System.out.print(a[i] + " ");
//         }
//     }
// }

// Arrays methods- sort(), equals() and copyOf():

// Sort = array ko by default ascending order mai sort kardeta hai (Bacho waala)

// import java.util.*;
// public class Practice {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int[] a = new int[5];
//         System.out.println("Enter numbers in array:");
//         for(int i = 0; i < a.length; i++){
//             a[i] = sc.nextInt();
//         }
//         Arrays.sort(a); // ye predefine class hai java ke util package mai isko call karna parta hai
//         for(int i = 0; i < a.length; i++){
//             System.out.print(a[i] + " ");
//         }
//     }
// }

// equal = array ko compare karke batata hai ke equal hai ki nahi hai

// import java.util.*;
// public class Practice {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int[] a = new int[5];
//         int[] b = new int[5];
//         System.out.print("Enter data in first array");
//         for(int i = 0; i < a.length; i++){
//             a[i] = sc.nextInt();
//         }
//         System.out.print("Enter data in second array ");
//         for(int i = 0; i < b.length; i++){
//             b[i] = sc.nextInt(); 
//         }
//         boolean c = Arrays.equals(a, b); // ye predefine class hai java ke util package mai isko call karna parta hai
//         System.out.println("Is Both Array Equal: " + c);
//     }
// }

// Copyof = aik array ka data dosri array mai store krwa dega.

// import java.util.*;
// public class Practice{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int[] a = new int[5];
//         System.out.println("Enter numbers in array:");
//         for(int i = 0; i < a.length; i++){
//             a[i] = sc.nextInt();
//         }
//         int[] b = Arrays.copyOf(a,5);
//         System.out.println("Data in array 2");
//         for(int i = 0; i < a.length; i++){
//             System.out.print(b[i] + " ");
//         }
//     }
// }

// (==) operator khali reference variable yani array ki variable ke naam se bani hogi usko dekhta 
// jabke (.equal) array ke element ko bhi compare karta hai ye aik static variable hai package mai define hai

// Find biggest number in array:
// import java.util.*;
// public class Practice {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int[] a = new int[5];
//         System.out.println("Enter numbers in array:");
//         for (int i = 0; i < a.length; i++){
//             a[i] = sc.nextInt();
//         }
//         int max = a[0];
//         for (int i = 1; i < a.length; i++){ // 1 se isiliye chale ga kyuke 0th index ki value pehle he max variable mai stored hai or use compare karwana hai
//             if(a[i] > max){ // compare karne ke baad array i ka element ko max variable mai stored karwa denge ager bara hua tou
//                 max = a[i];
//             }
//         }
//         System.out.println("Biggest number in array is: " + max);
//     }
// }

// Find smallest number in array:

// import java.util.*;
// public class Practice {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int[] a = new int[5];
//         System.out.println("Enter numbers in array:");
//         for (int i = 0; i < a.length; i++){
//             a[i] = sc.nextInt();
//         }
//         int min = a[0];
//         for (int i = 1; i < a.length; i++){ // 1 se isiliye chale ga kyuke 0th index ki value pehle he min variable mai stored hai or use compare karwana hai
//             if(a[i] < min){ // compare karne ke baad array i ka element ko min variable mai stored karwa denge ager bara hua tou
//                 min = a[i];
//             }
//         }
//         System.out.println("Biggest number in array is: " + min);
//     }
// }

// Insert item in array:

// import java.util.*;
// public class Practice {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter size of an array:");
//         int size = sc.nextInt();
//         int[] a = new int[size + 1]; // array mai element insert karne ke liye pehle he jagah banadi size + 1 karke
//         System.out.println("Enter numbers in array: ");
//         for (int i = 0; i < size; i++){
//             a[i] = sc.nextInt();
//         }
//         System.out.println("Enter array location: ");
//         int loc = sc.nextInt();
//         System.out.println("Enter number to insert: ");
//         int num = sc.nextInt();
//         for(int i = size; i > loc; i--){ // array ka kaam hai index (location) jo de hai usko khali karna
//             a[i] = a[i - 1];
//         } 
//         a[loc] = num; 
//         size++;
//         System.out.println("Inserted array is: ");
//         for(int i = 0; i < size; i++){
//             System.out.print(a[i] + " ");
//         }
//     }
// }

// Delete item in array:

// import java.util.*;
// public class Practice {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter size of an array: ");
//         int size = sc.nextInt();
//         int[] a = new int[size];
//         System.out.println("Enter numbers in array: ");
//         for (int i = 0; i < size; i++){
//             a[i] = sc.nextInt();
//         }
//         System.out.println("Enter array location: ");
//         int loc = sc.nextInt();
//         for(int i = loc; i < size - 1; i++){ // ye loop array mai number delete kare ga size - 1 isiliye kara kyuki aik number delete karana chah rahe hai
//             a[i] = a[i + 1];
//         }
//         size--; // ye size ko ghata ne ke liye
//         System.out.println("Deleted Array is: ");
//         for(int i = 0; i < size; i++){
//             System.out.print(a[i] + " ");
//         }
//     }
// }

// 2D Arrays banane ka tareeka:

// import java.util.*;
// public class Practice {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int[][] a = new int[2][2];
//         System.out.println("Enter numbers in Array: ");
//         for(int i = 0; i < 2; i++){ // ye rows ke liye hai
//             for(int j = 0; j < 2; j++){ // ye coloum ke liye
//                 a[i][j] = sc.nextInt();
//             }
//         }
//         System.out.println("Matrix: ");
//         for(int i = 0; i < 2; i++){ // ye rows ke liye hai
//             for(int j = 0; j < 2; j++){ // ye coloum ke liye
//                 System.out.print(a[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }

// Addition of two Matrix in Arrays: 
// import java.util.*;
// public class Practice {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int[][] a = new int[2][2];
//         int[][] b = new int[2][2];
//         int[][] c = new int[2][2];
//         System.out.print("Enter numbers in Matrix A: ");
//         for(int i = 0; i < 2; i++){
//             for(int j = 0; j < 2; j++){
//                 a[i][j] = sc.nextInt();
//             }
//         }
//         System.out.print("Enter numbers in Matrix B: ");
//         for(int i = 0; i < 2; i++){
//             for(int j = 0; j < 2; j++){
//                 b[i][j] = sc.nextInt();
//             }
//         }
//         for(int i = 0; i < 2; i++){
//             for(int j = 0; j < 2; j++){
//                 c[i][j] = a[i][j] + b[i][j];
//             }
//         }
//         System.out.println("Sum of Matix A & B is");
//         for(int i = 0; i < 2; i++){
//             for(int j = 0; j < 2; j++){
//                 System.out.print(c[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }

// Tranposing Matrix: (coloum rows or rows coloum banajti hai)

// import java.util.*;
// public class Practice {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("How many rows");
//         int rows = sc.nextInt();
//         System.out.println("How many coloums");
//         int coloums = sc.nextInt();
//         int[][] a = new int[rows][coloums];
//         System.out.println("Enter Matrix Numbers: ");
//         for(int i = 0; i < rows; i++){
//             for(int j = 0; j < coloums; j++){
//                 a[i][j] = sc.nextInt();
//             }
//         }
//         System.out.println("Transpose Matrix: ");
//         for(int i = 0; i < rows; i++){
//             for(int j = 0; j < coloums; j++){
//                 System.out.print(a[j][i] + " "); // i ki jagah j or j ki jagah i print karwa denge bss
//             }
//             System.out.println();
//         }
//     }
// }

// Mirror Matrix Using 2d Arrays: (coloum 1 coloum 2 hojata hai orr coloum 2 coloum 1)

// import java.util.*;
// public class Practice {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int[][] a = new int[2][2];
//         System.out.println("Enter Array numbers: ");
//         for(int i = 0; i < 2; i++){
//             for(int j = 0; j < 2; j++){
//                 a[i][j] = sc.nextInt();
//             }
//         }
//         System.out.println("Mirror Array is: ");
//         for(int i = 0; i < 2; i++){
//             for(int j = 1; j >= 2; j--){
//                 System.out.print(a[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }