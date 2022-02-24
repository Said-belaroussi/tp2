public class Fraction {
    int numerator;
    int denominator;
    public Fraction(int a, int b) {
        numerator = a;
        denominator = b;
    }
    static public Fraction somme(Fraction f, Fraction b) {
        int pgcd = pgcd(f.getDenominator(), b.getDenominator());
        Fraction res = new Fraction((f.getNumerator()*pgcd/f.getDenominator()) + (b.getNumerator()*pgcd/b.getDenominator()), pgcd);
        return res;
    }
    public void printFraction() {
        System.out.print("f");
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    private static int pgcd(int n1, int n2){
        int pgcd = 0;
        for(int i=1; i <= n1 && i <= n2; i++) {
            if(n1% i==0 && n2%i==0){
                pgcd = i;
            }
        }
        return pgcd;
    }
}
