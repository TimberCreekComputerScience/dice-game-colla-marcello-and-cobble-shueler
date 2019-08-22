import java.util.Scanner;

public class Dice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner dice = new Scanner(System.in);
		int die1 = (int)(Math.random()*6)+1;
		int die2 = (int)(Math.random()*6)+1;
		System.out.println("You have to roll at least a 6 to win");
		System.out.println("How many dice do you want to roll,type 1 or 2?");
		int userInp = dice.nextInt();
		if (userInp == 1){
			System.out.println(die1);
			
		} else{
			System.out.println(die2);
		}
	}
	
}
	


