
public class Term {
	
	private int coeff;
	private int exponent;
	
	public Term(int coeff, int exponent) {
		this.coeff = coeff;
		this.exponent = exponent;
	}
	
	public String toString() {
		return new String(coeff+ "x^" + exponent);
	}

	public Term combineLikeTerms(Term t1, Term t2) {
		if (t1.exponent == t2.exponent) {
			Term newTerm = new Term(t1.coeff + t2.coeff, t1.coeff);
			return newTerm;
		} else {
			System.out.println("Unlike terms cannot be combined!");
			return null;
		}
	}
	
	public boolean likeTerms(Term t1, Term t2) {
		if (t1.exponent == t2.exponent) 
			return true;
		return false;
	}
	
	public int getCoeff() {
		return this.coeff;
	}
	
	public int setCoeff(int newVar) {
		return this.coeff = newVar;
	}
	
	public int getExponent() {
		return this.exponent;
	}
	
	public int setExponent(int newVar) {
		return this.exponent = newVar;
	}
}


