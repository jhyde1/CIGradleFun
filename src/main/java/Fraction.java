public class Fraction {

    int numerator;
    int denominator;

    public Fraction() {
        numerator = 0;
        denominator = 1;
    }

    public Fraction(int numerator, int denominator) {
        if(numerator < 0 & denominator < 0){
            numerator = numerator * -1;
            denominator = denominator * -1;
        }
        if(numerator < Integer.MAX_VALUE & numerator > Integer.MIN_VALUE) {
            this.numerator = numerator;
        }
        else{
            System.out.println("numerator outside of integer valid ranges");
        }
        if(denominator != 0) {
            if(denominator < Integer.MAX_VALUE & denominator > Integer.MIN_VALUE){
                this.denominator = denominator;
            }
        }
        else{
            System.out.println("denominator cannot be zero, initializing to 0/1");
            this.numerator = 0;
            this.denominator = 1;
        }
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    public double getRealValue(){
        double numer = (double) numerator;
        double denom = (double) denominator;
        return numer/denom;
    }

    Fraction reduce(Fraction fraction){
        int remainder = 0;
        int num1 = fraction.numerator;
        int num2 = fraction.denominator;

        while(num2 != 0){
            remainder = num1 % num2;
            num1 = num2;
            num2 = remainder;
        }

        System.out.println("The gcd is " + num1);

        int numer = fraction.numerator / num1;
        int denom = fraction.denominator / num1;
        return new Fraction(numer, denom);
    }

    Fraction add (Fraction fraction){
        if(denominator == fraction.denominator){
            int combinedNumerator = numerator + fraction.numerator;
            return reduce(new Fraction(combinedNumerator, denominator));
        }
        else{
            int firstNumerator = numerator * fraction.denominator;
            int secondNumerator = fraction.numerator * denominator;
            int wholeNumerator = firstNumerator + secondNumerator;
            int wholeDenominator = denominator * fraction.denominator;
            return reduce(new Fraction(wholeNumerator, wholeDenominator));
        }
    }

    boolean equals(Fraction fraction) {
        Fraction callingFraction = reduce(new Fraction(numerator, denominator));
        Fraction paramFraction = reduce(fraction);
        return(callingFraction.numerator == paramFraction.numerator & callingFraction.denominator == paramFraction.denominator);
    }

    int compareTo(Fraction fraction){
        Fraction callingFraction = reduce(new Fraction(numerator, denominator));
        Fraction paramFraction = reduce(fraction);
        if(callingFraction.getRealValue() > paramFraction.getRealValue()){
            return 0;
        }
        else{
            return 1;
        }
    }
}
