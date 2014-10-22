package ru.spbstu.telematics.stu.collections;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Start");
		Vector my_vector = new Vector();
		my_vector.add("0");
		my_vector.add(4356);
		my_vector.add(1);
		my_vector.add("qwe", 1);
		my_vector.add("3");
		
		for (Object object : my_vector)
			System.out.println("element: " + object);

		my_vector.remove(1);

		System.out.println("\n");

		for (Object object : my_vector)
			System.out.println("element: " + object);

		System.out.println(my_vector.size());
		System.out.println("End");
	}
}
