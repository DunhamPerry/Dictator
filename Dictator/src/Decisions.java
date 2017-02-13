import java.util.Scanner;

public class Decisions {
		static int userAnswer = 0;
	public static void main(String[] args) {
	}
	public static void police(){
		Scanner userInput = new Scanner(System.in);
		switch ((int)((Math.random()*5)+1)){
		case 1:
			System.out.println("Permit military training ranges to be used for the training of police special forces?");
			System.out.println("1) Yes");
			System.out.println("2) No");
			userAnswer = userInput.nextInt();
			if (userAnswer == 1){
				Game.Faction.get(0).setFactionValue(Game.Faction.get(0).getFactionValue() + 20);
				Game.Faction.get(1).setFactionValue(Game.Faction.get(1).getFactionValue() + 20);
				Game.Faction.get(3).setFactionValue(Game.Faction.get(3).getFactionValue() - 20);
				Game.Faction.get(4).setFactionValue(Game.Faction.get(4).getFactionValue() - 40);
				Game.Faction.get(5).setFactionValue(Game.Faction.get(5).getFactionValue() - 20);
			}
			else if (userAnswer == 2){
				Game.Faction.get(0).setFactionValue(Game.Faction.get(0).getFactionValue() - 20);
				Game.Faction.get(1).setFactionValue(Game.Faction.get(1).getFactionValue() - 20);
				Game.Faction.get(3).setFactionValue(Game.Faction.get(3).getFactionValue() + 20);
				Game.Faction.get(4).setFactionValue(Game.Faction.get(4).getFactionValue() + 40);
				Game.Faction.get(5).setFactionValue(Game.Faction.get(5).getFactionValue() + 20);
			}
			else {
				Decisions.police();
			}
			break;
		case 2:
			System.out.println("Give judges a bonus for each dissident imprisoned?");
			System.out.println("1) Yes");
			System.out.println("2) No");
			userAnswer = userInput.nextInt();
			if (userAnswer == 1){
				Game.Faction.get(0).setFactionValue(Game.Faction.get(0).getFactionValue() + 20);
				Game.Faction.get(2).setFactionValue(Game.Faction.get(2).getFactionValue() - 40);
				Game.Faction.get(3).setFactionValue(Game.Faction.get(3).getFactionValue() - 60);
				Game.Faction.get(5).setFactionValue(Game.Faction.get(5).getFactionValue() + 20);
			}
			else if (userAnswer == 2){
				Game.Faction.get(0).setFactionValue(Game.Faction.get(0).getFactionValue() - 20);
				Game.Faction.get(2).setFactionValue(Game.Faction.get(2).getFactionValue() + 40);
				Game.Faction.get(3).setFactionValue(Game.Faction.get(3).getFactionValue() + 60);
				Game.Faction.get(5).setFactionValue(Game.Faction.get(5).getFactionValue() - 20);
			}
			else {
				Decisions.police();
			}
			break;
		case 3:
			System.out.println("Allow sentries to use duty vehicles for private purposes?");
			System.out.println("1) Yes");
			System.out.println("2) No");
			userAnswer = userInput.nextInt();
			if (userAnswer == 1){
				Game.Faction.get(0).setFactionValue(Game.Faction.get(0).getFactionValue() + 20);
				Game.Faction.get(2).setFactionValue(Game.Faction.get(2).getFactionValue() - 20);
				Game.Faction.get(5).setFactionValue(Game.Faction.get(5).getFactionValue() + 20);
			}
			else if (userAnswer == 2){
				Game.Faction.get(0).setFactionValue(Game.Faction.get(0).getFactionValue() - 20);
				Game.Faction.get(2).setFactionValue(Game.Faction.get(2).getFactionValue() + 20);
				Game.Faction.get(5).setFactionValue(Game.Faction.get(5).getFactionValue() - 20);
			}
			else {
				Decisions.police();
			}
			break;
		case 4:
			System.out.println("Your father-in-law pays underage workers at the distillery with alcohol. Stop this disgrace?");
			System.out.println("1) Yes");
			System.out.println("2) No");
			userAnswer = userInput.nextInt();
			if (userAnswer == 1){
				Game.Faction.get(0).setFactionValue(Game.Faction.get(0).getFactionValue() + 20);
				Game.Faction.get(1).setFactionValue(Game.Faction.get(1).getFactionValue() + 20);
				Game.Faction.get(5).setFactionValue(Game.Faction.get(5).getFactionValue() - 40);
			}
			else if (userAnswer == 2){
				Game.Faction.get(0).setFactionValue(Game.Faction.get(0).getFactionValue() - 20);
				Game.Faction.get(1).setFactionValue(Game.Faction.get(1).getFactionValue() - 20);
				Game.Faction.get(5).setFactionValue(Game.Faction.get(5).getFactionValue() + 40);
			}
			else {
				Decisions.police();
			}
			break;
		case 5:
			System.out.println("Prohibit defense witnesses being admitted into the building's of the court?");
			System.out.println("1) Yes");
			System.out.println("2) No");
			userAnswer = userInput.nextInt();
			if (userAnswer == 1){
				Game.Faction.get(0).setFactionValue(Game.Faction.get(0).getFactionValue() + 20);
				Game.Faction.get(1).setFactionValue(Game.Faction.get(1).getFactionValue() - 40);
				Game.Faction.get(2).setFactionValue(Game.Faction.get(2).getFactionValue() - 60);
				Game.Faction.get(3).setFactionValue(Game.Faction.get(3).getFactionValue() - 40);
				Game.Faction.get(4).setFactionValue(Game.Faction.get(4).getFactionValue() - 20);
				Game.Faction.get(5).setFactionValue(Game.Faction.get(5).getFactionValue() + 20);
			}
			else if (userAnswer == 2){
				Game.Faction.get(0).setFactionValue(Game.Faction.get(0).getFactionValue() - 20);
				Game.Faction.get(1).setFactionValue(Game.Faction.get(1).getFactionValue() + 40);
				Game.Faction.get(2).setFactionValue(Game.Faction.get(2).getFactionValue() + 60);
				Game.Faction.get(3).setFactionValue(Game.Faction.get(3).getFactionValue() + 40);
				Game.Faction.get(4).setFactionValue(Game.Faction.get(4).getFactionValue() + 20);
				Game.Faction.get(5).setFactionValue(Game.Faction.get(5).getFactionValue() - 20);
			}
			else {
				Decisions.police();
			}
			break;
		}
			Game.frameMaker();

	}
	
	public static void oligarchy(){
		Scanner userInput = new Scanner(System.in);
		switch ((int)((Math.random()*5)+1)){
		case 1:
			System.out.println("Build a new hair salon for dogs at the expense of the government?");
			System.out.println("1) Yes");
			System.out.println("2) No");
			userAnswer = userInput.nextInt();
			if (userAnswer == 1){
				//cost -50,000
				Game.Faction.get(0).setFactionValue(Game.Faction.get(0).getFactionValue() - 20);
				Game.Faction.get(1).setFactionValue(Game.Faction.get(1).getFactionValue() + 20);
				Game.Faction.get(2).setFactionValue(Game.Faction.get(2).getFactionValue() - 20);
				Game.Faction.get(3).setFactionValue(Game.Faction.get(3).getFactionValue() + 20);
				Game.Faction.get(4).setFactionValue(Game.Faction.get(4).getFactionValue() - 20);
				Game.Faction.get(5).setFactionValue(Game.Faction.get(5).getFactionValue() - 40);
			}
			else if (userAnswer == 2){
				Game.Faction.get(0).setFactionValue(Game.Faction.get(0).getFactionValue() + 20);
				Game.Faction.get(1).setFactionValue(Game.Faction.get(1).getFactionValue() - 20);
				Game.Faction.get(2).setFactionValue(Game.Faction.get(2).getFactionValue() + 20);
				Game.Faction.get(3).setFactionValue(Game.Faction.get(3).getFactionValue() - 20);
				Game.Faction.get(4).setFactionValue(Game.Faction.get(4).getFactionValue() + 20);
				Game.Faction.get(5).setFactionValue(Game.Faction.get(5).getFactionValue() + 40);
			}
			else {
				Decisions.oligarchy();
			}
			break;
		case 2:
			System.out.println("Permit oligarchs to transfer funds to the personal accounts of police?");
			System.out.println("1) Yes");
			System.out.println("2) No");
			userAnswer = userInput.nextInt();
			if (userAnswer == 1){
				Game.Faction.get(0).setFactionValue(Game.Faction.get(0).getFactionValue() + 20);
				Game.Faction.get(1).setFactionValue(Game.Faction.get(1).getFactionValue() + 40);
				Game.Faction.get(2).setFactionValue(Game.Faction.get(2).getFactionValue() - 40);
				Game.Faction.get(3).setFactionValue(Game.Faction.get(3).getFactionValue() - 20);
				Game.Faction.get(4).setFactionValue(Game.Faction.get(4).getFactionValue() - 20);
				Game.Faction.get(5).setFactionValue(Game.Faction.get(5).getFactionValue() + 20);
			}
			else if (userAnswer == 2){
				Game.Faction.get(0).setFactionValue(Game.Faction.get(0).getFactionValue() - 20);
				Game.Faction.get(1).setFactionValue(Game.Faction.get(1).getFactionValue() - 40);
				Game.Faction.get(2).setFactionValue(Game.Faction.get(2).getFactionValue() + 40);
				Game.Faction.get(3).setFactionValue(Game.Faction.get(3).getFactionValue() + 20);
				Game.Faction.get(4).setFactionValue(Game.Faction.get(4).getFactionValue() + 20);
				Game.Faction.get(5).setFactionValue(Game.Faction.get(5).getFactionValue() - 20);
			}
			else {
				Decisions.oligarchy();
			}
			break;
		case 3:
			System.out.println("Permit businessmen to buy one of the state-owned television stations?");
			System.out.println("1) Yes");
			System.out.println("2) No");
			userAnswer = userInput.nextInt();
			if (userAnswer == 1){
				Game.Faction.get(0).setFactionValue(Game.Faction.get(0).getFactionValue() + 20);
				Game.Faction.get(1).setFactionValue(Game.Faction.get(1).getFactionValue() + 20);
				Game.Faction.get(2).setFactionValue(Game.Faction.get(2).getFactionValue() - 40);
				Game.Faction.get(3).setFactionValue(Game.Faction.get(3).getFactionValue() - 40);
				Game.Faction.get(4).setFactionValue(Game.Faction.get(4).getFactionValue() - 20);
			}
			else if (userAnswer == 2){
				Game.Faction.get(0).setFactionValue(Game.Faction.get(0).getFactionValue() - 20);
				Game.Faction.get(1).setFactionValue(Game.Faction.get(1).getFactionValue() - 20);
				Game.Faction.get(2).setFactionValue(Game.Faction.get(2).getFactionValue() + 40);
				Game.Faction.get(3).setFactionValue(Game.Faction.get(3).getFactionValue() + 40);
				Game.Faction.get(4).setFactionValue(Game.Faction.get(4).getFactionValue() + 20);
			}
			else {
				Decisions.oligarchy();
			}
			break;
		case 4:
			System.out.println("Order teachers to bow to oligarch's children?");
			System.out.println("1) Yes");
			System.out.println("2) No");
			userAnswer = userInput.nextInt();
			if (userAnswer == 1){
				Game.Faction.get(1).setFactionValue(Game.Faction.get(1).getFactionValue() + 20);
				Game.Faction.get(2).setFactionValue(Game.Faction.get(2).getFactionValue() - 60);
				Game.Faction.get(3).setFactionValue(Game.Faction.get(3).getFactionValue() - 40);
				Game.Faction.get(4).setFactionValue(Game.Faction.get(4).getFactionValue() - 20);
			}
			else if (userAnswer == 2){
				Game.Faction.get(1).setFactionValue(Game.Faction.get(1).getFactionValue() - 20);
				Game.Faction.get(2).setFactionValue(Game.Faction.get(2).getFactionValue() + 60);
				Game.Faction.get(3).setFactionValue(Game.Faction.get(3).getFactionValue() + 40);
				Game.Faction.get(4).setFactionValue(Game.Faction.get(4).getFactionValue() + 20);
			}
			else {
				Decisions.oligarchy();
			}
			break;
		case 5:
			System.out.println("Raise pensions for the oligarchs?");
			System.out.println("1) Yes");
			System.out.println("2) No");
			userAnswer = userInput.nextInt();
			//cost 50,000
			if (userAnswer == 1){
				Game.Faction.get(0).setFactionValue(Game.Faction.get(0).getFactionValue() - 20);
				Game.Faction.get(1).setFactionValue(Game.Faction.get(1).getFactionValue() + 20);
				Game.Faction.get(2).setFactionValue(Game.Faction.get(2).getFactionValue() - 40);
				Game.Faction.get(3).setFactionValue(Game.Faction.get(3).getFactionValue() - 20);
				Game.Faction.get(4).setFactionValue(Game.Faction.get(4).getFactionValue() - 40);
				Game.Faction.get(5).setFactionValue(Game.Faction.get(5).getFactionValue() - 20);
			}
			else if (userAnswer == 2){
				Game.Faction.get(0).setFactionValue(Game.Faction.get(0).getFactionValue() + 20);
				Game.Faction.get(1).setFactionValue(Game.Faction.get(1).getFactionValue() - 20);
				Game.Faction.get(2).setFactionValue(Game.Faction.get(2).getFactionValue() + 40);
				Game.Faction.get(3).setFactionValue(Game.Faction.get(3).getFactionValue() + 20);
				Game.Faction.get(4).setFactionValue(Game.Faction.get(4).getFactionValue() + 40);
				Game.Faction.get(5).setFactionValue(Game.Faction.get(5).getFactionValue() + 20);
			}
			else {
				Decisions.oligarchy();
			}
			break;
		}
			Game.frameMaker();
	}
	public static void people(){
		Scanner userInput = new Scanner(System.in);
		switch ((int)((Math.random()*5)+1)){
		case 1:
			System.out.println("Miners request that electricity be provided in the mine galleries at the expense of the industrialists?");
			System.out.println("1) Yes");
			System.out.println("2) No");
			userAnswer = userInput.nextInt();
			if (userAnswer == 1){
				Game.Faction.get(0).setFactionValue(Game.Faction.get(0).getFactionValue() - 20);
				Game.Faction.get(1).setFactionValue(Game.Faction.get(1).getFactionValue() - 60);
				Game.Faction.get(2).setFactionValue(Game.Faction.get(2).getFactionValue() + 20);
				Game.Faction.get(3).setFactionValue(Game.Faction.get(3).getFactionValue() + 20);
				Game.Faction.get(4).setFactionValue(Game.Faction.get(4).getFactionValue() + 20);
				Game.Faction.get(5).setFactionValue(Game.Faction.get(5).getFactionValue() + 20);
			}
			else if (userAnswer == 2){
				Game.Faction.get(0).setFactionValue(Game.Faction.get(0).getFactionValue() + 20);
				Game.Faction.get(1).setFactionValue(Game.Faction.get(1).getFactionValue() + 60);
				Game.Faction.get(2).setFactionValue(Game.Faction.get(2).getFactionValue() - 20);
				Game.Faction.get(3).setFactionValue(Game.Faction.get(3).getFactionValue() - 20);
				Game.Faction.get(4).setFactionValue(Game.Faction.get(4).getFactionValue() - 20);
				Game.Faction.get(5).setFactionValue(Game.Faction.get(5).getFactionValue() - 20);
			}
			else {
				Decisions.people();
			}
			break;
		case 2:
			System.out.println("The country has a bad harvest. Order that the people be given free coupons for millet and corn for the oligarchs?");
			System.out.println("1) Yes");
			System.out.println("2) No");
			userAnswer = userInput.nextInt();
			if (userAnswer == 1){
				Game.Faction.get(1).setFactionValue(Game.Faction.get(1).getFactionValue() - 40);
				Game.Faction.get(2).setFactionValue(Game.Faction.get(2).getFactionValue() + 20);
				Game.Faction.get(3).setFactionValue(Game.Faction.get(3).getFactionValue() + 20);
				Game.Faction.get(4).setFactionValue(Game.Faction.get(4).getFactionValue() + 20);
				Game.Faction.get(5).setFactionValue(Game.Faction.get(5).getFactionValue() + 20);
			}
			else if (userAnswer == 2){
				Game.Faction.get(1).setFactionValue(Game.Faction.get(1).getFactionValue() + 40);
				Game.Faction.get(2).setFactionValue(Game.Faction.get(2).getFactionValue() - 20);
				Game.Faction.get(3).setFactionValue(Game.Faction.get(3).getFactionValue() - 20);
				Game.Faction.get(4).setFactionValue(Game.Faction.get(4).getFactionValue() - 20);
				Game.Faction.get(5).setFactionValue(Game.Faction.get(5).getFactionValue() - 20);
			}
			else {
				Decisions.people();
			}
			break;
		case 3:
			System.out.println("Build a free trauma center for soccer fans at the expense of the police?");
			System.out.println("1) Yes");
			System.out.println("2) No");
			userAnswer = userInput.nextInt();
			if (userAnswer == 1){
				Game.Faction.get(0).setFactionValue(Game.Faction.get(0).getFactionValue() - 60);
				Game.Faction.get(1).setFactionValue(Game.Faction.get(1).getFactionValue() - 20);
				Game.Faction.get(2).setFactionValue(Game.Faction.get(2).getFactionValue() + 20);
				Game.Faction.get(3).setFactionValue(Game.Faction.get(3).getFactionValue() + 20);
				Game.Faction.get(4).setFactionValue(Game.Faction.get(4).getFactionValue() + 20);
				Game.Faction.get(5).setFactionValue(Game.Faction.get(5).getFactionValue() + 20);
			}
			else if (userAnswer == 2){
				Game.Faction.get(0).setFactionValue(Game.Faction.get(0).getFactionValue() + 60);
				Game.Faction.get(1).setFactionValue(Game.Faction.get(1).getFactionValue() + 20);
				Game.Faction.get(2).setFactionValue(Game.Faction.get(2).getFactionValue() - 20);
				Game.Faction.get(3).setFactionValue(Game.Faction.get(3).getFactionValue() - 20);
				Game.Faction.get(4).setFactionValue(Game.Faction.get(4).getFactionValue() - 20);
				Game.Faction.get(5).setFactionValue(Game.Faction.get(5).getFactionValue() - 20);
			}
			else {
				Decisions.people();
			}
			break;
		case 4:
			System.out.println("Permit farmers to have one free chicken per family");
			System.out.println("1) Yes");
			System.out.println("2) No");
			userAnswer = userInput.nextInt();
			if (userAnswer == 1){
				Game.Faction.get(0).setFactionValue(Game.Faction.get(0).getFactionValue() - 20);
				Game.Faction.get(1).setFactionValue(Game.Faction.get(1).getFactionValue() - 20);
				Game.Faction.get(2).setFactionValue(Game.Faction.get(2).getFactionValue() + 20);
				Game.Faction.get(3).setFactionValue(Game.Faction.get(3).getFactionValue() + 20);
				Game.Faction.get(4).setFactionValue(Game.Faction.get(4).getFactionValue() + 20);
			}
			else if (userAnswer == 2){
				Game.Faction.get(0).setFactionValue(Game.Faction.get(0).getFactionValue() + 20);
				Game.Faction.get(1).setFactionValue(Game.Faction.get(1).getFactionValue() + 20);
				Game.Faction.get(2).setFactionValue(Game.Faction.get(2).getFactionValue() - 20);
				Game.Faction.get(3).setFactionValue(Game.Faction.get(3).getFactionValue() - 20);
				Game.Faction.get(4).setFactionValue(Game.Faction.get(4).getFactionValue() - 20);
			}
			else {
				Decisions.people();
			}
			break;
		case 5:
			System.out.println("Provide natural gas to remote villages at the expense of sponsors of the police?");
			System.out.println("1) Yes");
			System.out.println("2) No");
			userAnswer = userInput.nextInt();
			if (userAnswer == 1){
				Game.Faction.get(0).setFactionValue(Game.Faction.get(0).getFactionValue() - 60);
				Game.Faction.get(1).setFactionValue(Game.Faction.get(1).getFactionValue() - 20);
				Game.Faction.get(2).setFactionValue(Game.Faction.get(2).getFactionValue() + 20);
				Game.Faction.get(3).setFactionValue(Game.Faction.get(3).getFactionValue() + 20);
				Game.Faction.get(4).setFactionValue(Game.Faction.get(4).getFactionValue() - 20);
				Game.Faction.get(5).setFactionValue(Game.Faction.get(5).getFactionValue() + 20);
			}
			else if (userAnswer == 2){
				Game.Faction.get(0).setFactionValue(Game.Faction.get(0).getFactionValue() + 60);
				Game.Faction.get(1).setFactionValue(Game.Faction.get(1).getFactionValue() + 20);
				Game.Faction.get(2).setFactionValue(Game.Faction.get(2).getFactionValue() - 20);
				Game.Faction.get(3).setFactionValue(Game.Faction.get(3).getFactionValue() - 20);
				Game.Faction.get(4).setFactionValue(Game.Faction.get(4).getFactionValue() + 20);
				Game.Faction.get(5).setFactionValue(Game.Faction.get(5).getFactionValue() - 20);
			}
			else {
				Decisions.people();
			}
			break;
		}
			Game.frameMaker();
	}

}
