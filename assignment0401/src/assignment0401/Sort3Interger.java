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
			int temp=c;c=a;a=temp;//java�н���ֵ��Ҫ����temp����Ҫ python��Ҫ�� ����Ҫ������
			if(a>b) {
				int temp1=a;a=b;b=temp1;
			}
		}
		if(b>a&&b>c) {
			int temp2=c;c=b;b=temp2;//java�н���ֵ��Ҫ����temp����Ҫ python��Ҫ�� ����Ҫ~��
			if(a>b) {
				int temp3=a;a=b;b=temp3;
			}			
		}
		if(c>a&&c>b) {
			if(a>b) {
				int temp4=a;a=b;b=temp4;
			}
		}
		System.out.print(a+" "+b+" "+c);//' '��" "��������  ˫�����ַ��� �����ſ���תΪUnicode����м���
		input.close();//' '��ʾʲô�أ�
	}
}
