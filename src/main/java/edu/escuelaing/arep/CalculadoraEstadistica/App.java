package edu.escuelaing.arep.CalculadoraEstadistica;
import edu.escuelaing.arep.CalculadoraEstadistica.Calculator.Calculator;
import edu.escuelaing.arep.CalculadoraEstadistica.DataStructure.LinkedList;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Main Application, Reader
 */
public class App
{
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main( String[] args )
    {
        try {
            File myObj = new File("Data.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                CalculateData(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }

    /**
     * Auxiliary method that Calculates mean and SD line by line.
     * @param data The string of Double numbers separated by "," in the file Data.txt
     */

    private static void CalculateData(String data) {
        LinkedList<Double> ll = new LinkedList<>();
        Calculator cal = new Calculator();
        String[] parts = data.split(",");
        for (String i: parts){
            double d = Double.parseDouble(i);
            ll.add(d);
        }
        System.out.println("Mean: " + cal.mean(ll) + " SD: " + cal.standardDeviation(ll));

    }
}
