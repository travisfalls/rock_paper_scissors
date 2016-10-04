package Game;

import java.util.Random;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("Welcome to Rock, Paper, Scissors!");
		System.out.println("");
		System.out.println("Paper beats Rock. Rock beats Scissors. Scissors beats Paper.");
		System.out.println("");
		System.out.println("Best 2 out of 3 wins.");
		System.out.println("");
		
		Scanner userInput = new Scanner(System.in);
		
		int playerScore = 0;
		int computerScore = 0;
		
		//Game Loop
		while(playerScore < 2){
			
			if(computerScore == 2){
				break;
			}
			
			System.out.println("Would you like (1)Rock (2)Paper (3)Scissors?");
			
			int choice = userInput.nextInt();
			
			try{
				System.out.println(" ");
				Thread.sleep(500);	
			} catch(Exception e) {
				
			}
			
			

			try{
				if(choice == 1){
					System.out.println("You chose rock.");
				} else if(choice == 2){
					System.out.println("You chose paper.");
				} else if(choice == 3){
					System.out.println("You chose scissors.");
				} else {
					System.out.println("Maybe you should restart and read the instructions again...");
					break;
				}
				Thread.sleep(1000);
			} catch(Exception e) {
				
			}

			
				
			
			System.out.println(" ");
			
			String[] choices = {"Rock", "Paper", "Scissors"};
			Random random = new Random();
			int index = random.nextInt(choices.length);
			String computerChoice;
			computerChoice = choices[index];
			
			try {
				System.out.println("The computer chose " + computerChoice + ".");
			
				System.out.println(" ");
				Thread.sleep(1000);
			} catch(Exception e){
				
			}
			
			try {
				if(choice == 1 && index == 0){
					System.out.println(" ");
					System.out.println("-----------------------------------------------");
					System.out.println("You both chose rock. It's a draw. Try again.");
				} else if (choice == 1 && index == 1){
					System.out.println(" ");
					System.out.println("-----------------------------------------------");
					System.out.println("Paper beats rock. The computer wins.");
					computerScore++;
				} else if (choice == 1 && index == 2){
					System.out.println(" ");
					System.out.println("-----------------------------------------------");
					System.out.println("Rock beats scissors. You win!");
					playerScore++;
				} else if (choice == 2 && index == 0){
					System.out.println(" ");
					System.out.println("-----------------------------------------------");
					System.out.println("Paper beats rock. You win!");
					playerScore++;
				} else if (choice == 2 && index == 1){
					System.out.println(" ");
					System.out.println("-----------------------------------------------");
					System.out.println("You both chose paper. It's a draw. Try again.");
				} else if (choice == 2 && index == 2){
					System.out.println(" ");
					System.out.println("-----------------------------------------------");
					System.out.println("Scissors beats paper. The computer wins.");
					computerScore++;
				} else if (choice == 3 && index == 0){
					System.out.println(" ");
					System.out.println("-----------------------------------------------");
					System.out.println("Rock beats scissors. You win!");
					playerScore++;
				} else if (choice == 3 && index == 1){
					System.out.println(" ");
					System.out.println("-----------------------------------------------");
					System.out.println("Scissors beats paper. The computer wins.");
					computerScore++;
				} else if (choice == 3 && index == 2){
					System.out.println(" ");
					System.out.println("-----------------------------------------------");
					System.out.println("You both chose scissors. It's a draw. Try again.");
				} else {
					System.out.println(" ");
					System.out.println("-----------------------------------------------");
					System.out.println("Uh oh, something went wrong!");
					break;
				}
				Thread.sleep(1000);
			} catch(Exception e){
				
			}
			
			

				if(playerScore < 2 && computerScore < 2){
					System.out.println(" ");
					System.out.println(" ");
					System.out.println(" ");
					System.out.println("-----------------------------------------------");
					System.out.println("Next Round");
					System.out.println("----------");
					System.out.println(" ");
				} else {
					System.out.println(" ");
					System.out.println(" ");
					System.out.println(" ");
					System.out.println("***********************************************");
					System.out.println("-----------------------------------------------");
					System.out.println("Game Over");
					System.out.println("---------");
					System.out.println(" ");
				}

			
			
			
			
		}
		if(playerScore == 2){
			System.out.println("You won: " + playerScore + " to " + computerScore);
		} else {
			System.out.println("The computer won: " + playerScore + " to " + computerScore);
		}

	}

}


