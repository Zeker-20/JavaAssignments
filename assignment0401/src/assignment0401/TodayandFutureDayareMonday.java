package assignment0401;
import java.util.Scanner;
public class TodayandFutureDayareMonday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter today's day:");
		int td=input.nextInt();
		System.out.println("Enter the number of days elapsed since today:");
		int fd=input.nextInt();
		//使用字符串数组
		String[] Days= {"Sunday","Monday","Tuesday","Wednesday",
				"Thursday","Friday","Saturday"				
		};
		int x=fd%7+td;
		System.out.print( "Today is "+Days[td]+" and the future day is "+Days[x]);
		input.close();
	}

}
