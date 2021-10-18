package com.xworkz.arrayOfObject;

public class LaptopTest {

	public static void displayInfo(Laptop objs[]) {
		System.out.println("Laptop Information");
		System.out.println();
		for (int i = 0; i < objs.length; i++) {
			if (objs[i].ramSize >= 4) {
				System.out.println("laptop Information");
				System.out.println(objs[i].brand);
				System.out.println(objs[i].price);
				System.out.println(objs[i].color);
				System.out.println(objs[i].ramSize);
				System.out.println("---------------------------");
			}
		}
	}

	public static void main(String[] args) {
		Laptop laptop1 = new Laptop("Lenovo", 48000, "Black", 8);
		Laptop laptop2 = new Laptop("Dell", 35000, "Grey", 4);
		Laptop laptop3 = new Laptop("Hp", 45000, "Silver", 16);
		Laptop laptop4 = new Laptop("Acer", 50000, "Black", 8);
		Laptop laptop5 = new Laptop("Xiomi", 45000, "Black", 16);

		Laptop objs[] = { laptop1, laptop2, laptop3, laptop4, laptop5 };
		LaptopTest.displayInfo(objs);
	}

}
