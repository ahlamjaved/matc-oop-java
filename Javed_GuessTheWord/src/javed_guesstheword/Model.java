/*
 Ahlam Javed
ITDEV-110
Hangman assignment #9
 */
package javed_guesstheword;

/**
 *
 * @author JAVEDAS1
 */

import java.util.Random;

public class Model {
    final int guessLimit = 7;
    
    Dictionary dictionary;
    int guesses;
    char[] state;
    String selectedWord; 
    int numOfIncorrectGuesses;
    char[] incorrectGuesses;
    
    Model() {
        dictionary = new Dictionary();
    }

    public void selectRandomWord() {
        selectedWord = dictionary.getRandomWord();
        state = new char[selectedWord.length()];
        for (int index = 0; index < state.length; index++) {
            state[index] = '_';
        }
    }
    
    public void Init() {
        guesses = 0;
        incorrectGuesses = new char[7];
        numOfIncorrectGuesses = 0;
        
    }
            
    public boolean updateState(char guess) {
        boolean wasLetterUpdated = false;
                
        for (int index = 0; index < selectedWord.length(); index++) {
            char letter = selectedWord.charAt(index);
            if (guess == letter) {
                state[index] = letter;
                wasLetterUpdated = true;
            } 
        }
        return wasLetterUpdated;
    }
    
    public void markGuessIncorrect(char guess) {
        incorrectGuesses[numOfIncorrectGuesses] = guess; 
        numOfIncorrectGuesses++;
        
    }
    
    public boolean isWordComplete() {
        for (int index = 0; index < selectedWord.length(); index++ ) {
            if (selectedWord.charAt(index) != state[index]) {
                return false;
            }
        }
        return true;
    }
    
    public char[] getState() {
        return state;
    }
    public void incrementGuess() {
        guesses++;
    }
    
    public int getNumberOfGuesses() {
        return guesses;
    }
    public char[] getIncorrectGuesses() {
        return incorrectGuesses;
    }
    
    public boolean ExceededGuessLimit() {
        
        if (guesses < guessLimit) {
            return false;
        }
        else return true;
    } 
    
    
    
    
    
    
    
    
    
    
}
