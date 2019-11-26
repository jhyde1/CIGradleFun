import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class FractionTest {

    @Test
    public void testConstructor(){
        Fraction fraction = new Fraction();
        System.out.println(fraction);

        Fraction fraction1 = new Fraction(0, 0);

        Fraction fraction2 = new Fraction( -3, -5);
        System.out.println(fraction2);
    }

    @Test
    public void testToString(){
        Fraction fraction = new Fraction(4, 7);
        assertEquals(fraction.toString(), "4/7");
    }

    @Test
    public void testGetRealValue(){
        Fraction fraction = new Fraction(1,2);
        System.out.println(fraction.getRealValue());
    }

    @Test
    public void testReduce(){
        Fraction fraction = new Fraction(15,25);
        Fraction fraction1 = fraction.reduce(fraction);
        assertEquals(fraction1.toString(), "3/5");
    }

    @Test
    public void testAdd(){
        Fraction fraction = new Fraction(3,4);
        Fraction fraction1 = new Fraction(1, 2);
        System.out.println(fraction.add(fraction1));

        Fraction fraction2 = new Fraction(1, 4);
        System.out.println(fraction.add(fraction2));

        Fraction fraction3 = new Fraction(4, 7);
        Fraction fraction4 = new Fraction(2, 7);
        System.out.println(fraction3.add(fraction4));
        Fraction fraction5 = new Fraction(6, 15);
        System.out.println(fraction3.add(fraction5));

    }

    @Test
    public void testEquals(){
        Fraction fraction = new Fraction(1,2);
        Fraction fraction1 = new Fraction(5, 10);
        if(fraction.equals(fraction1)){
            System.out.println(fraction + " and " + fraction1 + " are equal");
        }
        else{
            System.out.println(fraction + " and " + fraction1 + " are not equal");
        }

        Fraction fraction2 = new Fraction(3, 4);
        if(fraction.equals(fraction2)){
            System.out.println(fraction + " and " + fraction2 + " are equal");
        }
        else{
            System.out.println(fraction + " and " + fraction2 + " are not equal");
        }
    }

    @Test
    public void testCompareTo(){
        Fraction fraction = new Fraction(1,2);
        Fraction fraction1 = new Fraction(3, 4);
        System.out.println(fraction.compareTo(fraction1));
    }
}
