import java.util.Scanner;

public class Aaa{
		public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Number1");

		int num1 = scan.nextInt();

		System.out.println("OPCODE");

		String opc = scan.next();

		System.out.println("Number2");

		int num2 = scan.nextInt();

		int num3 = 0;






		if(opc.equals("+")){
			num3 = num1 + num2;

		}else if(opc.equals("-")){
			num3 = num1 - num2;

		}else if(opc.equals("*")){
			num3 = num1 * num2;

		}else if(opc.equals("/")){
			num3 = num1 / num2;

		}else if(opc.equals("%")){
			num3 = num1 % num2;
		} 



		System.out.print(num1 + opc + num2 + "=" + num3);




		}
}