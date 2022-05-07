package inter;

import java.util.Scanner;

public class Vovels {
	public static void main(String[] args) {
//		int count=0;
//	String str="kalpeshchaudhari";
//	for(int i=0;i<str.length();i++) {
//		char ch=str.charAt(i);
//		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
//			count++;
//			
//		}
//		
//	}System.out.println(count);

		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the number ");
//		int num=sc.nextInt();
//		int count=0;
//		for(int i=1;i<=num;i++) {
//			
//			if (num%i==0 && num%num==0) {
//				 count++;
//			}	
//		}
//		if(count==2) {
//			System.out.println("it is prime number" );
//		}else {
//			System.out.println("its not prime number");
//		}
		Scanner sc=new Scanner (System.in);
		System.out.println("ENTER THE NUM ");
		int num=sc.nextInt();
		int A=0;
		int B=0;
		int C=1;
		for(int i=0;i<num;i++) {
			A=B;
			B=C;
			C=A+B;
			System.out.print(A+ "  ");
		}
		
}
}