import java.util.Scanner;
public class Cal04{	
	public static void main(String[] args){
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter Number 1");
			int num1 = scan.nextInt();


			System.out.println("Enter OPCODE");

			String op1 = scan.next();


                     {

                     }

			System.out.println("Enter Number 2");
			int num2 = scan.nextInt();
			int num3 = 0;

			
			
		switch(op1){
			case "+" : num3 = num1 + num2;break;
			case "-" : num3 = num1 - num2;break;
			case "*" : num3 = num1 * num2;break;
			case "/" : num3 = num1 / num2;break;
			case "&" : num3 = num1 & num2;break; 
			default : op1 = "ER"; break;
			}



			
			if(op1.equals("ER")){
				System.out.println("Error");
			}else{
			System.out.println(num1 + op1 + num2 + "=" + num3);
				
			}
		;

		}
	}