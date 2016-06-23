
import java.util.ArrayList;
import java.util.Scanner;

public class Differentiation {
	
	ArrayList<Term> terms;
	ArrayList<Term> simpleTerms;
	ArrayList<Term> derivative;
	Scanner in;
	
	public Differentiation() {
		in = new Scanner(System.in);
		terms = new ArrayList<Term>();
		getTerms();
		simpleTerms = simplifyTerms(terms);
	}
	
	public ArrayList<Term> takeDerivative(ArrayList<Term> terms) {
		ArrayList<Term> newList = new ArrayList<Term>();
		for (Term t : terms) {
			newList.add(new Term(t.getCoeff() * t.getExponent(), t.getExponent() - 1));
		}
		newList = removeZeros(newList);
		return newList;
	}
	
	public void getTerms() {
		System.out.println("Enter each term: (Example: 25x^6) and -1 to stop \n");
		String s;
		
		while(true) {
			System.out.print("-->");
			s = in.nextLine();
			if(s.equals("-1")) 
				break;
			double coeff = Double.parseDouble(s.substring(0, s.indexOf("x")));
			double exponent = Double.parseDouble(s.substring(s.indexOf("^") + 1));
			terms.add(new Term(coeff, exponent));
		}
		System.out.print("f(x): " + toString(terms));
	}
	
	public ArrayList<Term> simplifyTerms(ArrayList<Term> al) {
		ArrayList<Term> newList = new ArrayList<Term>();
		for(int i = 0; i < al.size(); i++) {
			double counter;
			double exp = al.get(i).getExponent();
			double coe = al.get(i).getCoeff();
			counter = coe;
			for(int j = i + 1; j < al.size(); j++) {
				if (al.get(j).getExponent() == exp) {
					counter += al.get(j).getCoeff();
					al.remove(j);
				}
			}
			newList.add(new Term(counter, exp));
		}
		return newList;
	}
	
	public ArrayList<Term> removeZeros(ArrayList<Term> terms) {
		ArrayList<Term> newList = new ArrayList<Term>();
		for(Term t : terms) {
			if(!t.toString().equals("0")) {
				newList.add(t);
			}	
		}
		return newList;
	}
	
	public String toString(ArrayList<Term> terms) {
		String s = "";
		for (int i = 0; i < terms.size(); i++) {
			if(i == terms.size() - 1)
				s += terms.get(i);
			else
				s += (terms.get(i) + " + ");
		}
		return s;
	}
}
