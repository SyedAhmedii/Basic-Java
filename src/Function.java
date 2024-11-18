// Functions: Java ke ander aesa block of code hota hai jo kuch input leta hai kuch operations karta hai or kuch output 
// return karta hai

// Example Code:

// returnType functionName(type arg1, type arg2...){
//     Operations
// }

// sabse pehle define karte hai return type ab ye written type ya tou int, float, string, saare data types hosakte hai
// abb java ka funtion aik he type ki value ko return karsakta hai ya int ya float ya string
// ye saare single value return karte hai jaise int hai tou interger type ka variable return hoga isi tarah float hai tou float type ke variable ko return karwa sakte hai
// iske saath function ka aik or special return type hota hai jisko ham kehte hai void 
// Void means "NO RETURN" jis bhi function ka type void likh lete hai tou woh function kuch return nahi karta 
// jaise public static void main, main function hota hai jiska return type void hai or public static 2 keywords hai 
// public static lagana lazmi hai har return type se pehle phir ajayga functionName ham kuch bhi de sakte hai 
// bas aik condition hai woh java ka koi keyword na hoo keywords woh hote jo java ki dictionary mai pehle se define hote hai
// un words ke meaning fixed hote hai 
// phir aate hai arguments yani inputs function ke paas jitne bhi inputs aate hai unhe ham arguments kahte hai 
// sabse pehle arguments ke liye define karte hai types jo kuch bhi hosakta hai int bhi float bhi string bhi boolean bhi & so on jaise:
// int age, float temp ye saare agument parenthesis ke ander likhte hai().
// function likhne ka tareeka hamesha camel case hota hai printMyName()
// argument aik he aye ga 
 

// for Example: Print a given name in a function:

// import java.util.*;
// public class Function {
//     // ab ham aik naya function denge
//     public static void myName(String name){
//         System.out.println(name);
//         // function se bahar nikalne ke liye return keyword ka use karte hai 
//         return;
//     }
// // jo function declared kiya hai uss function ke liye input le lete hai 
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter my name");
//         String name = sc.next();
//         // abb ham function myName call kare gy main funtion se
//         myName(name);
//     }
// }

// What happens in memory: 
// Memory mai functions stack ki form mai save hote hai 
// or memory mai aik stack store hone ko ham kehte hai stack frame
// jaise main function aik stack ki form mai save hogaya memory mai phir jaise he main function ne call lagayi myName function ko
// tou myName ka function ka stack bhi save hojata hai memory mai ab myName function ke jitne bhi variables honge woh sab iss stack mai save hote rahe gy
// or jab myName function value return karde ka tou memory se hat jaye ga

// Make a function to add 2 numbers and return the sum

// import java.util.*;
// public class Function {
//     // is baar function ki data type hogi int kyu ke do numbers ka sum return kare ga
//     public static int calculateSum(int num1, int num2){
//         int sum = num1 + num2;
//         return sum;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter first number");
//         int num1 = sc.nextInt();
//         System.out.println("Enter second number");
//         int num2 = sc.nextInt();
//         int sum = calculateSum(num1, num2);
//         System.out.println("Sum of num1 & num2: " + sum);
//     }
// }

// Arguments 2 tareeke se paas ho sakte hai ya tou by refrence pass hosakte hai ya by value pass hosakte hai

// Make a function to multiply 2 numbers and return the product 

// import java.util.*;
// public class Function {
//     public static int calculateProduct(int num1, int num2){
//         // int product = num1 * num2;
//         // return product;
//         // aik direct value bhi return kar sakte hai 
//         return num1 * num2;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter first number");
//         int num1 = sc.nextInt();
//         System.out.println("Enter second number");
//         int num2 = sc.nextInt();
//         // int product = calculateProduct(num1, num2);
//         // System.out.println("Product of num1 & num2: " + product);
//         // aik direct bhi print hosakta hai 
//         System.out.println("Product of num1 & num2: " + calculateProduct(num1, num2));
//     }
// }

// Factorial: n! = n x (n-1) x (n-2) x (n-3)....x 1 
// There is no factorial for negative numbers 
// for Example: 
// 2! = 2 x 1 = 2
// 3! = 3 x 2 x 1 = 6
// 4! = 4 x 3 x 2 x 1 = 24

// Find the Factorial of a number:

// import java.util.*;
// public class Function {
//     public static int calculateFactorial(int num){
//         if(num == 0 || num == 1){
//             return 1;
//         }
//         else{
//             return num * calculateFactorial(num - 1);
//         }
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number");
//         int n = sc.nextInt();
//         int factorial = calculateFactorial(n);
//         System.out.println("Factorial of " + n + " is: " + factorial);         
//     }
// }

// void function mai return keyword na bhi likhe tabhi chal jaye ga 

// import java.util.*;
// public class Function {
//     public static void printFactorial(int n){
//         if(n < 0){
//             System.out.println("Invalid Number");
//             // agar beech se return karna hoga tabhi return keywrd ayga
//             return;
//         }
//         int factorial = 1;
//         for(int i = n; i >= 1; i--){
//             factorial = factorial * i;
//         }
//         System.out.println("Factorial of " + n + " is: " + factorial);
//         return;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number");
//         int n = sc.nextInt();
//         // call lagaye gy upar waale function ko 
//         printFactorial(n);
//     }
// }

// Function ko ham call karte hai directly jabke methods ko call karne ke liye class ke objects ka istemaal karna parta hai 

// Make a function to check if a number is prime or not.

// import java.util.*;
// public class Function {
//     public static int calculatePrime(int n){
//         if(n <= 1){
// // Agar n ka value 1 ya us se chhota ho, to yeh function 0 return karega kyunki 1 aur us se chhote numbers prime nahi hote.
//             return 0;
//         }
// //Yahan pe loop 2 se le kar n ke half tak chal raha hai. Agar n kisi bhi number se poori tarah divide ho jata hai 
// // (remainder 0 aata hai), to yeh 0 return karta hai, matlab number prime nahi hai.
//         for(int i = 2; i <= n/2; i++){
//             if(n % i == 0){
//                 return 0;
//             }
//         }
// // Agar n kisi number se divide nahi hota, to 1 return karta hai, jo signal karta hai ke number prime hai.
//         return 1;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number");
//         int n = sc.nextInt();
//         int result = calculatePrime(n);
//         if(result == 1){
//             System.out.println(n + " is a prime number");
//         }
//         else{
//             System.out.println(n + " is not a prime number");
//         }
//     }
// }

// import java.util.*;
// public class Function {
//     public static int calculatePrime(int n){
//         if(n <= 1){
//             return 0;
//         }
//             for(int i = 2; i <= n/2; i++){
//                 if (n % i ==0){
//                     return 0;
//                 }
//             }
//             return 1;
//         }
    

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number");
//         int n = sc.nextInt();
//         int result = calculatePrime(n);
//         if(result == 1){
//             System.out.println(n + " is a prime number");
//         }
//         else{
//             System.out.println(n + " is not a prime number");
//         }
//     }
// }

// Make a function to check if a given number n is even or not.

// import java.util.*;
// public class Function {
//     public static void checkEven(int n){
//         if(n % 2 == 0){
//             System.out.println(n + " is a Even number");
//         }
//         else{
//             System.out.println(n + " is a Odd number");
//         }
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number");
//         int n = sc.nextInt();
//         checkEven(n);
//     }
// }

// Make a function to print the table of a given number n.

// import java.util.*;
// public class Function {
//     public static void printTable(int n){
//         for(int i = 1; i <= 100; i++){
//             int mul = n * i;
//             System.out.println(n + " * " + i + " = " + mul);
//         }
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number");
//         int n = sc.nextInt();
//         printTable(n);
//     }
// }

// Enter 3 numbers from the user & make a function to print their average.

// import java.util.*;
// public class Function {
//     public static void printAverage(int a, int b, int c){
//         float sum = a + b + c;// int bhi laga sakte hai float decimal numbers ke liye lagaya hai
//         float avg = sum / 3; // int bhi laga sakte hai float decimal numbers ke liye lagaya hai
//         System.out.println("Average of: " + a + " " + b + " " + c + " = " + avg);
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter first number");
//         int a = sc.nextInt();
//         System.out.println("Enter second number");
//         int b = sc.nextInt();
//         System.out.println("Enter third number");
//         int c = sc.nextInt();
//         printAverage(a, b, c);
//     }
// }

// Write a function to print the sum of all odd numbers from 1 to n.

// import java.util.*;
// public class Function {

//     public static void printSum(int n){
//         int sum = 0;
//         for(int i = 1; i <= n; i++){
//             if(i % 2 != 0){
//                 sum = sum + i;
//             }
//         }
//         System.out.println("sum of Odd numbers is: " + sum);
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number");
//         int n = sc.nextInt();
//         printSum(n);
//     }
// }

//Write a function which takes in 2 numbers and returns the greater of those two.

// import java.util.*;
// public class Function {
//     public static int greaterNumber(int a, int b){
//         if(a > b){
//             return a;
//         }
//         else{
//             return b;
//         }
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter First Number");
//         int a = sc.nextInt();
//         System.out.println("Enter Second Number");
//         int b = sc.nextInt();  
//         System.out.println("Greater Number is: " + greaterNumber(a, b));
//     }
// }

//Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.

// import java.util.*;
// public class Function {
// // idher string lagaye gy kyuki ham return mai value string mai lenge
//     public static String checkEligibility(int age){ 
//         if(age > 18){
//             return "Eligible to Vote";
//         }
//         else{
//             return"Not Eligible to Vote";
//         }
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter your age");
//         int age = sc.nextInt();
//         System.out.println(checkEligibility(age));
//     }
// }

// Write a function that takes in the radius as input and returns the circumference of a circle.

// import java.util.*;
// public class Function {
//     public static float calculateCircumference(float radius){
// // By default, Java treats decimal numbers as double. If you want to store a decimal number as a float, 
// // you must append f or F at the end of the number to tell Java that it's a float.
//         float pi = 3.14f;
//         return 2 * pi * radius;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the radius of the circle");
//         float radius = sc.nextFloat();
//         float circumference = calculateCircumference(radius);
//         System.out.println("The circumference of the circle is: " + circumference);
//     }
// }

// Write an infinite loop using do while condition

// import java.util.*;
// public class Function {

//    public static void main(String[] args) {
//     int i = 0;
//     do{
//         System.out.println(i);
//     }
//     while(i <= 10);
// } 
// }

// Write a program to enter the numbers till the user wants and at the end it should display
// the count of positive, negative and zeros entered.

// import java.util.*;
// public class Function {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int positive = 0;
//         int negative = 0;
//         int zero = 0;
        
//         while(true){
//             System.out.println("Enter a number (stop to exit)");
//             String input = sc.next();
//             if (input.equals("stop")){
//                 break;
//             }
//             int num = Integer.parseInt(input);
//             if (num > 0){
//                 positive++;
//             }
//             else if (num < 0){
//                 negative++;
//             }
//             else{
//                 zero++;              
//             }
//         }
//         System.out.println("Positive numbers: " + positive);
//         System.out.println("Negative numbers: " + negative);
//         System.out.println("Zero numbers: " + zero);
//     }
// }

// Two numbers are entered by the user, x and n. 
// Write a function to find the value of one number raised to the power of another i.e. xn.

// import java.util.*;
// public class Function {
//     public static int calculatePower(int x, int n){
//         int result = 1;
//         for(int i = 0; i < n; i++){
//             result = result * x;
//         }
//         return result;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number");
//         int x = sc.nextInt();
//         System.out.println("Enter the power");
//         int n = sc.nextInt();
//         int result = calculatePower(x, n);
//         System.out.println(x + " raised to the power: " + n + " = " + result);
//     }
// }

// Write a function that calculates the Greatest Common Divisor of 2 numbers.

// import java.util.*;
// public class Function {
//     public static int calculateGCD(int a, int b){
//         while(a != b){
//             if(a > b){
//                 a = a - b;
//             }
//             else{
//                 b = b - a;
//             }
//         }
//         return a;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter first number");
//         int a = sc.nextInt();
//         System.out.println("Enter second number");
//         int b = sc.nextInt();
//         int result = calculateGCD(a, b);
//         System.out.println("GCD is " + result);
//     }
// }

// Write a program to print Fibonacci series of n terms where n is input by user :
// 0 1 1 2 3 5 8 13 21 ..... 
// In the Fibonacci series, a number is the sum of the previous 2 numbers that came before it

// import java.util.*;


// public class Function {
//    public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
      
//        int a = 0, b = 1;
          
//        System.out.print(a+" ");
      
//        if(n > 1) {
//            //find nth term
//            for(int i=2; i<=n; i++) {
//                System.out.print(b+" ");
//                //the concept below is called swapping
//                int temp = b;
//                b = a + b;
//                a = temp;
//            }


//            System.out.println();
//        }
//    }   
// }

// Time & Space Complexity 

// What is Time Complexity: Relation between input size & running time (operations) 

// Input size: jo bhi Scanner class se ham n input lete thy m input lete thy uss ke basis per ham code ke ander 
// koi operation define kar rahy hai woh hamara input size banjaye ga jitna bara input size utna bara code 
// Example code:
// Scanner --> input lia variable "n"
// for(int i = 0 se lekar n tak chala denge){
// or print kara diya hello
// }
// iss operation ko run karaya hai n times abb jitna bara n hoga utna ziada hamara code time lega 
// Time complexity/operations: directly proportional hai ∝ input n se tou ye aik linear relation hai
// Time Complexity are 3 types
// 1. best case: mai apka result asani se mil jaye--> Ω(1) 
// 2. average case: mai apka result thora time lagaye pr miljaye--> θ(n+1/2)
// 3. worst case: mai apka result milne mai time lagaye or bohot dair baad jaake mile O(n)

// What is Space complexity: code memory mai kitni jagah leraha hai depending upon variable stored
// agar ham variable ka size kitna bhi barha de uska koi farq nahi pare ga ke hamara code memory mai kitna size lega
// Space hamesha variable ki constant rahe gii 