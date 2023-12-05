package com.MethodProgram;
import java.util.Scanner;
public class ArmstrongNumber {
public static boolean armstrongNumber(int num) {
	int count=0;
	int num2=num;
	int num3=num;
	int sum=0;
	while(num!=0) {
		num/=10;
		count++;
	}
	int exp=count;
	while(num2!=0) {
		int base=num2%10;
		sum=sum+power(base,exp);
		num2/=10;
	}
	if(num3==sum) {
		return true;
	}else {
		return false;
	}
}
public static int power(int base,int exp) {
	int res=1;
	for(int i=1;i<=exp;i++) {
		res=res*base;
	}
	return res;
	}
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter number");
	int num=scanner.nextInt();
	if(armstrongNumber(num)) {
		System.out.println("Armstrong number");
	}else {
		System.out.println("Not an Armstrong number");
	}
}
}
