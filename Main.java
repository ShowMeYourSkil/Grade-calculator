/**
 * This is my first Java claas omg! 
 * I hope that is not to strong for me.
 * I want calculate my school grades.
 * Next time I want to upgrade this code to learn more Java xD
 */

import java.util.Scanner;

public class Main {
     public static double average(double [] grade){
    double total = 0;

    int count = grade.length;

    for(int i=0; i<grade.length; i++){
      total = total + grade [i];
    }

      double average = total / count;
      return average;
        }

    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in); 

        System.out.print("Please state how many subjects you have: ");
        
        int count = scanner.nextInt();

        double[] grade = new double[count];

        System.out.println("Please enter you grade: ");

        for(int i = 0; i < grade.length; i++){
            grade [i] = scanner.nextDouble();
        }
         System.out.println("Your cut is: " + average(grade));
        scanner.close();
    }
}