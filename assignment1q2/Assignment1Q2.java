/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1q2;

import java.util.Scanner;

/**
 *
 * @author bea
 */
public class Assignment1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        System.out.println("List elements (ints) [divided by newline characted]:");
        Scanner input = new Scanner(System.in);
        while (true) {
            try {
                l.append(new Node(Integer.parseInt(input.nextLine())));
            } catch (NumberFormatException e) {
                break;
            }
        }
        int k = 10;
        try {
            System.out.println(l.getKthLastElement(k).getData());
        } catch (NullPointerException e) {
            System.out.println("Seems like the list does not contain " + (k + 1) + " elements.");
        }
    }
    
}