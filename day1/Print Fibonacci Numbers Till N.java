/* Question :-
1. You've to print first n fibonacci numbers.
2. Take as input "n", the count of fibonacci numbers to print.
3. Print first n fibonacci numbers.
Input Format
n
Output Format
0
1
1
2
3
5
8
.. first n fibonaccis
*/

import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      
      int a = 0;
      int b = 1;
      for(int i = 0; i < n; i++){
          System.out.println(a);
           int c = a + b;
           a = b;
           b = c;
      }
   }
  }