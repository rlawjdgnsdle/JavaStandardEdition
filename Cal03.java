import java.util.Scanner;
public class Cal03{	
	public static void main(String[] args){
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter Number 1");
			int num1 = scan.nextInt();
			System.out.println("Enter OPCODE");
			System.out.println("if Plus than Enter 1");
			System.out.println("if Minus than Enter 2");
			System.out.println("if Multi Then Enter 3");
			System.out.println("if Divid then Enter 4");
			System.out.println("if Mudular then Enter 5");

			int opcode = scan.nextInt(); 

			System.out.println("Enter Number 2");
			int num2 = scan.nextInt();
			int num3 = 0;
			String op1 = "";
			
			
	
		

			if(opcode==1){
				num3 = num1 + num2; 
				op1 = "+";
				
		}else if(opcode==2){
				num3 = num1 - num2;
				op1 = "-";

		}else if(opcode==3){
				num3 = num1 * num2;
				op1 = "*";

		}else if(opcode==4){
				num3 = num1 / num2;
				op1 = "/";

		}else if(opcode==5){
				num3 = num1 % num2;
				op1 = "%";
		}

			System.out.println(num1 + op1 + num2 + "=" + num3);
			


		}
	}