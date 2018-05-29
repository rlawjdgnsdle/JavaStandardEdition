import java.util.Scanner; 
public class RPS1{
	public static void main(String[] args){
		System.out.println("Present one of scissors, rocks, or papers. Player 1's turn");
		Scanner scan = new Scanner(System.in);

		String player1 = scan.next();
		

		System.out.println("Player 2's turn");

		String player2 = scan.next();
		

		String result = "";

		if(player1.equals ("Rock") && player2.equals("Rock")
				||
		  (player1.equals ("Sissor") && player2.equals("Sissor"))
				||
		  (player1.equals("Paper") && player2.equals("Paper"))
		

			){
			 result = "Draw";

		}


System.out.print("Result is " + result);

	}
}