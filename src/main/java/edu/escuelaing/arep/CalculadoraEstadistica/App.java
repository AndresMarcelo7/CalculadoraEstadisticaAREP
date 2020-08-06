package edu.escuelaing.arep.CalculadoraEstadistica;

import edu.escuelaing.arep.CalculadoraEstadistica.DataStructure.LinkedList;

import java.math.BigDecimal;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        LinkedList<BigDecimal> linkedList = new LinkedList<BigDecimal>();
        linkedList.add(new BigDecimal("0.33"));
        linkedList.add(new BigDecimal("0.33"));
        linkedList.add(new BigDecimal("0.35"));
        linkedList.add(new BigDecimal("0.36"));
        for(Object i: linkedList){
            System.out.println(i);
        }

    }
}
