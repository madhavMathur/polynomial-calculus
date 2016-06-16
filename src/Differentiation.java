
import java.util.ArrayList;
import java.util.Scanner;

public class Differentiation {
	
	ArrayList<Term> terms;
	ArrayList<Term> simpleTerms;
	Scanner in;
	
	public Differentiation() {
		in = new Scanner(System.in);
		terms = new ArrayList<Term>();
		simpleTerms = new ArrayList<Term>();
	}
	
	public void getTerms() {
		System.out.println("Enter each term: (Example: 25x^6) and -1 to stop \n");
		String s;
		
		while(true) {
			System.out.print("-->");
			s = in.nextLine();
			if(s.equals("-1")) 
				break;
			int coeff = Integer.parseInt(s.substring(0, s.indexOf("x")));
			int exponent = Integer.parseInt(s.substring(s.indexOf("^") + 1));
			terms.add(new Term(coeff, exponent));
			System.out.println(terms.get(terms.size() - 1));
		}
		printTerms();
	}
	
	
	
	public void printTerms() {
		System.out.println("TERMS:");
		for (Term t : terms)
			System.out.print(t + " ");
	}
}
