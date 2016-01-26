import java.util.*;

class TitleApplier {

	public static void main (String args[]) {
		String[] femaleNames = {"Amy", "Buffy", "Cathy"};
		String[] maleNames = {"Elroy", "Fred", "Graham"};

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a name.");
		String name;
		name = scanner.nextLine().trim();

		if(name.equals("")){ return; }
		String[] nameArr = name.split(" ");

		for(int x = 0; x < 3; x ++){
			if(nameArr[0].trim().equals(femaleNames[x])){ name = "Ms. " + name; }
			else if(nameArr[0].trim().equals(maleNames[x])){ name = "Mr. " + name; }
		}

		System.out.println(name + "\n");
		main(args);
	}
}