package com.lyf;


import java.util.List;
import java.util.Scanner;

public class CallNumber {

	int a,b,c;//�����������������
	public void getNum(){
		System.out.println("���С��������1~9�е�������ͬ�����֣�");
		Scanner scanner = new Scanner(System.in);
		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();
		
		
		for(int i=1;i<=100;i++){
			int m = i/10;
			int n = i%10;
				if(i==a||m==a||n==a){System.out.println("Fizz");continue;}
				else if(i%a==0&&i%b==0&&i%c==0){System.out.println("FizzBuzzWhizz");continue;}
				else if(i%a==0&&i%b==0&&i%c!=0){System.out.println("FizzBuzz");continue;}
				else if(i%a==0&&i%b!=0&&i%c==0){System.out.println("FizzWhizz");continue;}
				else if(i%a!=0&&i%b==0&&i%c==0){System.out.println("BuzzWhizz");continue;}
				else if(i%a==0&&i%b!=0&&i%c!=0){System.out.println("Fizz");continue;}
				else if(i%a!=0&&i%b==0&&i%c!=0){System.out.println("Buzz");continue;}
				else if(i%a!=0&&i%b!=0&&i%c==0){System.out.println("Whizz");continue;}
				else {System.out.println(i);continue;}	
		}
		
	}
	
	
	
}
