/* Question :-
1. You are required to display the prime factorization of a number.
    2. Take as input a number n.
    3. Print all its prime factors from smallest to largest.
                               
Input Format
n, an integer
Output Format
p1  p2  p3  p4.. all prime factors of n
*/

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        for(int i = 2; i * i <= n; i++){
            while(n % i == 0){
                System.out.print(i + " ");
                n = n / i;
            }
        }
        
        if(n != 1)
            System.out.print(n);
	}
}