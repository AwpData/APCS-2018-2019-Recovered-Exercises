import java.util.*;
import java.io.*;

public class SeqSearch {
	public static void main(String[] args) throws FileNotFoundException {
		int Sevens = 0, Nines = 0, Fortyfives = 0;
		Scanner output = new Scanner(new File("src/SeqSearch.txt"));
		while (output.hasNextLine()) {
			String num = output.nextLine();
			System.out.println(num);
			if (num.equals("7")) {
				Sevens++;
				System.out.println("7 found");
			}
			if (num.equals("9")) {
				Nines++;
				System.out.println("9 found");
			}
			if (num.equals("45")) {
				Fortyfives++;
				System.out.println("45 found");
			}
			if (num.length() > 1) {
				String firsthalf = num.substring(0, 1);
				String secondhalf = num.substring(1);
				System.out.println(firsthalf);
				System.out.println(secondhalf);
				if (firsthalf.equals("7")) {
					Sevens++;
					System.out.println("7 found!");
				}
				if (secondhalf.equals("7")) {
					Sevens++;
					System.out.println("7 found!");
				}
				if (firsthalf.equals("9")) {
					Nines++;
					System.out.println("9 found!");
				}
				if (secondhalf.equals("9")) {
					Nines++;
					System.out.println("9 found!");
				}
			}
			System.out.println("Number of sevens: " + Sevens);
			System.out.println("Number of nines: " + Nines);
			System.out.println("Number of forty-fives: " + Fortyfives);
		}
	}
}
