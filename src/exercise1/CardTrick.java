package exercise1;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author dancye
 * @author Paul Bonenfant Jan 25, 2022 
 * @author Vikas Maurya jan 27, 2023
 */

import java.util.Scanner;
public class CardTrick {
    
    public static void main(String[] args) {
         
        Card[] hand = new Card[7];

        for (int i = 0; i <= hand.length-1; i++) 
        {
            Card card = new Card();
            card.setValue((int)(Math.random() * 13) + 1);
            card.setSuit(Card.SUITS[(int)(Math.random()* 4)]);
            hand[i] = card;
        }
        
        System.out.println("Enter the  number and card type ");
        Scanner keyboard = new Scanner(System.in);
        int num = keyboard.nextInt();
        String suit = keyboard.next();
        boolean win = false;
        for (int j = 0; j <= hand.length-1; j++) 
        {
           if( hand[j].getSuit().equalsIgnoreCase(suit) && hand[j].getValue() == (num))
           {
               win = true;
           }
        }
        
        if(win == true)
        {
            printInfo();
        } 
        else if(win == false)
        {
            System.out.println("Wrong Card!! You LOST ");
            System.out.println("All the winning Cards: ");
            for (int k = 0; k <= hand.length-1; k++) 
            {
                System.out.println(hand[k].getValue() + " " + hand[k].getSuit() );
            }
        }      
    }   
     /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Paul Bonenfant Jan 2022
     */
 
    private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Paul, but you can call me prof, Paul or sir");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- Be more active on LinkedIn");
        System.out.println("-- Have a semester with no violations of academic integrity!");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Investing");
        System.out.println("-- Cooking");
        System.out.println("-- Reading/Watching TV");
        System.out.println("-- Riding my motorcycle");

        System.out.println();
        
    
    }
}


