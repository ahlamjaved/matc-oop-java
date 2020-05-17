package Hangman;

import java.util.*;
public class Hangman 
{
   public static void main(String[] args)
   {
       Scanner sc = new Scanner(System.in);
       int  noOfGuesses =0,lettersCorrect=0;
       String choiceToPlay, userGuess;
       char menuChoice, letter;
       String[] list={"hello","java","loop"};
       System.out.println("\t\t\t\tWelcome to Hangman!");//main game start menu
       System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
       do
       {  System.out.println("\t\t\t  Do you want to play? Press Y/N\n");
          choiceToPlay = sc.next();
          menuChoice = choiceToPlay.charAt(0);
          if(!(menuChoice == 'y'||menuChoice == 'Y'||menuChoice == 'n'||menuChoice =='N'))
          {
            System.out.println("\t\t\t\tYou have entered an invalid option. Try again!\n");
          }//if any letter other than y or n is entered
       }//do
       while (!(menuChoice =='Y' ||menuChoice=='y'||menuChoice == 'n'|| menuChoice =='N'));
       if(menuChoice == 'N'||menuChoice =='n')
       {
          System.out.println("You have chosen to leave the game.");
          System.out.println("Goodbye!");
          System.exit(0);
       }//if
       else
       {           
          int randomWordNumber = (int)((Math.random()*list.length));// Pick random index of guessWord array
          char[] enteredLetters = new char[list[randomWordNumber].length()];// Create an array to store already entered letters
          switch(randomWordNumber)
          {
            case 1:
            {                
                char [] correctLetter = {'-', '-', '-', '-', '-'};
                while(lettersCorrect <5)
                {
                    char guessWord[]={'h','e','l','l','o'};
                    System.out.println("\nThe guess word has 5 letters.");
                    System.out.println("Enter a letter to guess: ");
                    userGuess = sc.next();
                    letter = userGuess.charAt(0);//Incrementing letters each time.
                    noOfGuesses++; 
                    if(letter == guessWord[0])
                    {                       
                        System.out.println("There is 1 "+guessWord[0]+" in the word");
                        System.out.println("You have guessed the first letter correctly.");
                        correctLetter[0] = letter;
                        System.out.println(correctLetter);
                        System.out.println("You have had " + noOfGuesses + " guesses, so far");
                        lettersCorrect++;
                        System.out.println("Letters correct so far: "+lettersCorrect);
                    }//if first letter
                    else if(letter==guessWord[1])
                    {
                        System.out.println("There is 1 "+guessWord[1]+" in the word");
                        System.out.println("You have guessed the second letter correctly.");
                        correctLetter[1] = letter;
                        System.out.println(correctLetter);
                        System.out.println("You have had " + noOfGuesses + " guesses, so far");
                        lettersCorrect++;
                        System.out.println("Letters correct so far: "+lettersCorrect);
                    }//if second letter                     
                    else if(letter ==guessWord[2]||letter==guessWord[3])
                    {                         
                        System.out.println("There are 2 "+guessWord[2]+" in the word");
                        System.out.println("You have guessed the third and fourth letters correctly.");
                        correctLetter[2] = letter;
                        correctLetter[3]=letter;
                        System.out.println(correctLetter);
                        System.out.println("You have had " + noOfGuesses + " guesses, so far");
                        lettersCorrect+=2;
                        System.out.println("Letters correct so far: "+lettersCorrect);
                    }//if third and fourth letters
                    else if(letter ==guessWord[4])
                    {   
                        lettersCorrect++;
                        System.out.println("There is 1 O in the word");
                        System.out.println("You have guessed the fifth letter correctly.");
                        correctLetter[4] = letter;
                        System.out.println(correctLetter);
                        System.out.println("You have had " + noOfGuesses + " guesses, so far");
                        System.out.println("Letters correct so far: "+lettersCorrect);
                    }//if fifth letter
                    else
                    {
                        System.out.println("The letter you guessed is not in the word.\n");
                        System.out.println("Guesses taken so far: "+noOfGuesses);
                        System.out.println("Letters correct so far: "+lettersCorrect);
                    }//else incorrect letter
                }
                System.out.println("\nYou found the word!");
                System.out.println("It was hello.");
                System.out.println("Total guesses: "+noOfGuesses);
                break;
            }
            case 2:
            {
                char [] correctLetter = {'-', '-', '-', '-'};
                while(lettersCorrect <4)
                {
                     char guessWord[]={'j','a','v','a'};                     
                     System.out.println("\nThe guess word has 4 letters.");
                     System.out.println("Enter a letter to guess: ");
                     userGuess = sc.next();
                     letter = userGuess.charAt(0);//Incrementing letters each time.
                     noOfGuesses++; 
                     if(letter == guessWord[0])
                     {
                         System.out.println("There is 1 "+guessWord[0]+" in the word");
                         System.out.println("You have guessed the first letter correctly.");
                         correctLetter[0] = letter;
                         System.out.println(correctLetter);
                         System.out.println("You have had " + noOfGuesses + " guesses, so far");
                         lettersCorrect++;
                         System.out.println("Letters correct so far: "+lettersCorrect);
                     }//if first letter
                     else if(letter==guessWord[1])
                     {
                         System.out.println("There are 2 "+guessWord[1]+" in the word");
                         System.out.println("You have guessed the second and fourth letters correctly.");
                         correctLetter[1] = letter;
                         correctLetter[3] = letter;
                         System.out.println(correctLetter);
                         System.out.println("You have had " + noOfGuesses + " guesses, so far");
                         lettersCorrect+=2;
                         System.out.println("Letters correct so far: "+lettersCorrect);
                     }//if second letter                     
                     else if(letter ==guessWord[2])
                     {                         
                         System.out.println("There is 1 "+guessWord[2]+" in the word");
                         System.out.println("You have guessed the third letter correctly.");
                         correctLetter[2] = letter;
                         System.out.println(correctLetter);
                         System.out.println("You have had " + noOfGuesses + " guesses, so far");
                         lettersCorrect++;
                         System.out.println("Letters correct so far: "+lettersCorrect);
                     }//if third and fourth letters
                     else
                     {
                         System.out.println("The letter you guessed is not in the word.\n");
                         System.out.println("Guesses taken so far: "+noOfGuesses);
                         System.out.println("Letters correct so far: "+lettersCorrect);
                     }//else incorrect letter
                }//while loop
                System.out.println("\nYou found the word!");
                System.out.println("It was java.");
                System.out.println("Total guesses: "+noOfGuesses);
                break;
            }
            default:
            {
                char [] correctLetter = {'-', '-', '-', '-'};
                while(lettersCorrect<4)
                {
                    char guessWord[]={'l','o','o','p'};                    
                    System.out.println("\nThe guess word has 4 letters.");
                    System.out.println("Enter a letter to guess: ");
                    userGuess = sc.next();
                    letter = userGuess.charAt(0);//Incrementing letters each time.
                    noOfGuesses++; 
                    if(letter == guessWord[0])
                    {
                        System.out.println("There is 1 "+guessWord[0]+" in the word");
                        System.out.println("You have guessed the first letter correctly.");
                        correctLetter[0] = letter;
                        System.out.println(correctLetter);
                        System.out.println("You have had " + noOfGuesses + " guesses, so far");
                        lettersCorrect++;
                        System.out.println("Letters correct so far: "+lettersCorrect);
                    }//if first letter
                    else if(letter==guessWord[1])
                    {
                        System.out.println("There are 2 "+guessWord[1]+" in the word");
                        System.out.println("You have guessed the second and third letters correctly.");
                        correctLetter[1] = letter;
                        correctLetter[2] = letter;
                        System.out.println(correctLetter);
                        System.out.println("You have had " + noOfGuesses + " guesses, so far");
                        lettersCorrect+=2;
                        System.out.println("Letters correct so far: "+lettersCorrect);
                    }//if second letter                     
                    else if(letter ==guessWord[3])
                    {                         
                        System.out.println("There is 1 "+guessWord[3]+" in the word");
                        System.out.println("You have guessed the fourth letter correctly.");
                        correctLetter[3]=letter;
                        System.out.println(correctLetter);
                        System.out.println("You have had " + noOfGuesses + " guesses, so far");
                        lettersCorrect++;
                        System.out.println("Letters correct so far: "+lettersCorrect);
                    }//if third and fourth letters
                    else
                    {
                        System.out.println("The letter you guessed is not in the word.\n");
                        System.out.println("Guesses taken so far: "+noOfGuesses);
                        System.out.println("Letters correct so far: "+lettersCorrect);
                    }//else incorrect letter
                }//while loop
            }//case
            System.out.println("\nYou found the word!");
            System.out.println("It was loop.");
            System.out.println("Total guesses: "+noOfGuesses);
          }//switch
       }
   }
}      