package findMinandMax;

import java.util.Scanner;

//Write a program to find the min and max numbers
//Read integers from the console until "END" is entered
//Print the biggest and the smallest integer

	public class FindMinandMax {
	   public static void main(String[] args) {
	      Scanner scanner = new Scanner(System.in);
	      String num = scanner.nextLine();
	      int min = Integer.MAX_VALUE;
	      int max = Integer.MIN_VALUE;
	      while(!num.equals("END")){
	      int number = Integer.parseInt(num);
	      if(number > max){
	          max = number;
	      }
	      if(number < min){
	          min = number;
	      }  
	      String num1 = scanner.nextLine();
	      num = num1;
	      }
	      System.out.println("Min number: " + min);
	      System.out.println("Max number: " + max);
	    }
	}
