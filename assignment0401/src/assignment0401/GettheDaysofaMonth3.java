package assignment0401;
import java.util.Scanner;
public class GettheDaysofaMonth3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int y=input.nextInt();
		int m=input.nextInt();
		int d=Days(y,m);
		System.out.print(y+"."+m+" has "+d+" days");
		input.close();
		//��������·�
		//�ж��Ƿ������� �������
		//�ж��Ƿ��Ƕ��� �ǵĻ������ж����꺯�� ����ֱ�ӷ�������
	}
	static int Days(int y,int m) {
		if(m==2) {
			if(isYear(y))
				return 29;
			else
				return 28;
		}
		else {
			switch(m) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:return 31;
			default:return 30;
			}			
		}
	}
	static boolean isYear(int a)
	{
		int b=a%4;
		int c=a%100;
		int d=a%400;
		if(d==0||(b==0&&c!=0))
			return true;
		else
			return false;
	}

}
