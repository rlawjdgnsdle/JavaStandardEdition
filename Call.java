import java.util.Scanner;
public class Call{
	public static void main(String[] args){
	Scanner scan =new Scanner(System.in);
	System.out.println("Enter No.1");	
	int num1 = scan.nextInt();
	
	System.out.println("Enter OPERCODE");
	
	String opcode = scan.next();

	System.out.println("Enter No.3");

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

}else if(opcode.equals("%")){
          num3 = num1 % num2;
 
}


	






	System.out.println(num1 + opcode + num2 + "=" + num3);

	}
}