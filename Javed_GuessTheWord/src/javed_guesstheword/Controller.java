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

public class Controller {
    
    View view = new View();
    Model model = new Model();
    
    public void Start() {
        view.Begin();
        view.Intro();
        view.Directions();
    }
    
    public void playMultiple() {
        do {
            playSingle();
        } while (!view.exit());
    }
    
    public void playSingle() {
        model.selectRandomWord();
        model.Init();
        do {
           view.displayState(model.getState());
           char guess = view.getGuess();
           boolean correctGuess = model.updateState(guess);
           if (correctGuess) {
               view.displayCorrect();
           }
           else {
               view.displayIncorrect();
               model.markGuessIncorrect(guess);
           }
           view.displayIncorrectGuesses(model.getIncorrectGuesses());
           model.incrementGuess();
           view.displayNumberOfGuesses(model.getNumberOfGuesses());
       
       } while (!model.ExceededGuessLimit() && !model.isWordComplete());
       if (model.isWordComplete()) {
           System.out.println("Congrats you guessed correct!");
           System.out.println(model.selectedWord);
       }
    }
}
