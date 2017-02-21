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
				Game.Faction.get(3).setFactionValue(Game.Faction.get(3).getFactionValue() -20);
				Game.Faction.get(4).setFactionValue(Game.Faction.get(4).getFactionValue() - 40);
				Game.Faction.get(5).setFactionValue(Game.Faction.get(5).getFactionValue() -20);
				Game.cash = Game.cash -20;
			}
			else if (userAnswer == 2){
				Game.Faction.get(0).setFactionValue(Game.Faction.get(0).getFactionValue() -20);
				Game.Faction.get(1).setFactionValue(Game.Faction.get(1).getFactionValue() -20);
				Game.Faction.get(3).setFactionValue(Game.Faction.get(3).getFactionValue() + 20);
				Game.Faction.get(4).setFactionValue(Game.Faction.get(4).getFactionValue() + 40);
				Game.Faction.get(5).setFactionValue(Game.Faction.get(5).getFactionValue() + 20);
				Game.cash = Game.cash + 10;
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
				Game.cash = Game.cash -20;
			}
			else if (userAnswer == 2){
				Game.Faction.get(0).setFactionValue(Game.Faction.get(0).getFactionValue() -20);
				Game.Faction.get(2).setFactionValue(Game.Faction.get(2).getFactionValue() + 40);
				Game.Faction.get(3).setFactionValue(Game.Faction.get(3).getFactionValue() + 60);
				Game.Faction.get(5).setFactionValue(Game.Faction.get(5).getFactionValue() -20);
				Game.cash = Game.cash + 10;
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
				Game.Faction.get(2).setFactionValue(Game.Faction.get(2).getFactionValue() -20);
				Game.Faction.get(5).setFactionValue(Game.Faction.get(5).getFactionValue() + 20);
				Game.cash = Game.cash -20;
			}
			else if (userAnswer == 2){
				Game.Faction.get(0).setFactionValue(Game.Faction.get(0).getFactionValue() -20);
				Game.Faction.get(2).setFactionValue(Game.Faction.get(2).getFactionValue() + 20);
				Game.Faction.get(5).setFactionValue(Game.Faction.get(5).getFactionValue() -20);
				Game.cash = Game.cash + 10;
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
				Game.cash = Game.cash -20;
			}
			else if (userAnswer == 2){
				Game.Faction.get(0).setFactionValue(Game.Faction.get(0).getFactionValue() -20);
				Game.Faction.get(1).setFactionValue(Game.Faction.get(1).getFactionValue() -20);
				Game.Faction.get(5).setFactionValue(Game.Faction.get(5).getFactionValue() + 40);
				Game.cash = Game.cash + 10;
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
				Game.Faction.get(4).setFactionValue(Game.Faction.get(4).getFactionValue() -20);
				Game.Faction.get(5).setFactionValue(Game.Faction.get(5).getFactionValue() + 20);
				Game.cash = Game.cash -20;
			}
			else if (userAnswer == 2){
				Game.Faction.get(0).setFactionValue(Game.Faction.get(0).getFactionValue() -20);
				Game.Faction.get(1).setFactionValue(Game.Faction.get(1).getFactionValue() + 40);
				Game.Faction.get(2).setFactionValue(Game.Faction.get(2).getFactionValue() + 60);
				Game.Faction.get(3).setFactionValue(Game.Faction.get(3).getFactionValue() + 40);
				Game.Faction.get(4).setFactionValue(Game.Faction.get(4).getFactionValue() + 20);
				Game.Faction.get(5).setFactionValue(Game.Faction.get(5).getFactionValue() -20);
				Game.cash = Game.cash + 10;
			}
			else {
				Decisions.police();
			}
			break;
		}
		Game.graphChecker();
	}
	
	public static void oligarchy(){
		Scanner userInput = new Scanner(System.in);
		switch ((int)((Math.random()*5)+1)){
		case 1:
			System.out.println("Build a new hair salon for dogs at the expense of the government?");
			System.out.println("1) Yes ($50,000)");
			System.out.println("2) No");
			userAnswer = userInput.nextInt();
			if (userAnswer == 1){
				Game.Faction.get(0).setFactionValue(Game.Faction.get(0).getFactionValue() -20);
				Game.Faction.get(1).setFactionValue(Game.Faction.get(1).getFactionValue() + 20);
				Game.Faction.get(2).setFactionValue(Game.Faction.get(2).getFactionValue() -20);
				Game.Faction.get(3).setFactionValue(Game.Faction.get(3).getFactionValue() + 20);
				Game.Faction.get(4).setFactionValue(Game.Faction.get(4).getFactionValue() -20);
				Game.Faction.get(5).setFactionValue(Game.Faction.get(5).getFactionValue() - 40);
				Game.cash = Game.cash - 15;
			}
			else if (userAnswer == 2){
				Game.Faction.get(0).setFactionValue(Game.Faction.get(0).getFactionValue() + 20);
				Game.Faction.get(1).setFactionValue(Game.Faction.get(1).getFactionValue() -20);
				Game.Faction.get(2).setFactionValue(Game.Faction.get(2).getFactionValue() + 20);
				Game.Faction.get(3).setFactionValue(Game.Faction.get(3).getFactionValue() -20);
				Game.Faction.get(4).setFactionValue(Game.Faction.get(4).getFactionValue() + 20);
				Game.Faction.get(5).setFactionValue(Game.Faction.get(5).getFactionValue() + 40);
				Game.cash = Game.cash + 15;
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
				Game.Faction.get(3).setFactionValue(Game.Faction.get(3).getFactionValue() -20);
				Game.Faction.get(4).setFactionValue(Game.Faction.get(4).getFactionValue() -20);
				Game.Faction.get(5).setFactionValue(Game.Faction.get(5).getFactionValue() + 20);
				Game.cash = Game.cash -20;
			}
			else if (userAnswer == 2){
				Game.Faction.get(0).setFactionValue(Game.Faction.get(0).getFactionValue() -20);
				Game.Faction.get(1).setFactionValue(Game.Faction.get(1).getFactionValue() - 40);
				Game.Faction.get(2).setFactionValue(Game.Faction.get(2).getFactionValue() + 40);
				Game.Faction.get(3).setFactionValue(Game.Faction.get(3).getFactionValue() + 20);
				Game.Faction.get(4).setFactionValue(Game.Faction.get(4).getFactionValue() + 20);
				Game.Faction.get(5).setFactionValue(Game.Faction.get(5).getFactionValue() -20);
				Game.cash = Game.cash + 10;
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
				Game.Faction.get(4).setFactionValue(Game.Faction.get(4).getFactionValue() -20);
				Game.cash = Game.cash -20;
			}
			else if (userAnswer == 2){
				Game.Faction.get(0).setFactionValue(Game.Faction.get(0).getFactionValue() -20);
				Game.Faction.get(1).setFactionValue(Game.Faction.get(1).getFactionValue() -20);
				Game.Faction.get(2).setFactionValue(Game.Faction.get(2).getFactionValue() + 40);
				Game.Faction.get(3).setFactionValue(Game.Faction.get(3).getFactionValue() + 40);
				Game.Faction.get(4).setFactionValue(Game.Faction.get(4).getFactionValue() + 20);
				Game.cash = Game.cash + 10;
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
				Game.Faction.get(4).setFactionValue(Game.Faction.get(4).getFactionValue() -20);
				Game.cash = Game.cash -20;
			}
			else if (userAnswer == 2){
				Game.Faction.get(1).setFactionValue(Game.Faction.get(1).getFactionValue() -20);
				Game.Faction.get(2).setFactionValue(Game.Faction.get(2).getFactionValue() + 60);
				Game.Faction.get(3).setFactionValue(Game.Faction.get(3).getFactionValue() + 40);
				Game.Faction.get(4).setFactionValue(Game.Faction.get(4).getFactionValue() + 20);
				Game.cash = Game.cash + 10;
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
				Game.Faction.get(0).setFactionValue(Game.Faction.get(0).getFactionValue() -20);
				Game.Faction.get(1).setFactionValue(Game.Faction.get(1).getFactionValue() + 20);
				Game.Faction.get(2).setFactionValue(Game.Faction.get(2).getFactionValue() - 40);
				Game.Faction.get(3).setFactionValue(Game.Faction.get(3).getFactionValue() -20);
				Game.Faction.get(4).setFactionValue(Game.Faction.get(4).getFactionValue() - 40);
				Game.Faction.get(5).setFactionValue(Game.Faction.get(5).getFactionValue() -20);
				Game.cash = Game.cash -20;
			}
			else if (userAnswer == 2){
				Game.Faction.get(0).setFactionValue(Game.Faction.get(0).getFactionValue() + 20);
				Game.Faction.get(1).setFactionValue(Game.Faction.get(1).getFactionValue() -20);
				Game.Faction.get(2).setFactionValue(Game.Faction.get(2).getFactionValue() + 40);
				Game.Faction.get(3).setFactionValue(Game.Faction.get(3).getFactionValue() + 20);
				Game.Faction.get(4).setFactionValue(Game.Faction.get(4).getFactionValue() + 40);
				Game.Faction.get(5).setFactionValue(Game.Faction.get(5).getFactionValue() + 20);
				Game.cash = Game.cash + 10;
			}
			else {
				Decisions.oligarchy();
			}
			break;
		}
		Game.graphChecker();
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
				Game.Faction.get(0).setFactionValue(Game.Faction.get(0).getFactionValue() -20);
				Game.Faction.get(1).setFactionValue(Game.Faction.get(1).getFactionValue() - 60);
				Game.Faction.get(2).setFactionValue(Game.Faction.get(2).getFactionValue() + 20);
				Game.Faction.get(3).setFactionValue(Game.Faction.get(3).getFactionValue() + 20);
				Game.Faction.get(4).setFactionValue(Game.Faction.get(4).getFactionValue() + 20);
				Game.Faction.get(5).setFactionValue(Game.Faction.get(5).getFactionValue() + 20);
				Game.cash = Game.cash -20;
			}
			else if (userAnswer == 2){
				Game.Faction.get(0).setFactionValue(Game.Faction.get(0).getFactionValue() + 20);
				Game.Faction.get(1).setFactionValue(Game.Faction.get(1).getFactionValue() + 60);
				Game.Faction.get(2).setFactionValue(Game.Faction.get(2).getFactionValue() -20);
				Game.Faction.get(3).setFactionValue(Game.Faction.get(3).getFactionValue() -20);
				Game.Faction.get(4).setFactionValue(Game.Faction.get(4).getFactionValue() -20);
				Game.Faction.get(5).setFactionValue(Game.Faction.get(5).getFactionValue() -20);
				Game.cash = Game.cash + 10;
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
				Game.cash = Game.cash -20;
			}
			else if (userAnswer == 2){
				Game.Faction.get(1).setFactionValue(Game.Faction.get(1).getFactionValue() + 40);
				Game.Faction.get(2).setFactionValue(Game.Faction.get(2).getFactionValue() -20);
				Game.Faction.get(3).setFactionValue(Game.Faction.get(3).getFactionValue() -20);
				Game.Faction.get(4).setFactionValue(Game.Faction.get(4).getFactionValue() -20);
				Game.Faction.get(5).setFactionValue(Game.Faction.get(5).getFactionValue() -20);
				Game.cash = Game.cash + 10;
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
				Game.Faction.get(1).setFactionValue(Game.Faction.get(1).getFactionValue() -20);
				Game.Faction.get(2).setFactionValue(Game.Faction.get(2).getFactionValue() + 20);
				Game.Faction.get(3).setFactionValue(Game.Faction.get(3).getFactionValue() + 20);
				Game.Faction.get(4).setFactionValue(Game.Faction.get(4).getFactionValue() + 20);
				Game.Faction.get(5).setFactionValue(Game.Faction.get(5).getFactionValue() + 20);
				Game.cash = Game.cash -20;
			}
			else if (userAnswer == 2){
				Game.Faction.get(0).setFactionValue(Game.Faction.get(0).getFactionValue() + 60);
				Game.Faction.get(1).setFactionValue(Game.Faction.get(1).getFactionValue() + 20);
				Game.Faction.get(2).setFactionValue(Game.Faction.get(2).getFactionValue() -20);
				Game.Faction.get(3).setFactionValue(Game.Faction.get(3).getFactionValue() -20);
				Game.Faction.get(4).setFactionValue(Game.Faction.get(4).getFactionValue() -20);
				Game.Faction.get(5).setFactionValue(Game.Faction.get(5).getFactionValue() -20);
				Game.cash = Game.cash + 10;
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
				Game.Faction.get(0).setFactionValue(Game.Faction.get(0).getFactionValue() -20);
				Game.Faction.get(1).setFactionValue(Game.Faction.get(1).getFactionValue() -20);
				Game.Faction.get(2).setFactionValue(Game.Faction.get(2).getFactionValue() + 20);
				Game.Faction.get(3).setFactionValue(Game.Faction.get(3).getFactionValue() + 20);
				Game.Faction.get(4).setFactionValue(Game.Faction.get(4).getFactionValue() + 20);
				Game.cash = Game.cash -20;
			}
			else if (userAnswer == 2){
				Game.Faction.get(0).setFactionValue(Game.Faction.get(0).getFactionValue() + 20);
				Game.Faction.get(1).setFactionValue(Game.Faction.get(1).getFactionValue() + 20);
				Game.Faction.get(2).setFactionValue(Game.Faction.get(2).getFactionValue() -20);
				Game.Faction.get(3).setFactionValue(Game.Faction.get(3).getFactionValue() -20);
				Game.Faction.get(4).setFactionValue(Game.Faction.get(4).getFactionValue() -20);
				Game.cash = Game.cash + 10;
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
				Game.Faction.get(1).setFactionValue(Game.Faction.get(1).getFactionValue() -20);
				Game.Faction.get(2).setFactionValue(Game.Faction.get(2).getFactionValue() + 20);
				Game.Faction.get(3).setFactionValue(Game.Faction.get(3).getFactionValue() + 20);
				Game.Faction.get(4).setFactionValue(Game.Faction.get(4).getFactionValue() -20);
				Game.Faction.get(5).setFactionValue(Game.Faction.get(5).getFactionValue() + 20);
				Game.cash = Game.cash + 10;
			}
			else if (userAnswer == 2){
				Game.Faction.get(0).setFactionValue(Game.Faction.get(0).getFactionValue() + 60);
				Game.Faction.get(1).setFactionValue(Game.Faction.get(1).getFactionValue() + 20);
				Game.Faction.get(2).setFactionValue(Game.Faction.get(2).getFactionValue() -20);
				Game.Faction.get(3).setFactionValue(Game.Faction.get(3).getFactionValue() -20);
				Game.Faction.get(4).setFactionValue(Game.Faction.get(4).getFactionValue() + 20);
				Game.Faction.get(5).setFactionValue(Game.Faction.get(5).getFactionValue() -20);
				Game.cash = Game.cash + 10;
			}
			else {
				Decisions.people();
			}
			break;
		}
		Game.graphChecker();
	}
	
	public static void opposition(){
		Scanner userInput = new Scanner(System.in);
		switch ((int)((Math.random()*5)+1)){
		case 1:
			System.out.println("The General Prosecutor hit the lawyer in a criminal case with a book in the courthouse. Imprision the General Prosecutor?");
			System.out.println("1) Yes ($50,000)");
			System.out.println("2) No");
			userAnswer = userInput.nextInt();
			if (userAnswer == 1){
				Game.Faction.get(0).setFactionValue(Game.Faction.get(0).getFactionValue() - 60);
				Game.Faction.get(2).setFactionValue(Game.Faction.get(2).getFactionValue() + 20);
				Game.Faction.get(3).setFactionValue(Game.Faction.get(3).getFactionValue() + 20);
				Game.Faction.get(4).setFactionValue(Game.Faction.get(4).getFactionValue() + 20);
				Game.Faction.get(5).setFactionValue(Game.Faction.get(5).getFactionValue() -20);
				Game.cash = Game.cash - 15;
			}
			else if (userAnswer == 2){
				Game.Faction.get(0).setFactionValue(Game.Faction.get(0).getFactionValue() + 60);
				Game.Faction.get(2).setFactionValue(Game.Faction.get(2).getFactionValue() -20);
				Game.Faction.get(3).setFactionValue(Game.Faction.get(3).getFactionValue() -20);
				Game.Faction.get(4).setFactionValue(Game.Faction.get(4).getFactionValue() -20);
				Game.Faction.get(5).setFactionValue(Game.Faction.get(5).getFactionValue() + 20);
				Game.cash = Game.cash + 15;
			}
			else {
				Decisions.opposition();
			}
			break;
		case 2:
			System.out.println("A judge struck a victim with a hammer in the courthouse. Fine the quick-tempered judge?");
			System.out.println("1) Yes");
			System.out.println("2) No");
			userAnswer = userInput.nextInt();
			if (userAnswer == 1){
				Game.Faction.get(0).setFactionValue(Game.Faction.get(0).getFactionValue() - 60);
				Game.Faction.get(1).setFactionValue(Game.Faction.get(1).getFactionValue() + 20);
				Game.Faction.get(2).setFactionValue(Game.Faction.get(2).getFactionValue() + 20);
				Game.Faction.get(3).setFactionValue(Game.Faction.get(3).getFactionValue() + 20);
				Game.Faction.get(4).setFactionValue(Game.Faction.get(4).getFactionValue() + 20);
				Game.Faction.get(5).setFactionValue(Game.Faction.get(5).getFactionValue() -20);
				Game.cash = Game.cash -20;
			}
			else if (userAnswer == 2){
				Game.Faction.get(0).setFactionValue(Game.Faction.get(0).getFactionValue() + 60);
				Game.Faction.get(1).setFactionValue(Game.Faction.get(1).getFactionValue() -20);
				Game.Faction.get(2).setFactionValue(Game.Faction.get(2).getFactionValue() -20);
				Game.Faction.get(3).setFactionValue(Game.Faction.get(3).getFactionValue() -20);
				Game.Faction.get(4).setFactionValue(Game.Faction.get(4).getFactionValue() -20);
				Game.Faction.get(5).setFactionValue(Game.Faction.get(5).getFactionValue() + 20);
				Game.cash = Game.cash + 10;
			}
			else {
				Decisions.opposition();
			}
			break;
		case 3:
			System.out.println("Close the famous Dictator museum?");
			System.out.println("1) Yes");
			System.out.println("2) No");
			userAnswer = userInput.nextInt();
			if (userAnswer == 1){
				Game.Faction.get(0).setFactionValue(Game.Faction.get(0).getFactionValue() -20);
				Game.Faction.get(1).setFactionValue(Game.Faction.get(1).getFactionValue() + 20);
				Game.Faction.get(2).setFactionValue(Game.Faction.get(2).getFactionValue() -20);
				Game.Faction.get(3).setFactionValue(Game.Faction.get(3).getFactionValue() + 20);
				Game.Faction.get(4).setFactionValue(Game.Faction.get(4).getFactionValue() -20);
				Game.Faction.get(4).setFactionValue(Game.Faction.get(4).getFactionValue() -20);
				Game.cash = Game.cash -20;
			}
			else if (userAnswer == 2){
				Game.Faction.get(0).setFactionValue(Game.Faction.get(0).getFactionValue() + 20);
				Game.Faction.get(1).setFactionValue(Game.Faction.get(1).getFactionValue() -20);
				Game.Faction.get(2).setFactionValue(Game.Faction.get(2).getFactionValue() + 20);
				Game.Faction.get(3).setFactionValue(Game.Faction.get(3).getFactionValue() -20);
				Game.Faction.get(4).setFactionValue(Game.Faction.get(4).getFactionValue() + 20);
				Game.Faction.get(4).setFactionValue(Game.Faction.get(4).getFactionValue() + 20);
				Game.cash = Game.cash + 10;
			}
			else {
				Decisions.opposition();
			}
			break;
		case 4:
			System.out.println("Prhibit driving buses while under the influence?");
			System.out.println("1) Yes");
			System.out.println("2) No");
			userAnswer = userInput.nextInt();
			if (userAnswer == 1){
				Game.Faction.get(0).setFactionValue(Game.Faction.get(0).getFactionValue() + 20);
				Game.Faction.get(1).setFactionValue(Game.Faction.get(1).getFactionValue() + 20);
				Game.Faction.get(2).setFactionValue(Game.Faction.get(2).getFactionValue() - 40);
				Game.Faction.get(3).setFactionValue(Game.Faction.get(3).getFactionValue() + 20);
				Game.cash = Game.cash -20;
			}
			else if (userAnswer == 2){
				Game.Faction.get(0).setFactionValue(Game.Faction.get(0).getFactionValue() -20);
				Game.Faction.get(1).setFactionValue(Game.Faction.get(1).getFactionValue() -20);
				Game.Faction.get(2).setFactionValue(Game.Faction.get(2).getFactionValue() + 40);
				Game.Faction.get(3).setFactionValue(Game.Faction.get(3).getFactionValue() -20);
				Game.cash = Game.cash + 10;
			}
			else {
				Decisions.opposition();
			}
			break;
		case 5:
			System.out.println("The prosecutors are selling alcohol at inflated prices in their casinos. Confiscate the gambling houses of the offenders for the benefit of the state?");
			System.out.println("1) Yes");
			System.out.println("2) No");
			userAnswer = userInput.nextInt();
			//cost 50,000
			if (userAnswer == 1){
				Game.Faction.get(0).setFactionValue(Game.Faction.get(0).getFactionValue() - 40);
				Game.Faction.get(1).setFactionValue(Game.Faction.get(1).getFactionValue() -20);
				Game.Faction.get(2).setFactionValue(Game.Faction.get(2).getFactionValue() + 20);
				Game.Faction.get(3).setFactionValue(Game.Faction.get(3).getFactionValue() + 20);
				Game.Faction.get(4).setFactionValue(Game.Faction.get(4).getFactionValue() + 20);
				Game.Faction.get(5).setFactionValue(Game.Faction.get(5).getFactionValue() + 20);
				Game.cash = Game.cash -20;
			}
			else if (userAnswer == 2){
				Game.Faction.get(0).setFactionValue(Game.Faction.get(0).getFactionValue() + 40);
				Game.Faction.get(1).setFactionValue(Game.Faction.get(1).getFactionValue() + 20);
				Game.Faction.get(2).setFactionValue(Game.Faction.get(2).getFactionValue() -20);
				Game.Faction.get(3).setFactionValue(Game.Faction.get(3).getFactionValue() -20);
				Game.Faction.get(4).setFactionValue(Game.Faction.get(4).getFactionValue() -20);
				Game.Faction.get(5).setFactionValue(Game.Faction.get(5).getFactionValue() -20);
				Game.cash = Game.cash + 10;
			}
			else {
				Decisions.opposition();
			}
			break;
		}
		Game.graphChecker();
	}
	
	public static void army(){
		Scanner userInput = new Scanner(System.in);
		switch ((int)((Math.random()*5)+1)){
		case 1:
			System.out.println("Take control of your uncle's factories for the needs of the military?");
			System.out.println("1) Yes");
			System.out.println("2) No");
			userAnswer = userInput.nextInt();
			if (userAnswer == 1){
				Game.Faction.get(0).setFactionValue(Game.Faction.get(0).getFactionValue() -20);
				Game.Faction.get(1).setFactionValue(Game.Faction.get(1).getFactionValue() -20);
				Game.Faction.get(2).setFactionValue(Game.Faction.get(2).getFactionValue() + 40);
				Game.Faction.get(4).setFactionValue(Game.Faction.get(4).getFactionValue() + 20);
				Game.Faction.get(5).setFactionValue(Game.Faction.get(5).getFactionValue() - 60);
				Game.cash = Game.cash -20;
			}
			else if (userAnswer == 2){
				Game.Faction.get(0).setFactionValue(Game.Faction.get(0).getFactionValue() + 20);
				Game.Faction.get(1).setFactionValue(Game.Faction.get(1).getFactionValue() + 20);
				Game.Faction.get(2).setFactionValue(Game.Faction.get(2).getFactionValue() - 40);
				Game.Faction.get(4).setFactionValue(Game.Faction.get(4).getFactionValue() -20);
				Game.Faction.get(5).setFactionValue(Game.Faction.get(5).getFactionValue() + 60);
				Game.cash = Game.cash + 10;
			}
			else {
				Decisions.army();
			}
			break;
		case 2:
			System.out.println("Raise the admirals' pensions by reducing the workers' pensions?");
			System.out.println("1) Yes");
			System.out.println("2) No");
			userAnswer = userInput.nextInt();
			if (userAnswer == 1){
				Game.Faction.get(0).setFactionValue(Game.Faction.get(0).getFactionValue() -20);
				Game.Faction.get(1).setFactionValue(Game.Faction.get(1).getFactionValue() - 40);
				Game.Faction.get(2).setFactionValue(Game.Faction.get(2).getFactionValue() - 40);
				Game.Faction.get(3).setFactionValue(Game.Faction.get(3).getFactionValue() -20);
				Game.Faction.get(4).setFactionValue(Game.Faction.get(4).getFactionValue() + 20);
				Game.Faction.get(5).setFactionValue(Game.Faction.get(5).getFactionValue() + 20);
				Game.cash = Game.cash -20;
			}
			else if (userAnswer == 2){
				Game.Faction.get(0).setFactionValue(Game.Faction.get(0).getFactionValue() + 20);
				Game.Faction.get(1).setFactionValue(Game.Faction.get(1).getFactionValue() + 40);
				Game.Faction.get(2).setFactionValue(Game.Faction.get(2).getFactionValue() + 40);
				Game.Faction.get(3).setFactionValue(Game.Faction.get(3).getFactionValue() + 20);
				Game.Faction.get(4).setFactionValue(Game.Faction.get(4).getFactionValue() -20);
				Game.Faction.get(5).setFactionValue(Game.Faction.get(5).getFactionValue() -20);
				Game.cash = Game.cash + 10;
			}
			else {
				Decisions.army();
			}
			break;
		case 3:
			System.out.println("Permit the use of forced labor of citizens for the construction of mansion");
			System.out.println("1) Yes");
			System.out.println("2) No");
			userAnswer = userInput.nextInt();
			if (userAnswer == 1){
				Game.Faction.get(0).setFactionValue(Game.Faction.get(0).getFactionValue() + 20);
				Game.Faction.get(1).setFactionValue(Game.Faction.get(1).getFactionValue() + 20);
				Game.Faction.get(2).setFactionValue(Game.Faction.get(2).getFactionValue() - 40);
				Game.Faction.get(3).setFactionValue(Game.Faction.get(3).getFactionValue() - 40);
				Game.Faction.get(4).setFactionValue(Game.Faction.get(4).getFactionValue() + 20);
				Game.Faction.get(5).setFactionValue(Game.Faction.get(5).getFactionValue() + 20);
				Game.cash = Game.cash -20;
			}
			else if (userAnswer == 2){
				Game.Faction.get(0).setFactionValue(Game.Faction.get(0).getFactionValue() -20);
				Game.Faction.get(1).setFactionValue(Game.Faction.get(1).getFactionValue() -20);
				Game.Faction.get(2).setFactionValue(Game.Faction.get(2).getFactionValue() + 40);
				Game.Faction.get(3).setFactionValue(Game.Faction.get(3).getFactionValue() + 40);
				Game.Faction.get(4).setFactionValue(Game.Faction.get(4).getFactionValue() -20);
				Game.Faction.get(5).setFactionValue(Game.Faction.get(5).getFactionValue() -20);
				Game.cash = Game.cash + 10;
			}
			else {
				Decisions.army();
			}
			break;
		case 4:
			System.out.println("Make oligarchs pay to build a railway for military troop trains?");
			System.out.println("1) Yes");
			System.out.println("2) No");
			userAnswer = userInput.nextInt();
			if (userAnswer == 1){
				Game.Faction.get(0).setFactionValue(Game.Faction.get(0).getFactionValue() -20);
				Game.Faction.get(1).setFactionValue(Game.Faction.get(1).getFactionValue() - 40);
				Game.Faction.get(2).setFactionValue(Game.Faction.get(2).getFactionValue() + 20);
				Game.Faction.get(3).setFactionValue(Game.Faction.get(3).getFactionValue() -20);
				Game.Faction.get(4).setFactionValue(Game.Faction.get(4).getFactionValue() + 20);
				Game.Faction.get(5).setFactionValue(Game.Faction.get(5).getFactionValue() + 20);
				Game.cash = Game.cash -20;
			}
			else if (userAnswer == 2){
				Game.Faction.get(0).setFactionValue(Game.Faction.get(0).getFactionValue() + 20);
				Game.Faction.get(1).setFactionValue(Game.Faction.get(1).getFactionValue() + 40);
				Game.Faction.get(2).setFactionValue(Game.Faction.get(2).getFactionValue() -20);
				Game.Faction.get(3).setFactionValue(Game.Faction.get(3).getFactionValue() + 20);
				Game.Faction.get(4).setFactionValue(Game.Faction.get(4).getFactionValue() -20);
				Game.Faction.get(5).setFactionValue(Game.Faction.get(5).getFactionValue() -20);
				Game.cash = Game.cash + 10;
			}
			else {
				Decisions.army();
			}
			break;
		case 5:
			System.out.println("Your uncle's factory is delivering defective artillery shells. Permit the military to choose another supplier?");
			System.out.println("1) Yes");
			System.out.println("2) No");
			userAnswer = userInput.nextInt();
			//cost 50,000
			if (userAnswer == 1){
				Game.Faction.get(1).setFactionValue(Game.Faction.get(1).getFactionValue() + 20);
				Game.Faction.get(2).setFactionValue(Game.Faction.get(2).getFactionValue() + 20);
				Game.Faction.get(4).setFactionValue(Game.Faction.get(4).getFactionValue() + 20);
				Game.Faction.get(5).setFactionValue(Game.Faction.get(5).getFactionValue() - 60);
				Game.cash = Game.cash -20;
			}
			else if (userAnswer == 2){
				Game.Faction.get(1).setFactionValue(Game.Faction.get(1).getFactionValue() -20);
				Game.Faction.get(2).setFactionValue(Game.Faction.get(2).getFactionValue() -20);
				Game.Faction.get(4).setFactionValue(Game.Faction.get(4).getFactionValue() -20);
				Game.Faction.get(5).setFactionValue(Game.Faction.get(5).getFactionValue() + 60);
				Game.cash = Game.cash + 10;
			}
			else {
				Decisions.army();
			}
			break;
		}
		Game.graphChecker();
	}
	
	public static void family(){
		Scanner userInput = new Scanner(System.in);
		switch ((int)((Math.random()*5)+1)){
		case 1:
			System.out.println("Your younger son is thinking of becoming a military man. Give him a sniper rifle as a present?");
			System.out.println("1) Yes");
			System.out.println("2) No");
			userAnswer = userInput.nextInt();
			if (userAnswer == 1){
				Game.Faction.get(1).setFactionValue(Game.Faction.get(1).getFactionValue() + 20);
				Game.Faction.get(2).setFactionValue(Game.Faction.get(2).getFactionValue() -20);
				Game.Faction.get(3).setFactionValue(Game.Faction.get(3).getFactionValue() -20);
				Game.Faction.get(4).setFactionValue(Game.Faction.get(4).getFactionValue() + 20);
				Game.Faction.get(5).setFactionValue(Game.Faction.get(5).getFactionValue() + 20);
				Game.cash = Game.cash -20;
			}
			else if (userAnswer == 2){
				Game.Faction.get(1).setFactionValue(Game.Faction.get(1).getFactionValue() -20);
				Game.Faction.get(2).setFactionValue(Game.Faction.get(2).getFactionValue() + 20);
				Game.Faction.get(3).setFactionValue(Game.Faction.get(3).getFactionValue() + 20);
				Game.Faction.get(4).setFactionValue(Game.Faction.get(4).getFactionValue() -20);
				Game.Faction.get(5).setFactionValue(Game.Faction.get(5).getFactionValue() -20);
				Game.cash = Game.cash + 10;
			}
			else {
				Decisions.family();
			}
			break;
		case 2:
			System.out.println("Your youngest son got into a fight with his best friend. Arrest the little offender and his parents?");
			System.out.println("1) Yes");
			System.out.println("2) No");
			userAnswer = userInput.nextInt();
			if (userAnswer == 1){
				Game.Faction.get(0).setFactionValue(Game.Faction.get(0).getFactionValue() + 20);
				Game.Faction.get(2).setFactionValue(Game.Faction.get(2).getFactionValue() - 40);
				Game.Faction.get(3).setFactionValue(Game.Faction.get(3).getFactionValue() -20);
				Game.Faction.get(4).setFactionValue(Game.Faction.get(4).getFactionValue() -20);
				Game.Faction.get(5).setFactionValue(Game.Faction.get(5).getFactionValue() + 20);
				Game.cash = Game.cash -20;
			}
			else if (userAnswer == 2){
				Game.Faction.get(0).setFactionValue(Game.Faction.get(0).getFactionValue() -20);
				Game.Faction.get(2).setFactionValue(Game.Faction.get(2).getFactionValue() + 40);
				Game.Faction.get(3).setFactionValue(Game.Faction.get(3).getFactionValue() + 20);
				Game.Faction.get(4).setFactionValue(Game.Faction.get(4).getFactionValue() + 20);
				Game.Faction.get(5).setFactionValue(Game.Faction.get(5).getFactionValue() -20);
				Game.cash = Game.cash + 10;
			}
			else {
				Decisions.family();
			}
			break;
		case 3:
			System.out.println("Your favorite race horse suffocated on beluga cavier. Arrest the cavier company?");
			System.out.println("1) Yes");
			System.out.println("2) No");
			userAnswer = userInput.nextInt();
			if (userAnswer == 1){
				Game.Faction.get(1).setFactionValue(Game.Faction.get(1).getFactionValue() -20);
				Game.Faction.get(2).setFactionValue(Game.Faction.get(2).getFactionValue() - 40);
				Game.Faction.get(3).setFactionValue(Game.Faction.get(3).getFactionValue() - 40);
				Game.Faction.get(5).setFactionValue(Game.Faction.get(5).getFactionValue() + 20);
				Game.cash = Game.cash -20;
			}
			else if (userAnswer == 2){
				Game.Faction.get(1).setFactionValue(Game.Faction.get(1).getFactionValue() + 20);
				Game.Faction.get(2).setFactionValue(Game.Faction.get(2).getFactionValue() + 40);
				Game.Faction.get(3).setFactionValue(Game.Faction.get(3).getFactionValue() + 40);
				Game.Faction.get(5).setFactionValue(Game.Faction.get(5).getFactionValue() -20);
				Game.cash = Game.cash + 10;
			}
			else {
				Decisions.family();
			}
			break;
		case 4:
			System.out.println("Give your lover a fur coat of snow leopard for her birthday?");
			System.out.println("1) Yes ($50,000)");
			System.out.println("2) No");
			userAnswer = userInput.nextInt();
			if (userAnswer == 1){
				Game.Faction.get(0).setFactionValue(Game.Faction.get(0).getFactionValue() + 20);
				Game.Faction.get(1).setFactionValue(Game.Faction.get(1).getFactionValue() -20);
				Game.Faction.get(2).setFactionValue(Game.Faction.get(2).getFactionValue() -20);
				Game.Faction.get(3).setFactionValue(Game.Faction.get(3).getFactionValue() - 40);
				Game.Faction.get(4).setFactionValue(Game.Faction.get(4).getFactionValue() -20);
				Game.Faction.get(5).setFactionValue(Game.Faction.get(5).getFactionValue() + 20);
				Game.cash = Game.cash - 15;
			}
			else if (userAnswer == 2){
				Game.Faction.get(0).setFactionValue(Game.Faction.get(0).getFactionValue() + 20);
				Game.Faction.get(1).setFactionValue(Game.Faction.get(1).getFactionValue() -20);
				Game.Faction.get(2).setFactionValue(Game.Faction.get(2).getFactionValue() -20);
				Game.Faction.get(3).setFactionValue(Game.Faction.get(3).getFactionValue() - 40);
				Game.Faction.get(4).setFactionValue(Game.Faction.get(4).getFactionValue() -20);
				Game.Faction.get(5).setFactionValue(Game.Faction.get(5).getFactionValue() + 20);
				Game.cash = Game.cash + 15;
			}
			else {
				Decisions.family();
			}
			break;
		case 5:
			System.out.println("Double the number of your mistress' servants?");
			System.out.println("1) Yes");
			System.out.println("2) No");
			userAnswer = userInput.nextInt();
			//cost 50,000
			if (userAnswer == 1){
				Game.Faction.get(0).setFactionValue(Game.Faction.get(0).getFactionValue() + 20);
				Game.Faction.get(1).setFactionValue(Game.Faction.get(1).getFactionValue() + 20);
				Game.Faction.get(2).setFactionValue(Game.Faction.get(2).getFactionValue() - 60);
				Game.Faction.get(3).setFactionValue(Game.Faction.get(3).getFactionValue() -20);
				Game.Faction.get(4).setFactionValue(Game.Faction.get(4).getFactionValue() -20);
				Game.Faction.get(5).setFactionValue(Game.Faction.get(5).getFactionValue() + 20);
				Game.cash = Game.cash -20;
			}
			else if (userAnswer == 2){
				Game.Faction.get(0).setFactionValue(Game.Faction.get(0).getFactionValue() + 20);
				Game.Faction.get(1).setFactionValue(Game.Faction.get(1).getFactionValue() + 20);
				Game.Faction.get(2).setFactionValue(Game.Faction.get(2).getFactionValue() - 60);
				Game.Faction.get(3).setFactionValue(Game.Faction.get(3).getFactionValue() -20);
				Game.Faction.get(4).setFactionValue(Game.Faction.get(4).getFactionValue() -20);
				Game.Faction.get(5).setFactionValue(Game.Faction.get(5).getFactionValue() + 20);
				Game.cash = Game.cash + 10;
			}
			else {
				Decisions.family();
			}
			break;
		}
		Game.graphChecker();
	}

}
