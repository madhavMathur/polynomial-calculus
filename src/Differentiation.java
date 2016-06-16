
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
		printTerms(terms);
	}
	
	public void simplifyTerms(ArrayList<Term> al) {
		ArrayList<Term> newList = new ArrayList<Term>();
		for(int i = 0; i < al.size(); i++) {
			int counter;
			int exp = al.get(i).getExponent();
			int coe = al.get(i).getCoeff();
			counter = coe;
			for(int j = i + 1; j < al.size(); j++) {
				if (al.get(j).getExponent() == exp) {
					counter += al.get(j).getCoeff();
					al.remove(j);
				}
			}
			newList.add(new Term(counter, exp));
		}
		printTerms(newList);
	}
	
	public void printTerms(ArrayList<Term> terms) {
		System.out.println("\nTERMS:");
		for (Term t : terms)
			System.out.print(t + " ");
	}
}
