import java.util.Scanner;
public class Howmuch{
	public static void main(String[] args){

				System.out.println("How nmuch is it?");

				Scanner scan = new Scanner(System.in);

				int a = scan.nextInt();

				System.out.println(a + "$");

				System.out.println("How many do you want?");

				int b = scan.nextInt();

				System.out.println("Give me " + b);

				int c = a * b;

				System.out.println("It will be gonna " + c + "$");

				System.out.println("Discount Plz");

				System.out.println("What % Discount do you wnat");
				
				int d = scan.nextInt();

				// int price = 0;

				// price = c/100*(100-d);
				
				String result = "go away";

				


				if(d <= (10)){
					result = "It takes " +c/100*(100-d) + " $";
				}
				else{
}
					System.out.println(result);
}
}

				// if(!result.equals("ERROR")){
				// 	result = num1 + op1 + num2 + "=" + num3;
				// }
				// System.out.println(result);


 // 		int a = ;
 // 		int b = 
 // 		int c =
 // 		int d =












 // 		System.out.println("How many do you want");
	// System.out.println("Give me " + b);
	// System.out.println("It will be gonna 500$");
	// System.out.println("Discount Plz");
	// System.out.println("Sun Jae");
	// System.out.println("Go away");

	// System.out.println("Give me " +AAA);


	

	