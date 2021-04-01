package assignment0401;
import java.util.Scanner;
public class Convert16to2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a hex digit:");
		Scanner input=new Scanner(System.in);
		String a=input.next();
		char x=a.charAt(0);
		switch (x) {
		case '0':System.out.print("The binary value is 0000");break;
		case '1':System.out.print("The binary value is 0001");break;
		case '2':System.out.print("The binary value is 0010");break;
		case '3':System.out.print("The binary value is 0011");break;
		case '4':System.out.print("The binary value is 0100");break;
		case '5':System.out.print("The binary value is 0101");break;
		case '6':System.out.print("The binary value is 0110");break;
		case '7':System.out.print("The binary value is 0111");break;
		case '8':System.out.print("The binary value is 1000");break;
		case '9':System.out.print("The binary value is 1001");break;
		case 'A':System.out.print("The binary value is 1010");break;
		case 'B':System.out.print("The binary value is 1011");break;
		case 'C':System.out.print("The binary value is 1100");break;
		case 'D':System.out.print("The binary value is 1101");break;
		case 'E':System.out.print("The binary value is 1110");break;
		case 'F':System.out.print("The binary value is 1111");break;
		default:System.out.print(x+" is an invalid input");
		}
		input.close();
	}
	

}
