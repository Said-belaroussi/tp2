import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FractionTest {


    @Test
    public void testSomme() {
        Fraction a = new Fraction(1,3);
        Fraction b = new Fraction(1,2);
        Fraction res = Fraction.somme(a,b);
        assertEquals(5, res.getNumerator());
        assertEquals(6, res.getDenominator());
    }

}