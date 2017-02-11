import java.util.Scanner;

public class StartUp {
	static String name;

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Welcome to Dictator");
		System.out.println("Would you like to go through the tutorial to gain a basic understanding of the game?");
		System.out.println("1) Yes");
		System.out.println("2) No");
		int userAnswer = userInput.nextInt();
		if (userAnswer == 1){
			tutorial();
		}
		else {
		}
		System.out.println("What should I call you?");
		name = userInput.nextLine();
		System.out.println();
		System.out.println("Well hello there, " + name);
		System.out.println("Shall we get started?");
		System.out.println("1) Yes");
		int userReady = userInput.nextInt();
		//Game();
	}
	
	public static void tutorial(){
		System.out.println("Dictator is a strategy game aimed at appeasing the six factions in your country");
		System.out.println("Those factions are:");
		System.out.println("Police: Your forces in the streets, neccasary to keep the people in check");
		System.out.println("Oligarchs: The main spending power of your country. Your sugar daddy can either make you rich or a street urchin");
		System.out.println("People: The people must love Big Brother");
		System.out.println("Opposition: With one word this select group could either make you a God or tear you down to pieces");
		System.out.println("Army: The state must be secure from the foreign infidels");
		System.out.println("Family: Although you are family, one might slip a dagger into your heart if you aren't giving them the love they deserve. Capich?");
		System.out.println("");
		System.out.println("Your main resource is money, run out and you are screwed");
		System.out.println("You can use the money to pay off the different factions");
		System.out.println();
		System.out.println("Your goal is to stand in power for as long as possible");
		System.out.println("Good luck my leader");
	}
	public static void runner(){
		
	}

}
