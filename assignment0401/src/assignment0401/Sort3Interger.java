package assignment0401;
import java.util.Scanner;
public class Sort3Interger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter three integers:");
		int a=input.nextInt();
		int b=input.nextInt();
		int c=input.nextInt();
		if(a>b&&a>c) {
			int temp=c;c=a;a=temp;//java中交换值需要借助temp吗，需要 python需要吗 不需要？！！
			if(a>b) {
				int temp1=a;a=b;b=temp1;
			}
		}
		if(b>a&&b>c) {
			int temp2=c;c=b;b=temp2;//java中交换值需要借助temp吗，需要 python需要吗 不需要~！
			if(a>b) {
				int temp3=a;a=b;b=temp3;
			}			
		}
		if(c>a&&c>b) {
			if(a>b) {
				int temp4=a;a=b;b=temp4;
			}
		}
		System.out.print(a+" "+b+" "+c);//' '和" "有区别吗  双引号字符串 单引号可以转为Unicode码进行计算
		input.close();//' '表示什么呢？
	}
}
