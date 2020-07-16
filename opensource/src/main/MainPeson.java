package main;

import java.util.Scanner;

import com.trungtamjava.model.Person;
import com.trungtamjava.model.Train;
import com.trungtamjava.model.car;

public class MainPeson {
	public static void main(String[] args) {

		while (true) {
			System.out.println(" 1 : nhap thong tin ve xe");
			System.out.println("2 : nhap thong tin ve tau");
			System.out.println("3 : exit");

			System.out.println("chon thong tin");
			Scanner sc = new Scanner(System.in);
			int select = sc.nextInt();

			if (select == 1) {
				Person p = new car();
				input(p);
				info(p);
				break;
			} else if (select == 2) {
				Person p = new Train();
				input(p);
				info(p);
				break;
			} else if (select == 3) {
				break;
			}
		}
	}

	public static void input(Person p) {
		Scanner sc = new Scanner(System.in);

		if (p instanceof car) {
			System.out.println("nhap gia ve");
			((car) p).setPrice(sc.nextLine());
			System.out.println("nhap cho ngoi");
			((car) p).setSlot(sc.nextLine());
			System.out.println("nhap loai xe");
			((car) p).setTyle(sc.nextLine());
		} else if (p instanceof Train) {
			System.out.println("nhap gia ve");
			((Train) p).setPrice(sc.nextLine());
			System.out.println("nhap cho ngoi");
			((Train) p).setSlot(sc.nextLine());
			System.out.println("nhap so toa");
			((Train) p).setSotoa(sc.nextLine());

		}
	}

	public static void info(Person p) {
		if (p instanceof car) {

			System.out.println("gia ve xe: " + ((car) p).getPrice() + "cho ngoi: " + ((car) p).getSlot() + "loai xe: "
					+ ((car) p).getTyle());
		} else if (p instanceof Train) {

			System.out.println("gia ve xe: " + ((Train) p).getPrice() + " cho ngoi: " + ((Train) p).getSlot()
					+ "so toa: " + ((Train) p).getSotoa());
		}
	}
}
