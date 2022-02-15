public class Exercice1 {
    public int divisible(int a, int b, int c) {
        if ( a%b == 0 && 0 == a % c) {
            return b+c;
        }
        else if (a%b == 0) {
            return b;
        }
        else if (a%c == 0) {
            return c;
        }
        return 0;
    }
}