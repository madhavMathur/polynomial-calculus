
public class Term {
	
	private double coeff;
	private double exponent;
	
	public Term(double coeff, double exponent) {
		this.coeff = coeff;
		this.exponent = exponent;
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
	
	public double getCoeff() {
		return this.coeff;
	}
	
	public double setCoeff(double newVar) {
		return this.coeff = newVar;
	}
	
	public double getExponent() {
		return this.exponent;
	}
	
	public double setExponent(double newVar) {
		return this.exponent = newVar;
	}
}
