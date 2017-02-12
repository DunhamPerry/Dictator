import java.util.Scanner;

public class Police {
		static int userAnswer = 0;
	public static void main(String[] args) {
	}
	public static void runner(){
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
				Police.runner();
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
				Police.runner();
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
				Police.runner();
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
				Police.runner();
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
				Police.runner();
			}
			break;
		}
			Game.frameMaker();

	}

}
