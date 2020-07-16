package main;

import java.util.Scanner;

import com.trungtamjava.model.*;
public class MainAnimal {
			public static void main(String[] args) {
				
				
				Scanner sc = new Scanner(System.in);
				
				while(true) {
					System.out.println("1. nhap va in ra cho ga");
					System.out.println("2. menu dog");
					System.out.println("3. menu chicken");
					System.out.println("4 exit");
					
					int select = sc.nextInt();
					
					if(select == 1) {
						Animal a =  new Dog();
						Animal b = new Chicken();
								
						input(a);
						info(a);
					}else if(select == 2) {
						menuDog();
					}else if(select == 3) {
						menuChicken();
					}else if(select == 4 ) {
						break;
					}else {
						System.out.println("chon lai nha");
					}
				}
			}
			public static void menuChicken() {
				Scanner sc = new Scanner(System.in);
				System.out.println("nhap so ga");
				int n = sc.nextInt();
				
				Chicken [] chickens = new Chicken[n];
				
				for(int i = 0;  i < chickens.length; i ++) {
					chickens[i] =  new Chicken();
					input(chickens[i]);
				}
				
				for(Chicken c : chickens ) {
					info(c);
				}
				
			}
			
			public static void menuDog() {
				Scanner sc = new Scanner(System.in) ;
				System.out.println("nhap so cho");
				int n = sc.nextInt();
				
				Dog [] dogs = new Dog[n];
				
				for(int i = 0; i < dogs.length; i++) {
					dogs[i] = new Dog();
					input(dogs[i]);
				}
				
				for(Dog d : dogs) {
					info(d);
				}
			}
			
			public static void input(Animal a) {
				Scanner sc = new Scanner(System.in);
				
				if(a instanceof Dog) {
					System.out.println("nhap vao so loai cho");
					((Dog)a).setCho(sc.nextLine());
				}else {
				
				System.out.println("nhap vao so loai ga");
				((Chicken)a).setGa(sc.nextLine());
			}
			}
			
			public static void info(Animal a) {
				if(a instanceof Dog) {
					System.out.println("loai cho " + ((Dog)a).getCho());
				}else {
					System.out.println("loai ga " + ((Chicken)a).getGa());
				}
			}
			
			

}

