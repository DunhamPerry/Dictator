import java.util.ArrayList;
import java.awt.*;
import javax.swing.JFrame;
import java.util.Scanner;

public class Game extends Canvas{
	static ArrayList<Factions> Faction = new ArrayList<Factions>();
	private static final long	serialVersionUID	= 1L;
	static int cash = 119;
	static int checker = 0;
	static int age = 35;
	
	public static void main(String[] args) {
		Faction.add(new Factions("Police", 119));
		Faction.add(new Factions("Oligarchy", 119));
		Faction.add(new Factions("People", 119));
		Faction.add(new Factions("Opposition", 119));
		Faction.add(new Factions("Army", 119));
		Faction.add(new Factions("Family", 119));
		
        graphChecker();
	}
	public static void runner(){
		Scanner userInput = new Scanner(System.in);
		System.out.println("Who would you like to consult with today, my Leader?");
		System.out.println("1) Police");
		System.out.println("2) Oligarchy");
		System.out.println("3) People");
		System.out.println("4) Opposition");
		System.out.println("5) Army");
		System.out.println("6) Family");
		int userAnswer = userInput.nextInt();
		
		if (userAnswer == 1){
			Decisions.police();
		}
		else if (userAnswer == 2){
			Decisions.oligarchy();
		}
		else if (userAnswer == 3){
			Decisions.people();
		}
		else if (userAnswer == 4){
			Decisions.opposition();
		}
		else if (userAnswer == 5){
			Decisions.army();
		}
		else if (userAnswer == 6){
			Decisions.family();
		}
	}
	public static void frameMaker(){
		Game canvas = new Game();
        JFrame frame = new JFrame();
        frame.setSize(300, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(canvas).setBackground(Color.white);
        frame.setLocationRelativeTo(null); //Sets JPanel to center of screen 
        frame.setResizable(false);
        frame.setVisible(true);
        runner();
	}
	
public void paint(Graphics graphics) 
	{	
		if (checker == 0){
        graphics.setColor(Color.red);
        graphics.fillRect(0, 0, 300, 50);
        
        graphics.setColor(Color.black);
        graphics.fillRect(30, 100, 240, 20);
        graphics.fillRect(30, 150, 240, 40);
        graphics.fillRect(30, 220, 240, 40);
        graphics.fillRect(30, 290, 240, 40);
        graphics.fillRect(30, 360, 240, 40);
        graphics.fillRect(30, 430, 240, 40);
        graphics.fillRect(30, 500, 240, 40);
        
        graphics.setColor(Color.white);
        graphics.fillRect(31, 101, 238, 18);
        graphics.fillRect(31, 151, 238, 38);
        graphics.fillRect(31, 221, 238, 38);
        graphics.fillRect(31, 291, 238, 38);
        graphics.fillRect(31, 361, 238, 38);
        graphics.fillRect(31, 431, 238, 38);
        graphics.fillRect(31, 501, 238, 38);
        
        graphics.setColor(Color.red);
        graphics.fillRect(31, 101, cash, 18);
        graphics.fillRect(31, 151, Faction.get(0).getFactionValue(), 38);
        graphics.fillRect(31, 221, Faction.get(1).getFactionValue(), 38);
        graphics.fillRect(31, 291, Faction.get(2).getFactionValue(), 38);
        graphics.fillRect(31, 361, Faction.get(3).getFactionValue(), 38);
        graphics.fillRect(31, 431, Faction.get(4).getFactionValue(), 38);
        graphics.fillRect(31, 501, Faction.get(5).getFactionValue(), 38);

        graphics.setColor(Color.white);
        graphics.drawString("DICTATOR", 115, 30);
        
        graphics.setColor(Color.red);
        graphics.drawString("CASH", 130, 95);
        graphics.drawString("POLICE", 130, 145);
        graphics.drawString("OLIGARCHY", 117, 215);
        graphics.drawString("PEOPLE", 130, 285);
        graphics.drawString("OPPOSITION", 117, 355);
        graphics.drawString("ARMY", 131, 425);
        graphics.drawString("FAMILY", 130, 495);
		}
		else if (checker == 1){
			graphics.setColor(Color.white);
			graphics.fillRect(0,0,300,600);
			
			graphics.setColor(Color.red);
			graphics.fillRect(50, 200, 200, 50);
			
			graphics.setColor(Color.white);
			graphics.drawString("YOU RAN OUT OF MONEY!", 80, 230);
		}
		else if (checker == 2){
			graphics.setColor(Color.white);
			graphics.fillRect(0,0,300,600);
			
			graphics.setColor(Color.red);
			graphics.fillRect(50, 200, 200, 50);
			
			graphics.setColor(Color.white);
			graphics.drawString("REBELLION!", 125, 225);
		}
	}
public static void graphChecker(){
	
	age++;
	if (Faction.get(0).getFactionValue() >= 238){
		cash = cash + 20;
		Faction.get(0).setFactionValue(238);
	}
	else if (Faction.get(0).getFactionValue() <= 0){
		Faction.get(0).setFactionValue(0);
		checker = 2;
		frameMaker();
	}
	else if (Faction.get(0).getFactionValue() >= 200){
		cash = cash + 20;
	}
	else {
	}
	if (Faction.get(1).getFactionValue() >= 238){
		cash = cash + 20;
		Faction.get(1).setFactionValue(238);
	}
	else if (Faction.get(1).getFactionValue() <= 0){
		Faction.get(1).setFactionValue(0);
		checker = 2;
		frameMaker();
	}
	else if (Faction.get(1).getFactionValue() >= 200){
		cash = cash + 20;
	}
	else {
	}
	if (Faction.get(2).getFactionValue() >= 238){
		cash = cash + 20;
		Faction.get(2).setFactionValue(238);
	}
	else if (Faction.get(2).getFactionValue() <= 0){
		Faction.get(2).setFactionValue(0);
		checker = 2;
		frameMaker();
	}
	else if (Faction.get(2).getFactionValue() >= 200){
		cash = cash + 20;
	}
	else {
	}
	if (Faction.get(3).getFactionValue() >= 238){
		cash = cash + 20;
		Faction.get(3).setFactionValue(238);
	}
	else if (Faction.get(3).getFactionValue() <= 0){
		Faction.get(3).setFactionValue(0);
		checker = 2;
		frameMaker();
	}
	else if (Faction.get(3).getFactionValue() >= 200){
		cash = cash + 20;
	}
	else {
	}
	if (Faction.get(4).getFactionValue() >= 238){
		cash = cash + 20;
		Faction.get(4).setFactionValue(238);
	}
	else if (Faction.get(4).getFactionValue() <= 0){
		Faction.get(4).setFactionValue(0);
		checker = 2;
		frameMaker();
	}
	else if (Faction.get(4).getFactionValue() >= 200){
		cash = cash + 20;
	}
	else {
	}
	if (Faction.get(5).getFactionValue() >= 238){
		cash = cash + 20;
		Faction.get(5).setFactionValue(238);
	}
	else if (Faction.get(5).getFactionValue() <= 0){
		Faction.get(5).setFactionValue(0);
		checker = 2;
		frameMaker();
	}
	else if (Faction.get(5).getFactionValue() >= 200){
		cash = cash + 20;
	}
	else {
	}
	if (cash <= 0){
		checker = 1;
		frameMaker();
	}
	else if (cash >= 200){
		cash = cash + 20;
	}
	int randomChance = (int)(Math.random()*4+1);
	if (age >= 40 && age < 60){
		if (randomChance >=4){
			System.out.println("You died at the ripe old age of " + age);
			System.exit(0);
		}
		else{}
	}
	else if (age >= 60 && age < 80){
		if (randomChance >=3){
			System.out.println("You died at the ripe old age of " + age);
			System.exit(0);
		}
		else{}
	}
	else if (age >= 80 && age < 100){
		if (randomChance >=2){
			System.out.println("You died at the ripe old age of " + age);
			System.exit(0);
		}
		else{}
	}
	else if (age == 100){
		System.out.println("You died at the ripe old age of " + age);
		System.exit(0);
	}
	
	frameMaker();
}

}
