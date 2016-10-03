package Studio1;

public class Fraction {
	private int numerator, denominator;

	public int getNumerator() {
		return numerator;
	}

	public int getDenominator() {
		return denominator;
	}

	public Fraction(int num, int den){
		this.numerator = num;
		this.denominator = den;
	}

	public void add(Fraction f){
		int d = this.denominator;
		
		if(this.denominator != f.denominator){
			this.denominator*=f.denominator;
			this.numerator*=f.denominator;
			f.numerator*=d;
			f.denominator*=d;
		}
		this.numerator+=f.numerator;
	}
	
	public void multiply(Fraction f){
		this.numerator*=f.numerator;
		this.denominator*=f.denominator;
	}

	public void reciprocal(){
		int d = this.denominator;
		this.denominator = this.numerator;
		this.numerator = d;
	}

	public void simplify(){
		for(int i = this.numerator; i <= this.numerator; i++){
			if(this.denominator % i == 0){
				this.denominator/=i;
				this.numerator/=i;
			}
		}
	}

	public void getFraction(){
		System.out.println(this.numerator+"/"+this.denominator);
	}

	public static void main(String[] args){
		Fraction f1 = new Fraction(4, 12);
		Fraction f2 = new Fraction(2, 4);
		
		f1.simplify();
		f1.getFraction();
	}
}
