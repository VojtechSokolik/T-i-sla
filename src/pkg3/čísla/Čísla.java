/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3.čísla;

import java.util.Scanner;

/**
 *
 * @author vojtech.sokolik
 */
public class Čísla {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in, "CP1250");
       System.out.print("Vlož číslo: ");
       int vstup = sc.nextInt();
       System.out.println(vstup);       
       
    }
    
}
