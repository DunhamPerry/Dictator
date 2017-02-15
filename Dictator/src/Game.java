import java.util.ArrayList;
import java.awt.*;
import javax.swing.JFrame;
import java.util.Scanner;

public class Game extends Canvas{
	static ArrayList<Factions> Faction = new ArrayList<Factions>();
	private static final long	serialVersionUID	= 1L;
	static int cash = 119;
	
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
			//Decisions.opposition();
		}
		else if (userAnswer == 5){
			//Decisions.army();
		}
		else if (userAnswer == 6){
			//Decisions.family();
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
public static void graphChecker(){
	System.out.println("Police: " + Faction.get(0).getFactionValue());
	System.out.println("Oligarchy: " + Faction.get(1).getFactionValue());
	System.out.println("People: " + Faction.get(2).getFactionValue());
	System.out.println("Opposition: " + Faction.get(3).getFactionValue());
	System.out.println("Army: " + Faction.get(4).getFactionValue());
	System.out.println("Family: " + Faction.get(5).getFactionValue());
	
	if (Faction.get(0).getFactionValue() > 238){
		Faction.get(0).setFactionValue(238);
	}
	else if (Faction.get(0).getFactionValue() < 0){
		Faction.get(0).setFactionValue(0);
		factionHatesYou();
	}
	else {
	}
	if (Faction.get(1).getFactionValue() > 238){
		Faction.get(1).setFactionValue(238);
	}
	else if (Faction.get(1).getFactionValue() < 0){
		Faction.get(1).setFactionValue(0);
		factionHatesYou();
	}
	else {
	}
	if (Faction.get(2).getFactionValue() > 238){
		Faction.get(2).setFactionValue(238);
	}
	else if (Faction.get(2).getFactionValue() < 0){
		Faction.get(2).setFactionValue(0);
		factionHatesYou();
	}
	else {
	}
	if (Faction.get(3).getFactionValue() > 238){
		Faction.get(3).setFactionValue(238);
	}
	else if (Faction.get(3).getFactionValue() < 0){
		Faction.get(3).setFactionValue(0);
		factionHatesYou();
	}
	else {
	}
	if (Faction.get(4).getFactionValue() > 238){
		Faction.get(4).setFactionValue(238);
	}
	else if (Faction.get(4).getFactionValue() < 0){
		Faction.get(4).setFactionValue(0);
		factionHatesYou();
	}
	else {
	}
	if (Faction.get(5).getFactionValue() > 238){
		Faction.get(5).setFactionValue(238);
	}
	else if (Faction.get(5).getFactionValue() < 0){
		Faction.get(5).setFactionValue(0);
		factionHatesYou();
	}
	else {
	}
	
	if (cash < 0){
		noMoney();
	}
	else{
	}
	
	frameMaker();
}

public static void noMoney(){
	System.out.println();
	System.out.println("Your bank vault is empty");
	System.out.println("You no longer have the funds to bribe the groups");
	System.exit(0);
}
public static void factionHatesYou(){
	System.out.println();
	System.out.println("REBELLION!");
	System.out.println("You have been overthrown in a deadly coup and your lifeless remains now hang outside your palace");
	System.exit(0);
}

}
