package com.Sprint2;

import java.util.Scanner;

import com.Sprint2.daoimpl.StudentDaoimpl;

public class App 
{
    public static void main( String[] args )
    {
     StudentDaoimpl cado = new StudentDaoimpl ();
     char a;
 	do {
 		@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
 		System.out.println("------Student Registration system----");
 		System.out.println("enter your choice");
 		System.out.println("1.Add\n  2.Read\n  3.Update\n  4.Delete\n  5.Exit");
 		int ch = sc.nextInt();
 		
 		switch(ch) {
		case 1: cado.addStudent();
		break;
		
		case 2: cado.getStudentBy();
		break;
		
		case 3: cado.updateStudent();
		break;
		
		case 4: cado.deleteStudent();
		break;
		
		case 5:
			System.exit(0);
			break;
			default:
				System.out.println("invalid choice");
				
		}
		System.out.println("Do you want to continue ? Y/N");
			a =sc.next().charAt(0);
	
       }
	  while(a=='Y' || a =='y');
	System.out.println("Thank you");
	}

    }

