/* * Question:- 
1. You've to count the number of digits in a number.
2. Take as input "n", the number for which the digits has to be counted.
3. Print the digits in that number.
Input Format
"n" where n is any integer.
Output Format
"d" where d is the number of digits in the number "n" */


import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
  
  Scanner scn = new Scanner(System.in);
  int n = scn.nextInt();
  
  int digit = 0;
  while(n!=0){
      n = n/10;
      digit++;
  }
  
  System.out.println(digit);
  
   }
  }