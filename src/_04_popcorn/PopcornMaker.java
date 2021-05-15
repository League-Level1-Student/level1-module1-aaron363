package _04_popcorn;

import javax.swing.JOptionPane;

public class PopcornMaker {

	public static void main(String[] args) {
		String flavor = JOptionPane.showInputDialog("What flavor would you like?");
		Popcorn popcorn = new Popcorn(flavor);
		Microwave microwave = new Microwave();
		String timeToCookString = JOptionPane.showInputDialog("How many minutes to cook?");
		int timeToCook = Integer.parseInt(timeToCookString);
		microwave.putInMicrowave(popcorn);
		microwave.setTime(timeToCook);
		microwave.startMicrowave();
		
	}

}
