// Arrays: List of items of same types
// basic code for Arrays:
// new is a keyword used for taking new space in memory
// yani non primitive data type ko space dilane ke liye ham new keyword ka use karte hai
// type[]arrayName = newtype[size]
// int[] marks = new int[3]
// for 1st subject marks[0] likhde ge
// memory mai array(index) 0 se shuru hoti hai yani 0 phir 1,2,3,4... 
// har aik array ke sath aik length variable associated hota hai is vairable mai stored hoga array ka size 

// Example code:
// import java.util.*;
// public class Arrays {
// // yaha per bhi hamne string type ka array input liya hai jiska naam hai args jisme ham bohot saare inputs store kara sakte hai
//     public static void main(String[] args) {
//         // int[] marks = new int[3];
//         int marks[] = new int[3]; // bhi valid syntax hai
//         marks[0] = 97;
//         marks[1] = 59;
//         marks[2] = 88;
//         // System.out.println(marks); is tarah ye ([I@372f7a8d) ye garbage value print hogi
//         // System.out.println(marks[0]);
//         // System.out.println(marks[1]);
//         // System.out.println(marks[2]);
//         for(int i = 0; i < 3; i++){
//             System.out.println(marks[i]);
//         }
//     }
// }

// 2nd method to store an array:
// basic code:
// type[]arrayName = {1,2,3,4,5,6};
// Example code:
// import java.util.*;
// public class Arrays {

//     public static void main(String[] args) {
//         int marks[] = {97, 59, 66};
//         for(int i = 0; i < 3; i++){
//             System.out.println(marks[i]);
//         }
//     }
// }

// import java.util.*;
// public class Arrays {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//        int numbers[] = new int[size];

//        // Input ke liye
//        for(int i = 0; i < size; i++){
//         numbers[i] = sc.nextInt();
//        }

//        // Output ke liye
//        for(int i = 0; i < size; i++){
//         System.out.println(numbers[i]);
//        }
//     }
// }

// Linear Searching: New Technique First Algorithm

// Q: Take an array as input from the user. Search for given number x and print the index of which it occurs
// import java.util.*;
// public class Arrays {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         int numbers[] = new int[size];
//         for(int i = 0; i < size; i++){
//             numbers[i] = sc.nextInt();
//         }
//         // x ki value ham de denge 
//         int x = sc.nextInt();
//         for (int i = 0; i < numbers.length; i++){
//             // x ki value poori array mai find hogi or value jab equal hojaye gii array se tou woh print hojaye gii
//             if (numbers[i] == x){
//                 System.out.println("x found at index: " + i);
//             }
//         }
//     }
// }

// Take an array of names as input from the user and print them on the screen.
// import java.util.*;
// public class Arrays {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         String names[] = new String[size];
//         for(int i = 0; i < size; i++){
//             names[i] = sc.next();
//         }
//         String x = sc.next();
//         for(int i = 0; i < names.length; i++){
//             if(names[i] .equals(x)){
//                 System.out.println(x + " is found at index of " + i);
//             }
//         }
//     }
// }

// Find the maximum & minimum number in an array of integers. [HINT : Read about Integer.MIN_VALUE & Integer.MAX_VALUE in Java]

// import java.util.*;
// public class Arrays {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         int numbers[] = new int[size];
//         for(int i = 0; i < size; i++){
//             numbers[i] = sc.nextInt();
//         }
//         int max = Integer.MIN_VALUE;
//         int min = Integer.MAX_VALUE;
//         for (int i = 0; i < numbers.length; i++){
//             if (numbers[i] < min){
//                 min = numbers[i];
//             }
//             if (numbers[i] > max){
//                 max = numbers[i];
//             }
//         }
//         System.out.println("Largest Number is: " + max);
//         System.out.println("Largest Number is: " + min);
//     }
// }

// Take an array of numbers as input and check if it is an array sorted in ascending order.
// Eg : { 1, 2, 4, 7 } is sorted in ascending order.
//      {3, 4, 6, 2} is not sorted in ascending order.

// import java.util.*;
// public class Arrays {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         int numbers[] = new int[size];
//         for(int i = 0; i < size; i++){
//             numbers[i] = sc.nextInt();
//         }
//         boolean isAscending = true;
//         for (int i = 0; i < numbers.length - 1; i++){
//             if (numbers[i] > numbers[i+1]){
//                 isAscending = false;
//             }
//         }
//         if(isAscending){
//             System.out.println("Array is in Ascending order");
//         }
//         else{
//             System.out.println("Array is not in Ascending order");
//         }
//     }
// }

// Combine above both questions

// import java.util.*;
// public class Arrays {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         int numbers[] = new int[size];
//         for(int i = 0; i < size; i++){
//             numbers[i] = sc.nextInt();
//         }
//         int max = Integer.MIN_VALUE;
//         int min = Integer.MAX_VALUE;
//         boolean isAscending = true;

//         for (int i = 0; i < numbers.length; i++){
//             if (numbers[i] > max){
//                 max = numbers[i];
//             }
//             if (numbers[i] < min){
//                 min = numbers[i];
//             }
// // i < numbers.length - 1 i array ke last element tak chalega or numbers[i] > numbers[i+1] check karega ke pehle number se baad wala number baa hoo
//             if (i < numbers.length - 1 && numbers[i] > numbers[i+1]){
//                 isAscending = false;
//             }
//         }
//         if(isAscending){
//             System.out.println("Array is in Ascending order");
//         }
//         else{
//             System.out.println("Array is not in Ascending order");
//         }
//         System.out.println("Maximum number is: " + max);
//         System.out.println("Minimum number is: " + min);
//     }
// }

// Take input of temperature of 30 days & find maximum temperature minimum temperature or average temperature

// import java.util.*;
// public class Arrays {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int days = sc.nextInt();
//         double[] temp = new double[days];
//         System.out.println("Enter Temperature of " + days);
//         for(int i = 0; i < days; i++){
//             System.out.println("Day " + (i + 1) + ": ");
//             temp[i] = sc.nextDouble();
//         }
//         double max = temp[0];
//         double min = temp[0];
//         double sum = 0;
//         // loop tab tak chalega jo numbers of day diye honge upar temp ki array
//         for(int i = 0; i < temp.length; i++){
//             // ye check karega gy temp max hai array mai jaise first number 23 diya or agla 25 tou ye pehle waale se compare karke agla dikhaye ga ke min hoga ke max
//             if(temp[i] > max){
//                 max = temp[i];
//             }
// ye bhi uper waale ki tarah chalega pehli value se compare karke bataye ga ke agla min hai ke max
//             if(temp[i] < min){
//                 min = temp[i];
//             }
//             sum += temp[i];
//         }
//         double avg = sum / temp.length;
//         System.out.println("Maximum temperature is: " + max + "°C");
//         System.out.println("Minimum temperature is: " + min + "°C");
//         System.out.println("Average temperature is: " + avg + "°C");
//     }
// }

// Q: Find the Sum & Average of All Elements in an Array
// import java.util.*;
// public class Arrays {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the numbers in array");
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         for(int i = 0; i < n; i++){
//             arr[i] = sc.nextInt();
//         }
//         int sum = 0;
//         int avg = 0;
//         for(int i = 0; i < arr.length; i++){
//             sum += arr[i];
//             avg = sum / arr.length;
//         }
//         System.out.println("Sum if all elements in array is: " + sum);
//         System.out.println("Average if all elements in array is: " + avg);
//     }
// }

// Q: Count Even and Odd Numbers in an Array
// import java.util.*;
// public class Arrays {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the numbers in array");
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         for(int i = 0; i < n; i++){
//             arr[i] = sc.nextInt();
//         }
//         int evenCount = 0;
//         int oddCount = 0;
//         for(int i = 0; i < arr.length; i++){
//             if (arr[i] % 2 == 0) {
//                 evenCount++;
//             }
//             else{
//                 oddCount++;
//             }
//         }
//         System.out.println("Even Numbers: " + evenCount);
//         System.out.println("Odd Numbers: " + oddCount);
//     }
// }

// Q: Advance problem of Deck Of Cards generating four random cards from 52 cards

// public class Arrays {
//     public static void main(String[] args) {
//         int[] deck = new int[52];
//         String[] suits = { "Spades", "Hearts", "Diamonds", "Clubs" };
//         String[] ranks = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9",
//                 "10", "Jack", "Queen", "King" };

//         // Initialize the cards
//         for (int i = 0; i < deck.length; i++)
//             deck[i] = i;

//         // Shuffle the cards
//         for (int i = 0; i < deck.length; i++) {
//             // Generate an index randomly
//             int index = (int) (Math.random() * deck.length);
//             int temp = deck[i];
//             deck[i] = deck[index];
//             deck[index] = temp;
//         }

//         // Display the first four cards
//         for (int i = 0; i < 4; i++) {
//             String suit = suits[deck[i] / 13];
//             String rank = ranks[deck[i] % 13];
//             System.out.println("Card number " + deck[i] + ": "
//                     + rank + " of " + suit);
//         }
//     }
// }

// 2D Arrays: Simple different boxes ka collection aik rectangle form mai milta hai jiske ander rows and coloums hote hai unhe 2d array kaha jata hai
// har block mai datatype ka aik element store hota hai
// memory consumption nikalne ke liye (rows x coloum) x datatype array ki
// Basic code:

// type[][]arrayName = new type[rows][columns];
// for Example:
// int[][] numbers = new int[3][5];

// do square brackets lagane ka maqsad 2d arrays 2 dimension mai hai

// import java.util.*;
// public class Arrays {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter no. of rows");
//         int rows = sc.nextInt();
//         System.out.println("Enter no. of columns");
//         int cols = sc.nextInt();
//         int[][] numbers = new int[rows][cols];
//         // for input
//         for (int i = 0; i < rows; i++) {
//             for (int j = 0; j < cols; j++) {
//                 numbers[i][j] = sc.nextInt();
//             }
//         }
//         // for output
//         for (int i = 0; i < rows; i++) {
//             for (int j = 0; j < cols; j++) {
//                 System.out.print(numbers[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }

// Linear Search

// Q: Take a matrix as input form the user search for a given number x
// and print the indicate at which it occurs

// import java.util.*;
// public class Arrays {

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter no. of rows");
// int rows = sc.nextInt();
// System.out.println("Enter no. of columns");
// int cols = sc.nextInt();
// int numbers[][] = new int[rows][cols];
// for (int i = 0; i < rows; i++){
// for (int j = 0; j < cols; j++){
// numbers[i][j] = sc.nextInt();
// }
// }
// System.out.println("Enter the number to search");
// int x = sc.nextInt();
// for (int i = 0; i < rows; i++){
// for (int j = 0; j < cols; j++){
// if (numbers[i][j] == x){
// System.out.println("Number found at row: " + i + " and column: " + j);
// }
// }
// }
// }
// }

// Q: Print the spiral order matrix as output for a given matrix of numbers.
// [Difficult for Beginners]

// import java.util.*;
// public class Arrays {

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter no. of rows");
// int n = sc.nextInt();
// System.out.println("Enter no. of cols");
// int m = sc.nextInt();
// int[][] matrix = new int[n][m];
// for (int i = 0; i < n; i++){
// for (int j = 0; j < m; j++){
// matrix[i][j] = sc.nextInt();
// }
// }
// System.out.println("The Spiral Order of matrix is: ");
// int rowStart = 0;
// int rowEnd = n - 1;
// int colStart = 0;
// int colEnd = m - 1;
// while (rowStart <= rowEnd && colStart <= colEnd){
// for (int col = colStart; col <= colEnd; col++){
// System.out.print(matrix[rowStart][col] + " ");
// }
// rowStart++;
// for (int row = rowStart; row <= rowEnd; row++){
// System.out.print(matrix[row][colEnd] + " ");
// }
// colEnd--;
// for (int col = colEnd; col >= colStart; col--){
// System.out.print(matrix[rowEnd][col] + " ");
// }
// rowEnd--;
// for (int row = rowEnd; row >= rowStart; row--){
// System.out.print(matrix[row][colStart] + " ");
// }
// colStart++;
// }
// System.out.println();
// }
// }

// Strings:

// User se String input lene ke liye
// String Declaration: Capital letter shuru mai
// import java.util.*;
// public class Arrays {
// public static void main(String[] args) {
// // Scannner is also non primitive datatype
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter your name: ");
// // Single word ko input lene ke liye
// // String name = sc.next();
// // Poori line ko input lene ke liye
// String name = sc.nextLine();
// System.out.println("Your name is: " + name);
// }
// }

// Functions in Strings: There are reusable functions in java
// 1. Concatenation: Do Strings ko jorna
// public class Arrays {

// public static void main(String[] args) {
// String firstName = "Syed";
// String lastName = "Ahmed";
// // inline bhi String join karsakte hai or ye beech wali String automatically
// delete hojaye gi kyuki hamne isko variable mai nahi rakha
// String fullName = firstName + " " + lastName;
// System.out.println(fullName);
// }
// }

// 2. Length: String ki length lene ke liye
// public class Arrays {

// public static void main(String[] args) {
// String firstName = "Syed";
// String lastName = "Ahmed";
// String fullName = firstName + " " + lastName;
// System.out.println(fullName);
// System.out.println(fullName.length());
// }
// }

// 3. charAt: Characters print karwane ka function

// public class Arrays {

// public static void main(String[] args) {
// String firstName = "Syed";
// String lastName = "Ahmed";
// String fullName = firstName + " " + lastName;
// // Characters baar baar print karane ke liye loop
// // function call karke length maaloom karli simple
// for(int i = 0; i < fullName.length(); i++){
// // charAt function uss character ko leker aata hai jo index hamne paas kiya
// // har index ka charcter individual print hojaye ga
// System.out.println(fullName.charAt(i));
// }
// }
// }

// 4. Compare: Comparing two strings
// .compareto ka function
// public class Arrays {

// public static void main(String[] args) {
// String name1 = "Ahmed";
// String name2 = "Ahmed";
// // compareTo Method check 3 cases
// // 1. String1 > String2: return positive value
// // 2. String1 == String2: return zero value
// // 3. String1 < String2: return negative value
// // compareTo pata aese lagata hai bari or choti value ka character ke number
// se jaise a ki value sabse choti hogi or z ki value sabse bari hogi
// // pehla character jo dissimilar hota hai uski larai hoti hai or jo bara hota
// woh jeet jata hai
// if (name1.compareTo(name2) == 0){
// System.out.println("Both strings are equal");
// }
// else{
// System.out.println("Both strings are not equal");
// }
// }
// }
// == kisi cases mai fail bhi hojate hai
// jaise iss case mai

// public class Arrays {

// public static void main(String[] args) {
// new String = non primitive types ko declare karne ka bhi tareeka hai
// if(new String("Ahmed") == new String("Ahmed")){
// System.out.println("Strings are Equal");
// }
// else{
// System.out.println("Strings are not Equal");
// }
// }
// }

// Sub String: aik bari string ka chota part nikalna

// public class Arrays {

// public static void main(String[] args) {
// String sentence = "My name is Ahmed";
// // substring = aik begining index leta hai or aik ending index leta hai
// // ending index se aik index pehle tak include hoga ending index include nahi
// hota
// String name = sentence.substring(11, sentence.length());
// System.out.println(name);
// }
// }

// public class Arrays {

// public static void main(String[] args) {
// String sentence = "SyedAhmed";
// String name = sentence.substring(0);
// System.out.println(name);
// }
// }

// Strings are Immutable: if you created String once you can't change it again

// public class Arrays {
// public static void main(String[] args) {
// String name1 = "Ahmed";
// String name2 = "Ahmedii";
// if(name1.equals(name2)){
// System.out.println("Strings are equal");
// }
// else{
// System.out.println("Strings are not equal");
// }
// }
// }

// ParseInt: String ko Integer mai convert karta hai only
// public class Arrays {

// public static void main(String[] args) {
// String str = "123";
// int num = Integer.parseInt(str);
// System.out.println(num);
// }
// }

// toString: Integer ko String mai convert karta hai
// public class Arrays {

// public static void main(String[] args) {
// int num = 123;
// String str = Integer.toString(num);
// System.out.println(str);
// System.out.println(str.length());
// }
// }

// Take an array of Strings input from the user & find the cumulative (combined)
// length of all those strings.
// import java.util.*;
// public class Arrays {

// public static void main(String[] args) {
// Scanner sc = new Scanner (System.in);
// System.out.println("Enter size of string");
// int size = sc.nextInt();
// String[] arr = new String[size];
// int sum = 0;
// for(int i = 0; i < size; i++){
// System.out.println("Enter string");
// arr[i] = sc.next();
// sum = sum + arr[i].length();
// }
// System.out.println("Combined length of strings is: " + sum);
// }
// }

// import java.util.*;
// public class Arrays {

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter size of string");
// int size = sc.nextInt();
// String[] arr = new String[size];
// String combinedString = "";
// for(int i = 0; i < size; i++){
// System.out.println("Enter name");
// arr[i] = sc.next();
// combinedString = combinedString + arr[i] + " ";
// }
// System.out.println("Combined string is: " + combinedString);
// }
// }

// Input a string from the user. Create a new string called ‘result’ in which
// you will replace the letter ‘e’ in the original string with letter ‘i’.
// Example :
// original = “eabcdef’ ; result = “iabcdif”
// Original = “xyz” ; result = “xyz”
// replace ke keyword se charAt replace hojate hai
// import java.util.*;
// public class Arrays {

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter number of string");
// int size = sc.nextInt();
// String[] arr = new String[size];
// String result = "";
// for(int i = 0; i < size; i++){
// System.out.println("Enter names");
// arr[i] = sc.next();
// result = result + arr[i].replace("e", "i") + " ";
// }
// System.out.println("Result is: " + result);
// }
// }

// import java.util.*;
// public class Arrays {

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter name");
// String str = sc.next();
// String result = "";
// for (int i = 0; i < str.length(); i++){
// if(str.charAt(i) == 'e'){
// result = result + "i";
// }
// else{
// result = result + str.charAt(i);
// }
// }
// System.out.println("Result is: " + result);
// }
// }

// Input an email from the user. You have to create a username from the email by
// deleting the part that comes after ‘@’. Display that username to the user.
// import java.util.*;
// public class Arrays {

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter Email");
// String email = sc.next();
// String username = email.split("@")[0];
// System.out.println("Username is: " + username);
// }
// }

// import java.util.*;
// public class Arrays {

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter Email");
// String email = sc.next();
// String userName = "";
// for (int i = 0; i < email.length(); i++){
// if(email.charAt(i) == '@'){
// break;
// }
// else{
// userName = userName + email.charAt(i);
// }
// }
// System.out.println("Username is: " + userName);
// }
// }

// Strings Builder
// Strings are immutable memory ke ander strings ka heaps create hote hai tou
// thora sa time lagta hai
// String builder khali aik jagah point hota jahan memory stored hai jiski wajah
// se time kam lagta hai
// String Builder Declaration
// import java.util.*;
// public class Arrays {

// public static void main(String[] args) {
// // sb naam ki string bannali
// StringBuilder sb = new StringBuilder("Ahmed");
// System.out.println(sb);
// // hame print karwana hai character at index zero(0)
// System.out.println(sb.charAt(0));
// // hame character replace bhi kar sakte hai uske liye setcharAt ka function
// use hota hai jisme 2 parameters diye jaate hai
// // aik woh index jahan change karna hai or dosara woh jo change karna hai
// sb.setCharAt(0, 'R');
// System.out.println(sb);
// }
// }

// ham inserting bhi karsate hai stringbuilder mai
// public class Arrays {

// public static void main(String[] args) {
// StringBuilder sb = new StringBuilder("Ahmed");
// System.out.println(sb);
// // iss mai do parameters upar ki tarah honge
// sb.insert(2, 'h');
// System.out.println(sb);
// // for deleting extra characters
// // ending index is not included end se pehle waale tak include hota hai jitne
// ziada character hatane hai utna index lele
// sb.delete(2, 3);
// System.out.println(sb);
// }
// }

// ham string ke end mai bhi characters jor sakte hai
// concatenation mai har dafa aik nayi string ban rahi hoti lekin append mai aik
// he string mai baar baar changes hoti hai
// import java.util.*;
// public class Arrays {

// public static void main(String[] args) {
// StringBuilder sb = new StringBuilder("h");
// sb.append('e');
// sb.append('l');
// sb.append('l');
// sb.append('o');
// System.out.println(sb);
// // length() ka function bhi chalta hai
// System.out.println(sb.length());
// }
// }

// Reverse array create karni hai
// import java.util.*;
// public class Arrays {

// public static void main(String[] args) {
// StringBuilder sb = new StringBuilder("hello");
// // ham loops ki help se reapeat kare gy loop chalye 0 se half length tak
// // sirf half waale characters ko reverse karne ki zaroorat hai
// for (int i = 0; i < sb.length()/2; i++){
// int front = i;
// // pehle carcter ko ham last mai phenk rahe hai yani 4th index par yani 5 - 0
// - 1
// int back = sb.length() - 1 - i; // 5-1-0 => 4
// // abb character dekh lete hai fornt per or back per
// char frontChar = sb.charAt(front);
// char backChar = sb.charAt(back);
// // ab replace karne ke liye setCharAt ka istemaal kare gy
// sb.setCharAt(front, backChar);
// sb.setCharAt(back, frontChar);
// }
// System.out.println(sb);
// }
// }

// Practice Questions:
// Write a Java program that reads a number in inches, converts it to meters.
// Note: One inch is 0.0254 meter.
// import java.util.*;
// public class Arrays {

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter numbers in inches");
// double inches = sc.nextDouble();
// double meters = inches * 0.0254;
// System.out.println(inches + " inches is equal to " + meters + " meters");
// }
// }

// Write a Java program to convert days into number of months and days.
// import java.util.*;
// public class Arrays {

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter number of days");
// int days = sc.nextInt();
// int months = days / 30;
// int remainingDays = days % 30;
// System.out.println(days + " = " + months + " months & " + remainingDays + "
// days");
// }
// }

// Write a Java program to compute body mass index (BMI).
// import java.util.*;
// public class Arrays {

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter your weight in kg");
// double weight = sc.nextDouble();
// System.out.println("Enter your height in feets");
// double height = sc.nextDouble();
// double heightInMeters = height * 0.3048;
// double BMI = weight / (heightInMeters * heightInMeters);
// if (BMI < 18.5){
// System.out.println("You're underweight");
// }
// else if (BMI < 25){
// System.out.println("You're normal");
// }
// else if (BMI < 30){
// System.out.println("You're overweight");
// }
// else{
// System.out.println("You're obese");
// }
// }
// }

// Operators & Binary Number System:

// a + b = (+) is operator & (a) or (b) are operands
// usaully maths mai operands ke beech mai aik operator hota hai or isko binary
// operators kehte hai

// Arithmatic operators = There are two types of operators
// 1. Binary Operators:
// + - * / or %(modulus/remainder)
// 2. Unary Operators: 2 operands nahi balke aik operands per kaam karte hai or
// aik operand hone ki wajah se inhe unary operator kaha jata hai
// ++(increment) or --(decrement)
// simply a + 1 = a++ or a - 1 = a--
// Increment Operators: There are Two types of increment operators.
// 1. Pre Increment (++a): Pre yani pehle. change value then use value
// 2. Post Increment (a++): Post yani baad mai. use value then change value

// Post Increment:
// public class Arrays {

// public static void main(String[] args) {
// int a = 10;
// int b = 0;
// b = a++;
// System.out.println(a);
// System.out.println(b);
// }
// }

// Pre Increment:
// public class Arrays {

// public static void main(String[] args) {
// int a = 10;
// int b = 0;
// b = ++a;
// System.out.println(a);
// System.out.println(b);
// }
// }

// Decrement Operators: There are Two types of increment operators.
// 1. Pre decrement (--a): Pre yani pehle. change value then assign the value.
// 2. Post decrement (a--): Post yani baad mai. assign value then change value.

// Pre decrement
// public class Arrays {

// public static void main(String[] args) {
// int a = 10;
// int b = 0;
// b = --a;
// System.out.println(a);
// System.out.println(b);
// }
// }

// Post Decrement
// public class Arrays {

// public static void main(String[] args) {
// int a = 10;
// int b = 0;
// b = a--;
// System.out.println(a);
// System.out.println(b);
// }
// }

// Relational Operators = 2 operands ke beech mai relation batate hai
// == : Equal to
// != : Not Equal to
// > : greater than
// < : less than
// <= : greater than equal to
// >= : less than equal to

// Logical Operators = Check Statement Logically correct or not
// && : And (2 logic ko combine karna)
// || : OR (aik statement true or dosri false ho)
// ! : Not (Statement reverse krde ga True ko false false ko true karde ga)

// Decimal Number System: Normal Mathmatics counting (0 1 2 3 4 5 6 7 8 9)
// Binary Number System: Based on 0 & 1
// 1 --> True
// 0 --> False

// Bit Wise Operators = for Bit Manipulation
// & = (Binary AND), && is Logical and Different
// for Example:
// A = 0 1 0 1
// B = 0 1 1 0
// ---------------
// A & B = 0 1 0 0

// | = (Binary OR), || is Logical and Different
// for Example:
// A = 0 1 0 1
// B = 0 1 1 0
// ---------------
// A | B = 0 1 1 1

// ^ = (Binary XOR), Simalar values return (True), dissimalar values return
// (False)
// for Example
// A = 0 1 0 1
// B = 0 1 1 0
// ----------------
// A ^ B = 0 0 1 1

// ~ = (Binary One's complement), convert 1 to 0 or 0 to 1
// for example:
// A = 0 1 0 1
// ~A = 1 0 1 0

// << = (Binary Left Shift), left side mai number ko khiskhane ke liye ke liye
// for example:
// A = 0 1 0 1
// A << 1 = 0 1 0 1 0 0

// >> = (Binary Right Shift) Right side mai number ko khiskhane ke liye ke liye
// For Example
// A = 0 1 0 1
// A >> 1 = 0 0 1 0

// Assignments Operators = values assign karne ke liye
// = : Assign value
// += : Add and assign value
// -= : Subtract and assign value
// *= : Multiply and assign value
// /= : Divide and assign value
// %= : Modulus and assign value
// ** : Exponent and assign value

// Bit Manipulation:
// 1. Get bit: kisi bhi poisition per jaana hai ke woh bit 0 hai ya 1 hai uske
// liye
// 2. Set bit: kisi bhi bit ko 1 banane ke liye
// 3. Clear bit: kisi bhi bit ko 0 banane ke liye
// 4. Update bit: update karne ke liye bit ko 0 se 1, 1 se 0 ke liye
// in saare operations ko java ke ander bit masking kehte hai or additional
// numbers ko ham kehte hai bit mask

// Right se left calculate karte hai position
// 1. Get Bit: Get the 3rd bit (position = 2) of a number n = (n = 0 1 0 1)
// Process:
// Bit Mask: 1<<i 0001 ko
// Operation: And

// Solving Method
// n = 0101 last bit ko 2 right move karenge
// i hamare paas 2 hai
// Bit Mask 1<<2 = 0100
// or And operation chala denge real number or bit mask ke beech
// 0 & 0 = 0
// 1 & 1 = 0
// 0 & 0 = 0
// 1 & 0 = 0
// 0101 & 0100 = 0100
// abb final number non zero hai tou bit 1 hogi otherwise complete zero per 0
// hogi

// import java.util.*;
// public class Arrays {

// public static void main(String[] args) {
// int n = 5;
// int pos = 3;
// int bitMask = 1 << pos;
// if((bitMask & n) == 0){
// System.out.println("Bit is 0");
// }
// else{
// System.out.println("Bit is 1");
// }
// }
// }

// 2. Set Bit: Set the 2nd bit (position = 1) of a number (n = 0 1 0 1)
// Process:
// Bit Mask: 1<<i 0001 ko
// Operation: OR

// Solving Method
// n = 0101 last bit ko 1 right move karenge
// i hamare paas 1 hai
// Bit Mask i<<1 = 0010
// or OR operation chala denge real number or bit mask ke beech
// 0 | 0 = 0
// 0 | 1 = 1
// 1 | 0 = 1
// 0 | 1 = 1
// 0010 | 0101 = 0111

// import java.util.*;
// public class Arrays {

// public static void main(String[] args) {
// int n = 5;
// int pos = 1;
// int bitMask = 1 << pos;
// int newNumber = bitMask | n;
// System.out.println(newNumber);

// }
// }

// Clear bit: clear the 3rd bit (position = 2) of a number (n = 0 1 0 1)
// Process:
// Bit Mask: 1<<i 0001 ko
// Operation: AND with Not

// Solving Method:
// n = 0001 ko 2 aage dakha denge 0100
// phir NOT nikale gy (not mai 0 1 or 1 0 hojata hai)
// 0100 NOT ~ 1011
// 1011 & 0101 = 0001

// public class Arrays {

// public static void main(String[] args) {
// int n = 0;
// int pos = 2;
// int bitMask = 1 << pos;
// int notBitMask = ~(bitMask);
// int newNumber = notBitMask & n;
// System.out.println(Integer.toBinaryString(newNumber));
// }
// }

// Update bit = Update the 2nd bit (position = 1) for number n to 1 (n = 0 1 0
// 1)
// Process:
// For 1:
// Bit Mask: 1<<i
// Operation: And with Not
// For 0:
// Bit Mask: 1<<i
// Operation: OR

// import java.util.Scanner;

// public class Arrays {

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("1 for set or 0 for clear");
// int oper = sc.nextInt();
// int n = 5; // 0101
// int pos = 1;
// int bitMask = 1 << pos; // set operation ke waqt
// if (oper == 1) {
// int newNumber = bitMask | n;
// System.out.println(Integer.toBinaryString(newNumber));
// }
// else{
// int newBitMask = ~(bitMask);
// int newNumber = newBitMask & n;
// System.out.println(Integer.toBinaryString(newNumber));
// }
// }
// }
// Write a program to find if a number is a power of 2 or not.
// public class Arrays {

// public static void main(String[] args) {
// int n = 3; // 0101
// if(n > 0 && (n & (n - 1)) == 0){
// System.out.println(n + " is a power of 2");
// }
// else{
// System.out.println(n + " is not a power of 2");
// }
// }
// }

// Write a program to toggle a bit a position = “pos” in a number “n”.

// import java.util.*;
// public class Arrays {
// public static void main(String[] args) {
// int n = 5;
// int pos = 1;
// int bitMask = 1 << pos;
// int newNumber = n ^ bitMask;
// System.out.println(Integer.toBinaryString(newNumber));
// }
// }

// Sorting in Java

// Buble Sorting: descending se ascending ki taraf sort karega yani sabse bara
// element end mai or sabse chota element shuru mai hoga
// jaise 78312 mai har 2 numbers compare honge or sabse bara number peeche ki
// taraf jata rahe ga

// import java.util.*;
// public class Arrays {
// public static void printArray(int arr[]){
// for(int i = 0; i < arr.length; i++){
// System.out.print(arr[i]+" ");
// }
// System.out.println();
// }

// public static void main(String[] args) {
// int arr[] = {7, 8, 3, 1, 2};
// Time Complexity = O(n^2)
// // bubble sorting
// // loop n - 1 iteration count karega
// // arr.length represent n
// for(int i = 0; i < arr.length - 1; i++){
// // abb jitne element sorted hai wo i ke equal hai or unko hatane ke liye of
// baaki element sort karne ka loop
// for(int j = 0; j < arr.length - i - 1; j++){
// // condition if lagaye gy agar index j pe jo element hai uski value greater
// hojati hai uske agle waale index element se tou unko apas mai swap kardena
// if(arr[j] > arr[j+1]){
// // temporary variable mai store karle gy j ki value ko
// int temp = arr[j];
// // ab array or j ko hamne temp variable mai store kara liya abb original
// khali arr mai aar[j+1] daal denge
// arr[j] = arr[j+1];
// // abb arr[j+1] arr[j] mai gaya tou arr[j+1] khali hogaya tou yaha per temp
// arr waali value store kara denge
// arr[j+1] = temp;
// // aese sabse basic tareeke se swapping karte hai
// }
// }
// }
// printArray(arr);
// }
// }

// Selection Sort: iss mai sabse chote number ko sabse aage le aate hai aik
// iteration mai aik swap karte hai

// public class Arrays {
// public static void printArray(int arr[]) {
// for(int i = 0; i < arr.length; i++){
// System.out.print(arr[i]+ " ");
// }
// System.out.println();
// }

// public static void main(String[] args) {
// int arr[] = {1,4,2,9,6,7,8,3,5,0,10};
// // selection sort
// // outer loop n - 1 times run karega
// for(int i = 0; i < arr.length - 1; i++){
// // smallest variable bana liya jaha smallest element ka index stored hai
// int smallest = i;
// // abb loop shuru hoga smallest element ke agle waale element se aage waale
// se compare karenge kyuki
// for (int j = i + 1; j < arr.length; j++){
// // yaha if statement lagaye gy smallest element j se bara hojata hai tou uss
// case mai j ko bara bana denge
// if (arr[smallest] > arr[j]){
// smallest = j;
// }
// }
// // end mai swap kardenge i ko apne smallest number ke sath taake woh shuru
// mai ajaye
// // temp variable bana lenge jaha sabse smallest value stored hojaye gii
// int temp = arr[smallest];
// // arr smallest mai arr i daal denge
// arr[smallest] = arr[i];
// // arr i mai smallest element ajaye ga joke stored hai temp variable mai
// arr[i] = temp;
// }
// printArray(arr);
// }
// }

// Insertion Sort: aik aik elemnt ko utha kar uski sahi jagah par place kardenge

// public class Arrays {
// public static void printArray(int arr[]) {
// for(int i = 0; i < arr.length; i++){
// System.out.print(arr[i] + " ");
// }
// System.out.println();
// }

// public static void main(String[] args) {
// int arr[] = {9,5,8,7,1,3,2,4,0,6};
// // Insetion sort
// // arry mai unsorted part abhi poori array hai siwaye pehle element ke usko
// maan lia sorted
// for(int i = 1; i < arr.length; i++){
// // jis current element ko uthana hai or uski sahi jagah par daalna hai woh
// hoga array of i
// int current = arr[i];
// // aik or variable leliya jo shuru hoga i - 1 se
// // sorted part ka last element utha liya
// int j = i - 1;
// // j ko tab tak use kar rahe hai jab tak j > 0 nahi hota
// // aik comparision banaya jaye ga hamare current or j ke beech mai jab tak
// current element chota tab tak uske liye jagah banayi jayi gii
// while (j >= 0 && current < arr[j]) {
// // jagah arr j+1 mai ham daal denge arr of j ki value ko
// arr[j+1] = arr[j];
// // or j k kardenge minus minus kyu ke hame tab tak chalna jab tak elements
// hai aik aik aage hote rahe gy elements
// j--;
// }
// // sabse chota elements shuru mai place karne ke liye
// // array of j + 1 mai daal denege apne cyrrent element ko
// arr[j+1] = current;
// }
// printArray(arr);
// }
// }

// ArrayList in java
// import java.util.ArrayList;
// class Arrays{
//     public static void main(String[] args) {
//         ArrayList<Integer> list = new ArrayList<Integer>();
//         // ArrayList<String> list2 = new ArrayList<>();
//         // ArrayList<Boolean> list3 = new ArrayList<>();
//         // add
//         list.add(0);
//         list.add(1);
//         list.add(2);
//         list.add(3);
//         // get
//         int element = list.get(3);
//         System.out.println(element);
//         // beech mai add karne ke liye
//         list.add(2, 39);
//         System.out.println(list);
//         // rewrite element
//         list.set(2, 800);
//         System.out.println(list);
//         // remove karne ke liye
//         list.remove(2);
//         System.out.println(list);
//     }
// }
// ------------------------------------------------Basic java Complete--------------------------------------------------------------