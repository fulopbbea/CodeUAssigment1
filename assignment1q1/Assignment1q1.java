/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1q1;

import java.util.Scanner;

/**
 *
 * @author bea
 */
public class Assignment1q1 {

    /**
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("First string:");
        String first = input.nextLine();
        
        System.out.println("Second string:");
        String second = input.nextLine();
        
        Permutation p = new Permutation(first);
        if (p.isPermutationOf(second)) {
            System.out.println("The word \"" + p.getWord() + "\" is a permutation of \""
                    + second + "\"");
        } else {
            System.out.println("The word \"" + p.getWord() + "\" is NOT a permutation of \""
                    + second + "\".");
        }
    }
    
}
