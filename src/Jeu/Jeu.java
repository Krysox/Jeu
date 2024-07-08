package Jeu;

import java.util.Random;
import java.util.Scanner;

public class Jeu {
	public static int MAX_NUMBER = 1000;
	public static int MIN_NUMBER = 1;


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
 		
 		Scanner sc = new Scanner(System.in);
	    
	    boolean hasWon = false;
	    
	    while (!hasWon)
	    {
	    	int randomNumber = getRandomNumber();
	    	System.out.println("Le chiffre tiré au hasard est : " + randomNumber);
	    	
	    	
	    	System.out.print("Joueur 1 entrez un chiffre entre 1 et 1000 : ");
	    	int numberPlayer1 = sc.nextInt();
	    	
	    	System.out.print("Joueur 2 entrez un chiffre entre 1 et 1000 : ");
	    	int numberPlayer2 = sc.nextInt();
	    	
	    	int diffNumberPlayer1 = Math.abs(randomNumber - numberPlayer1);
            int diffNumberPlayer2 = Math.abs(randomNumber - numberPlayer2);
            
            if (diffNumberPlayer1 <= 50 || diffNumberPlayer2 <= 50) {
                if (diffNumberPlayer1 < diffNumberPlayer2) {
                    System.out.println("Joueur 1 gagne avec une différence de " + diffNumberPlayer1);
                } else if (diffNumberPlayer2 < diffNumberPlayer1) {
                    System.out.println("Joueur 2 gagne avec une différence de " + diffNumberPlayer2);
                } else {
                    System.out.println("Égalité ! Les deux joueurs sont à " + diffNumberPlayer1 + " de différence.");
                }
                hasWon = true;
            } else {
                System.out.println("Aucun joueur ne gagne cette manche. On recommence !");
            }
	    	
	    }
	    sc.close();
	}
	
	
	protected static int getRandomNumber()
	{
		Random rand = new Random();
 		return rand.nextInt(1000) + 1;
	}
	
//	protected boolean isInRange(int random, int numberPlayer)
//	{
//		int smallerThan = random - 50;
//		int biggerThan = random + 50;
//		
//		return smallerThan > numberPlayer && numberPlayer  < biggerThan;
//	}

}
