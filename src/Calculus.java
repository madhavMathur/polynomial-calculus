
public class Calculus {
	
	public static void main(String[] args) {
		/*
		Differentiation d = new Differentiation();
		System.out.println("\n" + "f'(x): " + d.takeDerivative(d.simpleTerms));
		*/
		
		System.out.println("\n");
		
		Integration i = new Integration();
		System.out.println("\n" + "\u222Bf(x)dx: " + i.takeIntegral(i.simpleTerms));
	}
}
