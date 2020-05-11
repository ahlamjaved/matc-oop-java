/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javed_guesstheword;

/**
 *
 * @author JAVEDAS1
 */

import java.util.Random;

public class Dictionary {
    String [] words = {"java", "class", "program", "inherit", "string", "array", "method", "overload", "parameter", "constructor", "variable", "loop"};
    
    public String getRandomWord() {
        int randomWordIndex = (int)((Math.random()*words.length));
        String word = words[randomWordIndex];
        return word;
    }
}
