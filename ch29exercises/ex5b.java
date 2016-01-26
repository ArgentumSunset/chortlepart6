import java.util.*;

class DocumentationPrinter2 {

	public static void main (String args[]) {

		Scanner scanner = new Scanner(System.in);
		boolean begin = false;
		
		while ( scanner.hasNextLine() ) { 
			String line = scanner.nextLine();
			String imp = line.substring(0,2);
      		if (imp.equals("//") || imp.equals("") || imp.equals("*/") || begin) { System.out.println(line); }
      		if (imp.equals("/*")) { 
      			System.out.println(line);
      			begin = true;
      		}
      		if(line.substring(line.length() - 2, line.length()).equals("*/")){ begin = false; }

    	}
    	System.out.println("\n");
	}
}