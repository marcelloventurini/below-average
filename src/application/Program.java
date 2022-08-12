package application;

import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Enter the amount: ");
    int n = scanner.nextInt();
    double[] vect = new double[n];

    double sum = 0;
    for (int i = 0; i < vect.length; i++) {
      System.out.print("Enter a number: ");
      vect[i] = scanner.nextDouble();
      sum += vect[i];
    }

    double avg = sum / vect.length;

    System.out.println("Average: " + avg);

    System.out.println("Elements below the average: ");

    for (int i = 0; i < vect.length; i++) {
      if (vect[i] < avg) {
        System.out.println(vect[i]);
      }
    }
    
    scanner.close();
  }
}
