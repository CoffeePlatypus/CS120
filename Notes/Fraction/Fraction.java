public class Fraction {
    private int numerator, denominator;
    public Fraction(int n, int d) {
        numerator=n;
        denominator=d;
    }
    public Fraction add(Fraction f2) {
        return new Fraction(f2.numerator*denominator+numerator*f2.denominator, denominator*f2.denominator);
    }
     public Fraction subtract(Fraction f2) {
        return new Fraction(f2.numerator*denominator-numerator*f2.denominator, denominator*f2.denominator);
    }
    public Fraction mul(Fraction f2) {
        return new Fraction(f2.numerator*numerator, f2.denominator*denominator);
    }
    public Fraction div(Fraction f2) {
        return new Fraction( numerator*f2.denominator, denominator*f2.numerator);
    }
    public String toString(){
        return numerator+"/"+denominator;
    }
    public boolean equals(Object x) {
        //return toString() equals(x.toString()); //What if object x is not an fraction but a string "1/2"?
        // is X a fraction?
        if(x instanceof Fraction) {
            Fraction f=(Fraction)x;  //downcasts x to be a fraction
            return numerator==f.numerator && denominator==f.denominator;
        }else{
            return false;
        }
    }
}
