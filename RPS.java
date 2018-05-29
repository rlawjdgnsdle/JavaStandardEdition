import java.util.Scanner;
public class RPS{
		public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		System.out.println("Let's play RSP GAME Give me Rock or Sissor or Paper");

		String player1 = scan.next();

		String player2 = scan.next();


		String result = "";

		if(player1.equals("Rock") && player2.equals("Rock")
						||
		  (player1.equals("Sissor") && player2.equals("Sissor"))
		  				||
		  (player1.equals("Paper") && player2.equals("Paper"))

			){
			result = "Draw";

		}else if(player1.equals("Rock") && player2.equals("Sissor")
						||
			(player1.equals("Sissor") && player2.equals("Paper"))
						||
			(player1.equals("Paper") && player2.equals("Rock"))

			){
			result = "player1 win";
		
		}else if(player1.equals("Rock") && player2.equals("Paper")
						||
		  (player1.equals("Sissor") && player2.equals("Rock"))
		  				||
  		  (player1.equals("Paper") && player2.equals("Sissor"))

			){
			result = "player2 win";


		}



		System.out.println("The result is : " + result);

		}
}