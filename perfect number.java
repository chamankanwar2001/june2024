perfect number : 
6 
1 2 3 
1 + 2 + 3 => 6 

8 
2 2 2 =>6 not perfect number 

import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner dc = new Scanner(System.in);

        System.out.println("Enter a Number");
        int num = dc.nextInt();

        int sum = 0;

        if(num>0){
            for(int i=1; i<num ;i++){
                if(num%i==0){
                    sum=sum+i;
                }
                
            }
        }

        if(sum == num){
            System.out.println(num + "is a perfect number");
        }
        else{
            System.out.println(num + "is not a perfect number ");
        }

    }

}

--------------------------------------------------------------------------------------------
neon number : 

9 =>81 
8+1 =>9 

9 is neon number

import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner dc = new Scanner(System.in);

        System.out.println("Enter a Number");
        int num = dc.nextInt();

        int sq=num*num;
        int rem,sum = 0;

        while(sq > 0){
            rem = sq%10;
            sum = sum + rem;
            sq = sq/10;
            
        }

        if(sum == num){
            System.out.println(num + "is a perfect number");
        }
        else {
            System.out.println(num +" is not perfect number");
        }

        
    }

}


-------------------
Problem Statement – Goutam and Tanul plays by telling numbers. Goutam says a number
to Tanul. Tanul should first reverse the number and check if it is same as the original. If yes,
Tanul should say “Palindrome”. If not, he should say “Not a Palindrome”. If the number is
negative, print “Invalid Input”. Help Tanul by writing a program.
Sample Input 1 :
21212
Sample Output 1 :
Palindrome
Sample Input 2 :
6186
Sample Output 2 :
Not a Palindrome



import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number:");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Invalid Input");
            return;
        }

        int originalNumber = number;
        int reversedNumber = 0;
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        if (originalNumber == reversedNumber) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}



Q)
In a theater, there is a discount scheme announced where one gets a 10% discount
on the total cost of tickets when there is a bulk booking of more than 20 tickets, and
a discount of 2% on the total cost of tickets if a special coupon card is submitted.
Develop a program to find the total cost as per the scheme. The cost of the k class
ticket is Rs.75 and q class is Rs.150. Refreshments can also be opted by paying an
additional of Rs. 50 per member.
Hint: k and q and You have to book minimum of 5 tickets and maximum of 40 at a
time. If fails display “Minimum of 5 and Maximum of 40 Tickets”. If circle is given a
value other than ‘k’ or ‘q’ the output should be “Invalid Input”.
The ticket cost should be printed exactly to two decimal places.
Sample Input 1:
Enter the no of ticket:35
Do you want refreshment:y
Do you have coupon code:y
Enter the circle:k
Sample Output 1:
Ticket cost:4065.25
Sample Input 2:
Enter the no of ticket:1
Sample Output 2:
Minimum of 5 and Maximum of 40 Tickets


import java.util.Scanner;

public class TheaterDiscount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the no of tickets:");
        int numOfTickets = scanner.nextInt();

        if (numOfTickets < 5 || numOfTickets > 40) {
            System.out.println("Minimum of 5 and Maximum of 40 Tickets");
            return;
        }

        double ticketCost;
        System.out.println(" refreshment: (y/n)");
        char refreshmentChoice = scanner.next().charAt(0);

        System.out.println("coupon code: (y/n)");
        char couponChoice = scanner.next().charAt(0);
