import java.util.*;

class MicrowaveMenu {

	public static void main (String args[]) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter cook time --> ");
		String time;
		time = scanner.nextLine().trim();
		if(time.equals("")){
			main(args);
		}

		time = (time.length() == 1) ? "00" + time : (time.length() == 2) ? "0" + time : time;
		System.out.println(time.substring(0, time.length() - 2) + ":" + time.substring(time.length() - 2, time.length()));

	}
}