//@Author: Ovidio Castillo
//@Averages of 10 numbers
//Purpose: To find an average of 10 numbers
//License:@GNU
//Date: 09/10/2017
//contact: oc210@email.vccs.edu

import java.util.Scanner;  //sets up to use keyboard

public class Averages {
    public static void main(String[]args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your grades for all classes " + "\"In percentage:\""); //escape sequence
        System.out.println("(Press enter after each value)");

        int total = 0;                      //declare variables
        int grade;
        int average;
        int counter = 0;

        while (counter < 10) {          //input of 10 numbers
            grade = input.nextInt();
            total = total + grade;
            counter++;
        }
        average = total/10;             //calculates the average
        System.out.println("The average of grades of your classes is " + average);  //tells user the total
        System.out.println("For all \n10 classes!");  //escape character
        input.close();
        }
    }

