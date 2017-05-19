/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1q1;

import java.util.Arrays;

/**
 *
 * @author bea
 */
public class Permutation {
    
    private final String word;
    private final char[] str;
    private final int size;
    
    /**
     * Creates a permutation object.
     * @param s the string to be tested
     * 
     */
    public Permutation(String s) {
        this.word = s;
        this.str = s.toCharArray();
        this.size = s.length();
        Arrays.sort(this.str);
    }
    
    public String getWord() {
        return this.word;
    }
    
    public Boolean isPermutationOf(String perm) {
        if (this.size != perm.length())
            return false;
        
        char[] p = perm.toCharArray();
        Arrays.sort(p);
        return Arrays.equals(p, this.str);
    }
}
