package my.assesment;

import java.util.Scanner;

public class Switchcase {
	public static void main(String[]args){
		int choice;
		System.out.println("Pick one:1.hi\t 2.hey\t 3.hello\t");
		Scanner s=new Scanner(System.in);
		choice=s.nextInt();
		switch(choice){
		case 1: System.out.println("You said hi");
		break;
		case 2:System.out.println("You said hey");
		break;
		case 3:System.out.println("You said hello");
		default:System.out.println("Invalid choice");
		
		}
}
}
