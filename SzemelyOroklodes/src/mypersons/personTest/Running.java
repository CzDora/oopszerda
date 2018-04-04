package mypersons.personTest;

import java.util.Scanner;

import mypersons.Child;
import mypersons.Parent;
import mypersons.Person;

public class Running {

	public static void main(String[] args) {
		Person person1;
		Person person2;
		
		String name;
		int age;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Name, age:");
		name = input.nextLine();
		age = input.nextInt(); input.nextLine();
		
        if (age < 18) {
        	
        	System.out.println("school:");
        	String school = input.nextLine();
        	person1 = new Child(name, age, school);
			
		} else {
             System.out.println("workplace:");
             String workplace = input.nextLine();
             person1 = new Parent(name, age, workplace);
		}
        
        System.out.println(person1);
		System.out.println(person1.getClass());
		System.out.println(person1 instanceof Person);
		System.out.println(person1 instanceof Child);
		System.out.println(person1 instanceof Parent);
		
		input.close();

	}

}
