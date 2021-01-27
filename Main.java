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
         /**
         * if and else if event. 
         * if < 3 else if < 4
         * Average cut is 3 or better this Programm says YEAH!
         * Average cut is 4 or worse this program says NO!
         */
         if(average(grade) < 3){
          System.out.println("YEAH! Your cut is: " + average(grade));
        }
        else if(average(grade) > 4){
          System.out.println("Oh NO... Your cut is: " + average(grade));
        }
        scanner.close();
    }
}
