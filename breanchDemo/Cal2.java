import java.util.Scanner;
public class Cal2{
	public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	System.out.println("Input N1");

	int num1 = scan.nextInt();

	System.out.println("Input Encode");

	String opcode = scan.next();

	System.out.println("Input num2");

	int num2 = scan.nextInt();

	int num3 = 0;




	if(opcode.equals("+")){
		num3 = num1 + num2;

	}else if(opcode.equals("-")){
		num3 = num1 - num2;

	}else if(opcode.equals("*")){
		num3 = num1 * num2;

	}else if(opcode.equals("/")){
		num3 = num1 / num2;

	}else if(opcode.equals("&")){
		num3 = num1 & num2;

	}


	System.out.print(num1 + opcode + num2 + "=" + num3); 


}

}