// Basic java book:
// 1. print:
// System.out.print("Jo bhi likha hoo");
// java mai equal to == aese likhte hai
// || ke matlab or ke hote hai 

// har statement ke baad semicolon ; lagana zaroori hai 

// 2. println:
// Next line mai print karwane ke liye 

// 3. \n:
// ye bhi Next line mai print karwane ke liye 

// Example:
// public class App {
//     public static void main(String[] args){
//         System.out.println("Hello world in java\n");
//         System.out.println("Hello world in java\n");
//         System.out.print("Hello world in java");
//     }
// }

// public class App {
//     public static void main(String[] args) {
//         System.out.println("*\n");
//         System.out.println("**\n");
//         System.out.println("***\n");
//         System.out.println("****\n");
//     }
// }

// scope matlab variables memory mai kab tak stored rehte hai
// a or b aik variables hai
// int a = 25;
// int b = 10;

// Aik String mai value store karwayi hai 
// String name = "Tony Stark";

// different type of data different types ke block mai save hota jiska size same nahi hote

// variables in code:
// variables ko app change karsakte hai apni marzi se

// public class App {
//     public static void main(String[] args) {
//         String name = "Tony Stark";
//         int a = 25;
//         int b = 10;
//         int age = 20;
//         double price = 25.25;
// // jaise yaha per
//         b = 20;
//         name = "Iron man";
//     }
// }

// java is the typed language yani variable batane se pehle uska type batana parta hai 

// Data Types consist of two types:
// Primitive data types (Basic data types) cannot be customize
// Non Primitive data types (can be customize)

// Primitive Data types:
// java has 8 primitive data types having different memory sizes
// int, float, string, boolean, char, byte, short, long, double, void
// 1. byte has a memory of 1 byte or 8 bits
// 2. short
// 3. char has a memory of 2 bytes
// 4. boolean has memory of 1 byte
// 5. int has memory of 4 bytes
// 6. long  has memory of 8 bytes 
// 7. float has memory of 4 bytes
// 8. double has memory of 8 bytes
// 9. void has no memory size

// data types memory depend vary system to system this is x64 bit

// Non Primitive Data types:
// 1. String
// 2. Array
// 3. Class
// 4. Object
// 5 Interface

// Data types in code

// public class App {

//     public static void main(String[] args) {
//         int a = 30;
//         int b = 20;
// //isme sum aese hojata hai
//         int sum = a + b;
//         // System.out.println(sum);
// // isme subtract aese hojata hai        
//         int diff = a - b;
//         // System.out.println(diff)
// //isme multiply aese hojata hai
//         int mul = a * b;
//         System.out.println(mul);
//     }
// }

// java mai BODMAS rule nahi chalta 
// *, %, / has more value than + or -
// java calculate left to right

// public class App {

//     public static void main(String[] args) {
//         int a = 10;
//         int b = 5;
// // galat ans 
//         // int ans = a * b / a - b;
// // correct ans
//         int ans = (a * b) / (a - b);

//     }
// }

// java mai input lena:
// jaise out ke liye system.out isiliye input ke liye system.in
// sc or scanner is a class 
// sc se input liya name wali string mai save krwa diya or print karwliya name
// next function aik he token ya single word le ga
// poora sentence lene ke liye hame nextLine ka function run karna parega 
// nextInt integers ko input lene ke liye 
// nextFloat floating or decimal types ke numbers ko lene ke liye  

// import java.util.*;
// public class App {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
// // for single word
//         // String name = sc.next();
// //for sentence
//         String name = sc.nextLine();
//         System.out.println(name);
//     }
// }

// import java.util.*;

// public class App {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int sum = a + b;
//         System.out.println(sum);
//     }
// }

// Conditional Statement
// if else
// else if 
// switch
// break

// if else ka basic syntax

// if(condition){
// ager if statement false hojaye to run karega else
// }else{
//code
// }

//for example

// import java.util.*;
// public class App {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int age = sc.nextInt();
//         if (age > 18) {
//             System.out.println("You are an Adult");
//         }else{
//             System.out.println("You are a kid");
//         }
//     }
// }

// % name: modulus calculate remainder
// % isse odd or even check karne ka tareeka ye hota hai
// jin do numbers ko divide karne se remainder completely zero ajaye woh even kehlate hai
// jin do numbers ko divide karne se remainder completely zero nahi aye woh odd kehlata hai

// import java.util.*;
// public class App {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         if (num % 2 == 0) {
//             System.out.println("Even number");
//         }else{
//             System.out.println("Odd number");
//         }
//     }
// }

// import java.util.*;
// public class App {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int num1 = sc.nextInt();
//         int num2 = sc.nextInt();
//         if (num1 == num2) {
//             System.out.println("Number is equal");
//         }else{
//             if (num1 > num2) {
//                 System.out.println("Num1 is greater");
//             }else{
//                 System.out.println("Num1 is lesser");
//             }
//         }
//     }
// }

// else ke ander saari if ki statement likhne se code saaf nahi lag raha 
// tou java mai iske aik solution hai usko kehte hai else if statements 
// basic code:

// if (condition 1){
// code
// }else if (condition 2){
// code
// }else{
// code
// }

// import java.util.*;
// public class App {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         if (a == b) {
//             System.out.println("a is equal to b");
//         }
//         else if(a > b){
//             System.out.println("a is greater than b");
//         }
//         else{
//             System.out.println("a is lesser than b");
//         }
//     }
// }

// import java.util.*;
// public class App {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int button = sc.nextInt();
//         if (button == 1) {
//             System.out.println("Hello");
//         }
//         else if (button == 2) {
//             System.out.println("salam");
//         }
//         else if (button == 3) {
//             System.out.println("Namaste");
//         }else{
//             System.out.println("Invalid button");
//         }
//     }
// }

// Switch/break
// basic code:

// switch(variable){
//     case1:
// code
// break
//     case2: 
// code
// break
//     case3:
// code
// break
//     default:
// }

// import java.util.*;
// public class App {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int button = sc.nextInt();
//         switch (button){
//             case 1 : System.out.println("Hello");
//             break;
//             case 2 : System.out.println("Salam");
//             break;
//             case 3 : System.out.println("Namaste");
//             break;
//             default: System.out.println("Invalid"); 
//         }
//     }
// }

// Question:
// 1. Make a Calculator. Take 2 numbers (a & b) from the user and an operation as follows : 
// 	1 : + (Addition) a + b
// 2 : - (Subtraction) a - b
// 3 : * (Multiplication) a * b
// 4 : / (Division) a / b
// 5 : % (Modulo or remainder) a % b
// Calculate the result according to the operation given and display it to the user.

// Answer:
// import java.util.*;
// public class App {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter number 1");
//         int num1 = sc.nextInt();
//         System.out.println("Enter number 2");
//         int num2 = sc.nextInt();
//         System.out.println("Enter operation");
//         System.out.println("Enter 1 for Addition");
//         System.out.println("Enter 2 for Subtraction");
//         System.out.println("Enter 3 for Multiplication");
//         System.out.println("Enter 4 for Division");
//         System.out.println("Enter 5 for Modulo");
//         int operation = sc.nextInt();
//         int result = 0;

//         switch (operation){

//             case 1 : 
//             result = num1 + num2;
//             System.out.println("Result is " + result);
//             break;
//             case 2 : 
//             result = num1 - num2;
//             System.out.println("Result is " + result);
//             break;
//             case 3 : 
//             result = num1 * num2;
//             System.out.println("Result is " + result);
//             break;
//             case 4 : 
//             result = num1 / num2;
//             System.out.println("Result is " + result);
//             case 5 : 
//             result = num1 % num2;
//             System.out.println("Result is " + result);
//             break;
//             default: System.out.println("invalid number");             
//         }
//     }
// }

// Question: 
// Ask the user to enter the number of the month & print the name of the month.
// For eg - For ‘1’ print ‘January’, ‘2’ print ‘February’ & so on

// Answer
// import java.util.*;
// public class App {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number of month");
//         int month = sc.nextInt();
//         if (month == 1) {
//             System.out.println("January");
//         }
//         else if (month == 2) {
//             System.out.println("February");
//         }
//         else if (month == 3) {
//             System.out.println("March");
//         }
//         else if (month == 4) {
//             System.out.println("April");
//         }
//         else if (month == 5) {
//             System.out.println("May");
//         }
//         else if (month == 6) {
//             System.out.println("June");
//         }
//         else if (month == 7) {
//             System.out.println("July");
//         }
//         else if (month == 8) {
//             System.out.println("August");
//         }
//         else if (month == 9) {
//             System.out.println("September");
//         }
//         else if (month == 10) {
//             System.out.println("October");
//         }
//         else if (month == 11) {
//             System.out.println("November");
//         }
//         else if (month == 12) {
//             System.out.println("December");
//         }else{
//             System.out.println("Invalid month");
//         }
//     }
// }

// Loops:
// 1. for loop
// 2. While loop
// 3. do while loop

// 1.basic code for loop:
// for(intialization; condition; updation){
//     code
// }
// Intialization: agar hame 100 baar hello world print karna hai tou aik counter variable le lenge jiski intial value zero hogi or iske baad semicolon ata hai
// updation: counter mai plus 1 karte jaye gy counter koi bhi int hosakta hai iske baad bhi semicolon ata hai 
// condition: terminating condition loop kab tak chalna chaiye 
// Infinite loop: condition hata de tou infinite loop lag jaye ga jo jab tak chalta rahega jab tak memory full na hojaye

// Infinite loop:
// public class App {
//     public static void main(String[] args) {
//         for(int counter = 0; ; counter = counter + 1){
//             System.out.println("Hello world");
//         }
//     }
// }

// Infinite loop:
// public class App {

//     public static void main(String[] args) {
//         for(; ;) {
//             System.out.println("Apna College");
//         }
//     }
// }

// public class App {
//     public static void main(String[] args) {
//         for(int counter = 0; counter < 10; counter = counter + 1){
//             System.out.println("Hello world");
//         }
//     }
// }

// public class App {

//     public static void main(String[] args) {
//         for(int counter = 0; counter < 100; counter = counter + 1){
//             System.out.println("Hello world");
//         }
//     }
// }

// single line mai lene ke liye System.out.println(arg + " ");

// Question: Print the Number from 0 to 10 by using for loop:

// import java.util.*;

// public class App {
// counter++ or i++ => Increment operator matlab counter + 1 hota hai
// counter-- or i-- => Decrement operator matlab counter - 1 hota hai
//     public static void main(String[] args) {
//        for(int counter = 0; counter < 100; counter++){
//         System.out.println(counter + " ");
//        }      
//     }
// }

// counter ko hum i se bhi represent karsakte hai jaise
// Dry run: bina coding kare apne code ko dekhna cheeze kaise chal rahi hai 

// import java.util.*;

// public class App {
//     public static void main(String[] args) {
//         for(int i = 0; i < 100; i++){
//             System.out.println(i + " ");
//         }      
//     }
// }

// 2.basic code for while loop
// while(condition){
//     code
// }

// public class App {

//     public static void main(String[] args) {
//         int i = 0;
//         while (i < 11) {
//             System.out.println(i);
//             i = i + 1; // or we can write i++; 
//         }
//     }
// }

// 3.basic code for do while loop
// do{
//     code
// }While(condition)

// public class App {

//     public static void main(String[] args) {
//         int i = 0;
//         do {
//             System.out.println(i);
//             i = i + 1;
//         }while(i < 11);
//     }
// }

// < = less than
// > = greater than
// <= = less than equal to
// >= = greater than equal to

// Q: Print the sum of n = 4 Natural numbers:

// import java.util.*;
// public class App {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int sum = 0;
//         for(int i = 0; i <= n; i++){
//             sum = sum + i;
//         }
//         System.out.println("Sum of first " + n + " natural numbers is " + sum);
//     }
// }

// Q: Print the table of a number input by the user

// import java.util.*;
// public class App {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();      
//         for(int i = 1; i <= 10; i++){     
//             System.out.println(i + " * " + n + " = " + (i * n));
//         }
//     }
// }

// Question: Make a menu driven program. The user can enter 2 numbers, either 1 or 0. 
// If the user enters 1 then keep taking input from the user for a student’s marks(out of 100). 
// If they enter 0 then stop.
// If he/ she scores :
// Marks >=90 -> print “This is Good”
// 89 >= Marks >= 60 -> print “This is also Good”
// 59 >= Marks >= 0 -> print “This is Good as well”
// 	Because marks don’t matter but our effort does.
// (Hint : use do-while loop but think & understand why)

// import java.util.*;
// public class App {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int choice;
//         do {
//             System.out.println("Enter 1 to enter marks or 0 to exit");
//             choice = sc.nextInt();
//             if(choice == 1){
//                 System.out.println("Enter marks out of 100");
//                 int marks = sc.nextInt();
//                 if(marks >= 90 && marks <= 100){
//                     System.out.println("This is Good");
//                 }
//                 else if(marks >= 60 && marks <= 89){
//                     System.out.println("This is also Good");
//                 }
//                 else if(marks >= 0 && marks <= 58){
//                     System.out.println("This is also Good");
//                 }
//                 else{
//                     System.out.println("Invalid marks");
//                 }
//             }

//         } while (choice != 0);
//         System.out.println("Ended");
//     }
// }

// Q: Print if a number is prime or not (Input n from the user). 
// [In this problem you will learn how to check if a number is prime or not]

// import java.util.*;

// public class App {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         // Input a number from the user
//         System.out.println("Enter a number to check if it's prime:");
//         int n = sc.nextInt();

//         // Prime check logic inside the main method
//         if (n <= 1) {
//             System.out.println(n + " is not a prime number.");
//         } else {
//             boolean Prime = true;

//             // Check divisibility from 2 up to the square root of n
//             for (int i = 2; i <= Math.sqrt(n); i++) {
//                 if (n % i == 0) {
//                     Prime = false;
//                     break;  // Exit the loop as soon as a divisor is found
//                 }
//             }

//             // Output result based on the flag
//             if (Prime) {
//                 System.out.println(n + " is a prime number.");
//             } else {
//                 System.out.println(n + " is not a prime number.");
//             }
//         }

//         sc.close();
//     }
// }

// Print Patterns:

// Print a rigid rectangle
// Nested loops:
// import java.util.*;
// public class App {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a coloums number");
//         int n = sc.nextInt();
//         System.out.println("Enter a rows number");
//         int m = sc.nextInt() ;
//         for(int i = 1; i <= n; i++){
//             for(int j = 1; j <= m; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// Print a Rectangle 
// import java.util.*;
// public class App {

//     public static void main(String[] args) {
//          Scanner sc = new Scanner(System.in);
//          System.out.println("Enter a length of rectangle");
//          int n = sc.nextInt();
//          System.out.println("Enter a breath of rectangle");
//          int m = sc.nextInt();
//          for(int i = 1; i <= n; i++){
//             for(int j = 1; j <= m; j++){
//                 if (i == 1 || j == 1 || i == n || j == m) {
//                    System.out.print("*"); 
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//          }
//     }
// }

// Draw a pattern of half paramid

// import java.util.*;
// public class App {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter length of half paramid");
//         int n = sc.nextInt();
//         System.out.println("Enter breath of half paramid");
//         int m = sc.nextInt();
//         for(int i = 1; i <= n; i++){
//             for(int j = 1; j <= i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// Draw a pattern of invert half paramid

// import java.util.*;
// public class App {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter length of half paramid");
//         int n = sc.nextInt();
//         System.out.println("Enter breath of half paramid");
//         int m = sc.nextInt();
//         for(int i = n; i >= 1; i--){
//             for(int j = 1; j <= i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// Draw a pattern of right half parmid

// import java.util.*;
// public class App {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter length of half paramid");
//         int n = sc.nextInt();
//         System.out.println("Enter breath of half paramid");
//         int m = sc.nextInt();
//         for(int i = 1; i <= n; i++){
//             // inner loop for space
//             for(int j = 1; j <= n-i; j++){
//                 System.out.print(" ");
//             }
//             // inner loop for stars
//             for(int j = 1; j <= i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// Q: Print the pattern of numbers half paramid:

// import java.util.*;
// public class App {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter length of half paramid");
//         int n = sc.nextInt();
//         System.out.println("Enter breath of half paramid");
//         int m = sc.nextInt();
//         for(int i = 1; i <= n; i++){
//             for(int j = 1; j <= i; j++){
//                 System.out.print(j+" ");
//             }
//             System.out.println();
//         }
//     }
// }

// Explaination: j <= i hai tou i = 1 hoga tou j = 1 hojaye ga i = 2 hoga tou j = 1 2 hpjaye and so on

// Q: inverted half paramid of numbers:

// import java.util.*;
// public class App {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter length of half paramid");
//         int n = sc.nextInt();
//         System.out.println("Enter breath of half paramid");
//         int m = sc.nextInt();
//         for(int i = n; i >= 1; i--){
//             for(int j = 1; j <= i; j++){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }

// Q: Draw the pattern of Floyd's triangle

// import java.util.*;
// public class App {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter length of half paramid");
//         int n = sc.nextInt();
//         System.out.println("Enter breath of half paramid");
//         int m = sc.nextInt();
//         for(int i = 1; i <= n; i++){
//             for(int j = 1; j <= i; j++){
//                 System.out.print(m+" ");
//                 m++;
//             }
//             System.out.println();
//         }
//     }
// }

// Q: Print the pattern of 0-1 Triangle:

// import java.util.*;
// public class App {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter length of half paramid");
//         int n = sc.nextInt();
//         System.out.println("Enter breath of half paramid");
//         int m = sc.nextInt();
//         for(int i = 1; i <= n; i++){
//             for(int j = 1; j <= i; j++){
//                 int sum = i + j;
//                 if (sum % 2 == 0) {
//                     System.out.print("1 ");
//                 }
//                 else{
//                     System.out.print("0 ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }

// Q: Print a pattern of solid rhombus.

// import java.util.*;
// public class App {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter length of half paramid");
//         int n = sc.nextInt();
//         System.out.println("Enter breath of half paramid");
//         int m = sc.nextInt();
//         for(int i = 1; i <= n; i++){
//             for(int j = 1; j <= n - i; j++){
//                 System.out.print(" ");
//             }
//             for(int j = 1; j <= n; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// Explanation: hamne n ki value 4 daali or i numbers of rows bhi 4 hogi tou n -(minus) 1 
// hamare paas spaces ajaye gii inner loop mai jaise 4-1 = 3 spaces

// Q: Print a pattern of number pyramid.

// import java.util.*;
// public class App {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter number of rows");
//         int n = sc.nextInt();
//         System.out.println("Enter breath of half paramid");
//         int m = sc.nextInt();
//         for(int i = 1; i <= n; i++){
//             for(int j = 1; j <= n - i; j++){
//                 System.out.print(" ");
//             }
//             for(int j = 1; j <= (2 * i - 1); j++){
//                 System.out.print(i);
//             }
//             System.out.println();
//         }
//     }
// }

// Explanation: hamne input liya jo n hai tou jab i hamare paas 1 hoga tab n jo hamare paas input tha for example 4 tha
// 4 i se minus hoga jo 3 banta hai tou three gaps ajaye gy left se tou i jo 1 hai 2 se multiply hota hai or - 1 karke jitne numbers
// aate eoh print hojate hai jaise i =1 tha tou 2 * 1 = 2 - 1 = 1 or 2 * 2 = 4 - 1 = 3 aese  

// Q: Print a pattern of palindromic number pyramid. 

// import java.util.*;
// public class App {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter number of rows");
//         int n = sc.nextInt();
//         System.out.println("Enter breath of half paramid");
//         int m = sc.nextInt();
//         for(int i = 1; i <= n; i++){
//             for(int j = 1; j <= n - i; j++){
//                 System.out.print(" ");
//             }
//             for(int j = 1; j <= i; j++){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }

// Q: Print the pattern of butterfly 

// import java.util.Scanner;

// public class App {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter number of rows");
//         int n = sc.nextInt();
//         // for upper half 
//         for(int i = 1; i <= n; i++){
//            for(int j = 1; j <= i; j++){
//             System.out.print("*");
//            }
//            for(int j = 1; j <= 2 * (n - i); j++){
//             System.out.print(" ");
//            }
//            for(int j = 1; j <= i; j++){
//             System.out.print("*");
//            }
//            System.out.println();
//         }
//         // for lower half
//         // kuch nahi karna khali iss bar i n se 1 tak jaye ga
//         for(int i = n; i >= 1; i--){
//             for(int j = 1; j <= i; j++){
//              System.out.print("*");
//             }
//             for(int j = 1; j <= 2 * (n - i); j++){
//              System.out.print(" ");
//             }
//             for(int j = 1; j <= i; j++){
//              System.out.print("*");
//             }
//             System.out.println();
//          }
//     }
// }
// Explanation: n hamne 4 input diya tou pehle waale loop se tou numbers of rows ajaye gi dosre waale loop mai j i tak chal jaye ga * chaap de ga phir teesra loop
// se spaces chap jaye gi 2 * (n - i) ki tarah jaise i = 1 hoga tou n = 4 tha tou n - i yani 4 - 1 = 3 or 2 * 3 = 6 hojata hai aese  2 3 or 4 ke liye bhi print hogi
// phit chauthe loop se bache hoye stars chal jaye gy j 1 se i tak chal jaye ga phir isko invert karde gy jisme sirf n = 4 hone pr i greter 1 ke hai tou 4 stars print honge
// or i - 1 hone per yani 1 - 1 = 0 spaces print hongi and so on       

// import java.util.*;
// public class App {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter length of half paramid");
//         int n = sc.nextInt();
//         System.out.println("Enter breath of half paramid");
//         int m = sc.nextInt();
//         for(int i = 1; i <= n; i++){
//             for(int j = 1; j <= n - i; j++){
//                 System.out.print(" ");
//             }
//             for(int j = 1; j <= n; j++){
//                 if(i == 1 || i == n || j == 1 || j == n){
//                     System.out.print("*");
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }

// Q: Print a pattern of number paramid

// import java.util.*;
// public class App {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the length of triangle");
//         int n = sc.nextInt();
//         for(int i = 1; i <= n; i++ ){
//             for(int j = 1; j <= n - i; j++){
//                 System.out.print(" ");
//             }
//             for(int j = 1; j <= i; j++){
//                 System.out.print(i + " ");
//             }
//             System.out.println();
//         }
//     }
// }

// Explanation: pehla loop tou waise he kaam karega dosra loop mai n yani 5 n - 1 spaces create hojaye gi yani 5 - 1 = 4
// tisre loop mai i print hojaye ga space ke sath beech maii spacing ke liye 

// Q: Draw the pattern of palindromic paramid

// import java.util.*;
// public class App {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the length of triangle");
//         int n = sc.nextInt();
//         for(int i = 1; i <= n; i++){
//             // for Spaces
//             for(int j = 1; j <= n - i; j++){
//                 System.out.print(" ");
//             }
//             // for 1st half numbers
//             for(int j = i; j >= 1; j--){
//                 System.out.print(j);
//             }
//             // for 2nd half numbers
//             for(int j = 2; j <= i; j++){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }

// Explanation: pehla loop rows print kare ga dosra loop mai n-i yani 5 - 1 or 2 mai 4 or 3 spaces ajaye gi teesre loop mai 
// i 1 se lekar ulta chale ga jaise 5 4 3 2 1  or dosre loop mai i 2 se leker i yani 5 tak chale ga kyu ke 1 tou single print hota hai

// Q: Draw the Rocket pattern 

// import java.util.*;
// public class App {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter number of rows");
//         int n = sc.nextInt();
//         for(int i = 1; i <= n; i++){
//             // for spaces 
//             for(int j = 1; j <= n - i; j++){
//                 System.out.print(" ");
//             }
//             // for printing stars
//             for(int j = 1; j <= (2 * i - 1); j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//             for(int k = n - 1; k >= 1; k--){
//                 for(int j = 1; j <= n - i; j++){
//                     System.out.print(" ");
//                 }
//                 for(int j = 1; j <= (2 * i - 1); j++){
//                     System.out.print("*");
//                 }
//             System.out.println();
//             }
//         }
//     }
// }

// Q: Draw the pattern of diamond

// import java.util.*;
// public class App {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter number of rows");
//         int n = sc.nextInt();
//         for(int i = 1; i <= n; i++){
//             // for spaces 
//             for(int j = 1; j <= n - i; j++){
//                 System.out.print(" ");
//             }
//             // for printing stars
//             for(int j = 1; j <= (2 * i - 1); j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//         //Lower half kuch nahi bass ulta kardena hai 
//         for(int k = n; k >= 1; k--){
//             // for spaces 
//             for(int j = 1; j <= n - k; j++){
//                 System.out.print(" ");
//             }
//             // for printing stars
//             for(int j = 1; j <= (2 * k - 1); j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         } 
//     }
// }

// Loops revision

// 2*n se even numbers generate hote or 2*n+1 se odd numbers generate hote hai

// sum aik iteration app usme baar baar cheeze iterate kara rahe hoo

// For loop

// Table print 
// import java.util.*;
// public class App {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter number for table");
//         int n = sc.nextInt();
//         for(int i = 1; i <= 10; i++){
//             int mul = n * i; 
//             System.out.println(n + " * " + i + " = " + mul);
//         }
//     }
// }

// sum natural numbers
// import java.util.*;
// public class App {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number of sum");
//         int n = sc.nextInt();
//         int sum = 0;
//         for(int i = 1; i <= n; i++){
//             sum = sum + i;
//         }
//         System.out.println("The sum of natural numbers " + n + " is " + sum);
//     }
// }

// sum of odd numbers and even numbers 

// import java.util.*;
// public class App {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number");
//         int n = sc.nextInt();
//         int sumOdd = 0;
//         int sumEven = 0;
//         for(int i = 1; i <= n; i++){
//             if(i % 2 == 0){
//                 sumEven = sumEven + i;
//             }
//             else{
//                 sumOdd = sumOdd + i;
//             }
//         }
//         System.out.println("The sum of odd numbers is " + sumOdd);
//         System.out.println("The sum of even numbers is " + sumEven);
//     }
// }

// factorial calculation:
// import java.util.*;
// public class App {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number");
//         int n = sc.nextInt();
//         int fact = 1;
//         for(int i = 1; i <= n; i++){
//             fact = fact * i;
//         }
//         System.out.println("The factorial of " + n + " is " + fact);
//     }
// }

// While loops

// import java.util.*;
// class App {
//     public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter marks of subject");
//        int totalSubjects = 5;
//        int subjectCount = 1;
//        int totalMarks = 0;
//        while (subjectCount <= totalSubjects) {
//         System.out.println("Enter the marks of " + subjectCount + ": ");
//         int marks = sc.nextInt();
//         totalMarks = totalMarks + marks;
//         subjectCount++;        
//        }
// // isme float lagana parega agar jawab decimal mai chahiye tou
//        float per = (float) totalMarks / (totalSubjects * 100) * 100;
//        System.out.println("\n------MarkSheet------");
//        System.out.println("Total Marks: " + totalMarks + "out of " + (totalMarks * 100)); 
//        System.out.println("Percentage: " + per + "%");
//     }
// }

// Check if a Number is Prime using while loop

// import java.util.*;
// public class App {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number");
//         int n = sc.nextInt();
//         int i = 2;
//         // boolean Define kare gy ke Prime number true hona chahiye 
//         boolean Prime = true;
//         // ager number less or equal n ke hoga tou 2 se divide hojaye ga
//         while (i <= n / 2) {
//         // or divide huya number ka remainder 0 ke equal hojaye ga tou loop break hojaye ga 
//             if (n % i == 0){
//                 Prime = false;
//                 break;
//             }
//             i++;
//         }
//         if (Prime){
//             System.out.println(n + " is a Prime number"); 
//         }
//         else{
//             System.out.println(n + " is not a Prime number");
//         }
//     }
// }

// Q: Find the Greatest Common Divisor (GCD) using while loop

// import java.util.*;
// public class App {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the first number");
//         int a = sc.nextInt();
//         System.out.println("Enter the second number");
//         int b = sc.nextInt();
//         while (a != b) {
//             if (a > b) {
//                 a = a - b;
//             }
//             else{
//                 b = b - a; 
//             }
//         }
//         System.out.println("GCD is "+ a);
//     }
// }

// Do While loop

// Do while loop mai aik baar statement run hokar condition check hoti agar true hogi tou loop dobara chale ga 
// otherwise nahi chale ga 

// import java.util.*;
// public class App {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter number");
//         int i = sc.nextInt();
//         do {
//             System.out.println(i);
//             i++;
//         } while (i <= 10);
//             System.out.println("out of loop");
//     }
// }

// import java.util.*;
// class App {
//     public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter marks of subject");
//        int totalSubjects = 5;
//        int subjectCount = 1;
//        int totalMarks = 0;
//        do { 
//         int marks = sc.nextInt();
//         totalMarks = totalMarks + marks;
//         subjectCount++;
//        } while (subjectCount <= totalMarks);
//        float per = (float) (totalMarks / (totalSubjects * 100)) * 100;
//        System.out.println("Percentage is " + per);
//     }
// }

// print half paramid with while loops

// public class App {

//     public static void main(String[] args) {
//         int n = 5;
//         int i = 1;
//         while (i <= n){
//             int j = 1;
//             while (j <= i){
//                 System.out.print("* ");
//                 j++;
//             }
//             System.out.println();
//             i++;
//         }
//     }
// }

// print half paramid with while loops with Alphabets

// public class App {

//     public static void main(String[] args) {
//         int n = 5;
//         int i = 1;
//         while (i <= n){
//             int j = 1;
//             char letter = 'A';
//             while (j <= i){
//                 System.out.print(letter + " ");
//                 letter++;
//                 j++;
//             }
//             System.out.println();
//             i++;
//         }
//     }
// }

// print half paramid with while loops with continous Alphabets

// public class App {

//     public static void main(String[] args) {
//         int n = 5;
//         int i = 1;
//         char letter = 'A';
//         while(i <= n){
//             int j = 1;
//             while(j <= i){
//                 System.out.print(letter + " ");
//                 letter++;
//                 j++;
//             }
//             System.out.println();
//             i++;
//         }
//     }
// }

// print half paramid with for loops with continous Alphabets

// public class App {

//     public static void main(String[] args) {
//         int n = 5;
//         char letter = 'A';
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(letter + " ");
//                 letter++;
//             }
//             System.out.println();
//         }
//     }
// }

// print half paramid with for loops with Alphabets

// public class App {

//     public static void main(String[] args) {
//         int n = 5;
//         for (int i = 1; i <= n; i++){
//             char letter = 'A';
//             for (int j = 1; j <= i; j++){
//                 System.out.print(letter + " ");
//                 letter++;
//             }
//             System.out.println();
//         }
//     }
// }

// print half paramid with do while loops with Alphabets

// public class App {

//     public static void main(String[] args) {
//         int n = 5;
//         int i = 1;
//         do {
//             int j = 1;
//             char letter = 'A';
//             do {
//                 System.out.print(letter + " ");
//                 letter++;
//                 j++;
//             } while (j <= i);
//             System.out.println();
//             i++;
//         } while (i <= n);
//     }
// }


// public class App {

//     public static void main(String[] args) {
//         int n = 5;
//         int i = 1;
//         char letter = 'A';
//         do { 
//             int j = 1;
//             do { 
//                 System.out.print(letter + " ");
//                 letter++;
//                 j++;
//             } while (j <= i);
//             System.out.println();
//             i++;
//         } while (i <= n);
//     }
// }