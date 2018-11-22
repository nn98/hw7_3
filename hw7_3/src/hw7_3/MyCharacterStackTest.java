package hw7_3;

import java.util.EmptyStackException;
import java.util.Scanner;

public class MyCharacterStackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyCharacterStack stack=new MyCharacterStack();
		String a="+";
		System.out.print(a=="+");
		System.out.print("hw7_3: ������\n\n���� �Է�: ");
		Scanner s=new Scanner(System.in);
		String m=s.nextLine();
		try {
			con(m,stack);
			if (stack.isEmpty()) System.out.println("�ùٸ� ��ȣ �����Դϴ�.");
			else System.out.println("�߸��� ��ȣ �����Դϴ�.");
		}
		catch (EmptyStackException e) {
			System.out.println("�߸��� ��ȣ �����Դϴ�.");
		}
		
	}
	public static boolean con(String s1, MyCharacterStack stack) {
		char[] arr=s1.toCharArray();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]=='('||arr[i]=='<') stack.push(arr[i]);
			else if(arr[i]==')'&&stack.peek()=='(') stack.pop();
			else if(arr[i]=='>'&&stack.peek()=='<') stack.pop();
		}
		return stack.isEmpty();
	}
}
